
package br.com.carlosenzo.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import javax.swing.ImageIcon;

@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome, cpf,login, senha, tipo, email, endereco;
    private byte[] image;
    
    public Usuario(){
    }
    
    public Usuario(/*int id,*/String nome, String cpf, String login, String senha, String tipo, String email, String endereco){
        //this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
        this.email = email;
        this.endereco = endereco;
    }
    
    // funcoes get...
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
    
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEmail() {
        return email;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public byte[] getImagem(){
        return image;
    }

    //funcoes set...
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setImagem(byte[] image){
        this.image = image;
    }
    
}
