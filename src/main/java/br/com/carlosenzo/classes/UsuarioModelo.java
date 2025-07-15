
package br.com.carlosenzo.classes;

public class UsuarioModelo {
    private Usuario user;
    private Modelo modelo;
    
    public UsuarioModelo(Usuario user, Modelo modelo){
        this.user = user;
        this.modelo = modelo;
    }
    
    public Usuario getUsuario(){
        return user;
    }
    
    public Modelo getModelo(){
        return modelo;
    }
    
    public void setModelo(Modelo modelo){
        this.modelo = modelo;
    }
    
    public void setUsuario(Usuario user){
        this.user = user;
    }
}
