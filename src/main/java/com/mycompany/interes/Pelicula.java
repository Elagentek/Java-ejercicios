/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interes;

/**
 *
 * @author kevin
 */
public class Pelicula extends Interes implements Ilike{
    private String genero;

    public Pelicula() {
        super();
    }

    public Pelicula(String genero, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.genero = genero;
    }

   

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "genero=" + genero + '}'+" "+ super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario"+super.getUsuario());
        System.out.println("genero de pelicula:"+this.getGenero());
    }

     @Override
    public void likes() {
        System.out.println("Likes:"+super.getLike());
        System.out.println("tiempo conectado:"+super.getTiempoConectado());
    }

    
}
