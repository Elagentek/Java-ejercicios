/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interes;

/**
 *
 * @author kevin
 */
public class Musica extends Interes implements Ilike{//extendimos las clase con extends
    private String tipoMusica;

    public Musica() {
        super(); //sobre cargar metodos contructores 
    }
 //ahora elejimos el segundo contructor con parametros 

    public Musica(String tipoMusica, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.tipoMusica = tipoMusica;
    }
 
    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override//metodo listar 
    public String toString() {
        return "Musica{" + "tipoMusica=" + tipoMusica + '}'+""+super.toString();//llamamos al super.toString()
    }

    //crear metodo listar pero se acepta el tostring
    public void listarMusica()
    {
        System.out.println("Usuario:"+super.getUsuario());
        System.out.println("tiempo conectado:"+super.getTiempoConectado());
        System.out.println("tipo musica :"+this.getTipoMusica());//aqui se coloca this porque asiganmos algo 
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario"+super.getUsuario());//llamamos al  usuario con  get
        System.out.println("tipo musica:"+this.getTipoMusica());//asignamos que esto sera o devolvera tipo de musica this.get
    }

    @Override
    public void likes() {
        System.out.println("Likes:"+super.getLike());
        System.out.println("tiempo conectado:"+super.getTiempoConectado());
    }

    
}
