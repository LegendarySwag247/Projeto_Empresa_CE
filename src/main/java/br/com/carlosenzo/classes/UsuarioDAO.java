
package br.com.carlosenzo.classes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class UsuarioDAO {
    
    public Usuario entrar(String login, String senha) {
        EntityManager em = JPAUtil.getEntityManager();
        String sql = "SELECT u FROM Usuario u WHERE (u.login = :login OR u.email = :email) AND u.senha = MD5(:senha)";
        Usuario usuario = null;
        try {
            Query consulta = em.createQuery(sql);
            em.getTransaction().begin();
            
            consulta.setParameter("login", login);
            consulta.setParameter("email", login);
            consulta.setParameter("senha", senha);
            
            usuario = (Usuario) consulta.getSingleResult();
            
            em.getTransaction().commit();
            
        } catch (NoResultException e) {
            usuario = null;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEntityManager();
        }
        return usuario;
    }
    
    public void cadastrar(Usuario user){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            String senhaCriptografada = tradutorMD5(user.getSenha());
            user.setSenha(senhaCriptografada);
        
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
    
    public void atualizar(Usuario user, String nome, String email, String endereco, byte[] image){
        EntityManager em = JPAUtil.getEntityManager();
        String sql = "UPDATE Usuario u SET u.nome = :nome, u.email = :email, u.endereco = :endereco, u.image = :image WHERE u.id = :id";
        try{
            em.getTransaction().begin();
            Query consulta = em.createQuery(sql);
            consulta.setParameter("nome", nome);
            consulta.setParameter("email", email);
            consulta.setParameter("endereco", endereco);
            consulta.setParameter("image", image);
            consulta.setParameter("id", user.getId());
            consulta.executeUpdate();
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
    
    public String tradutorMD5(String senha){
        String senhamd = ".";
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] digest = md.digest();
            BigInteger no = new BigInteger(1, digest);
            senhamd = String.format("%032x", no);
        }catch(NoSuchAlgorithmException e){
            throw new RuntimeException("Erro ao criptografar senha em MD5", e);
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        return senhamd;
    }
    
    
}
