/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interes;

/**
 *
 * @author kevin
 */
public abstract class Interes {

    protected String usuario,password;
    protected int tiempoConectado,like;

    public Interes() {
    }

    public Interes(String usuario, String password, int tiempoConectado, int like) {
        this.usuario = usuario;
        this.password = password;
        this.tiempoConectado = tiempoConectado;
        this.like = like;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(int tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Interes{" + "usuario=" + usuario +  ", tiempoConectado=" + tiempoConectado + ", like=" + like + '}';
    }

   

 
    
    public abstract void visualizar(); //el metodo lo acabo de declarar pero no existe existe en las subclases 
   //cuando la clase es abstracta no se puede crear un objeto de ella 
}
