/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interes;

/**
 *
 * @author kevin
 */
public class Redsocial extends Interes implements Ilike{
    private String nombreRedScocial;

    public Redsocial() {
        super();
    }

    public Redsocial(String nombreRedScocial, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.nombreRedScocial = nombreRedScocial;
    }

  

    public String getNombreRedScocial() {
        return nombreRedScocial;
    }

    public void setNombreRedScocial(String nombreRedScocial) {
        this.nombreRedScocial = nombreRedScocial;
    }

    @Override
    public String toString() {
        return "Redsocial{" + "nombreRedScocial=" + nombreRedScocial + '}'+" "+super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario"+super.getUsuario());
        System.out.println("redsocial:"+this.getNombreRedScocial());
    }

     @Override
    public void likes() {
        System.out.println("Likes:"+super.getLike());
        System.out.println("tiempo conectado:"+super.getTiempoConectado());
    }

}
