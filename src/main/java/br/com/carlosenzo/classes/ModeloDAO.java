
package br.com.carlosenzo.classes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ModeloDAO {
    
    public void adicionar(Modelo modelo){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(modelo);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
    
    public void excluir(int id){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            Modelo model = em.find(Modelo.class, id);
            if(model != null){
                em.getTransaction().begin();
                em.remove(model);
                em.getTransaction().commit();
            }
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
    
    public String pagarEcancelar(int escolha, int id){
        EntityManager em = JPAUtil.getEntityManager();
        String choose;
        try{
            switch(escolha){
                case JOptionPane.YES_OPTION:
                     choose = "Confirmado";
                    JOptionPane.showMessageDialog(null,"Pagamento via Pix\n\nChave Pix: ce.invencoes.3d@gmail.com\n\nApós concluir o pagamento, pressione o botão 'Ok' para continuar.");
                    
                    String sqlo = "UPDATE Modelo m SET m.pagamento = :pagamento WHERE m.id = :id";
                    em.getTransaction().begin();
                    Query consulta = em.createQuery(sqlo);
                    consulta.setParameter("id", id);
                    consulta.setParameter("pagamento", choose);
                    consulta.executeUpdate();
                    em.getTransaction().commit();
                    break;
                case JOptionPane.NO_OPTION:
                    choose = "Interrompido";
                    String sql1 = "UPDATE Modelo m SET m.pagamento = :pagamento WHERE m.id = :id";
                    em.getTransaction().begin();
                    Query consultal = em.createQuery(sql1);
                    consultal.setParameter("id", id);
                    consultal.setParameter("pagamento", choose);
                    consultal.executeUpdate();
                    em.getTransaction().commit();
                    break;
                default:
                    choose = "Pendente";
            }
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
        
        return choose;
    }
    
    public void mudarPreco(String mensagem, String preco, byte[] arquivo, String tipo){
        EntityManager em = JPAUtil.getEntityManager();
        String sql = "UPDATE Modelo m SET m.preco = :preco WHERE m.mensagem = :mensagem AND m.arquivo = :arquivo AND m.tipo = :tipo";
        try{
            em.getTransaction().begin();
            Query consulta = em.createQuery(sql);
            consulta.setParameter("preco", preco);
            consulta.setParameter("mensagem", mensagem);
            consulta.setParameter("arquivo", arquivo);
            consulta.setParameter("tipo", tipo);
            consulta.executeUpdate();
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
    }
    
    public List<Modelo> listAllModels(Usuario user){
        EntityManager em = JPAUtil.getEntityManager();
        List<Modelo> modelos = null;
        String sql = "SELECT m FROM Modelo m WHERE m.usuario_id = :usuario_id";
        try{
            em.getTransaction().begin();
            Query consulta = em.createQuery(sql);
            consulta.setParameter("usuario_id", user.getId());
            modelos = consulta.getResultList();
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
        return modelos;
    }
    
    public List<Modelo> listModeloSearch(Usuario user,String nome){
        EntityManager em = JPAUtil.getEntityManager();
        List<Modelo> modelos = null;
        String sql = "SELECT m FROM Modelo m WHERE m.mensagem LIKE :nome AND m.usuario_id = :usuario_id";
        try{
            em.getTransaction().begin();
            Query consulta = em.createQuery(sql);
            consulta.setParameter("nome", "%" + nome + "%");
            consulta.setParameter("usuario_id", user.getId());
            modelos = consulta.getResultList();
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
        return modelos;
    }
    
    public List<UsuarioModelo> listarTodosPedidos(){
        EntityManager em = JPAUtil.getEntityManager();
        List<UsuarioModelo> listape = new ArrayList<>();
        String sql = "SELECT u.id,u.nome , u.cpf, u.email, u.endereco, m.mensagem , m.arquivo, m.tipo, m.preco, m.pagamento FROM Usuario u INNER JOIN Modelo m ON u.id = m.usuario_id";
        try{
            em.getTransaction().begin();
            Query consulta = em.createNativeQuery(sql);
            List<Object[]> resultados = consulta.getResultList();
            for(Object[] linha : resultados){
                Usuario usuario = new Usuario();
                usuario.setId((int) linha[0]);
                usuario.setNome((String) linha[1]);
                usuario.setCpf((String) linha[2]);
                usuario.setEmail((String) linha[3]);
                usuario.setEndereco((String) linha[4]);
                
                Modelo model = new Modelo();
                model.setMensagem((String) linha[5]);
                model.setArquivo((byte[]) linha[6]);
                model.setTipo((String) linha[7]);
                model.setPreco((String) linha[8]);
                model.setPagamento((String) linha[9]);
                
                listape.add(new UsuarioModelo(usuario, model));
            }
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            JPAUtil.closeEntityManager();
        }
        return listape;
    }
    
}
