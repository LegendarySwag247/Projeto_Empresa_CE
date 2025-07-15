
package br.com.carlosenzo.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int usuario_id;
    private String mensagem, preco, pagamento, tipo;
    private byte[] arquivo;
    
    public Modelo(){
    }
    
    public Modelo(/*int id,*/int usuario_id, String mensagem, String preco, String pagamento, byte[] arquivo, String tipo){
        this.usuario_id = usuario_id;
        this.mensagem = mensagem;
        this.preco = preco;
        this.pagamento = pagamento;
        this.arquivo = arquivo;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuario_id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getPreco() {
        return preco;
    }

    public String getPagamento() {
        return pagamento;
    }

    public byte[] getArquivo() {
        return arquivo;
    }
    
    public String getTipo(){
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuarioId(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public void setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    
}
