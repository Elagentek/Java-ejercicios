/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interes;

/**
 *
 * @author kevin
 */
public class Principal {
    public static void main(String[] args) {
        //CREAMOS LOS OBJETOS 
        
        Musica musc = new Musica("rock", "kevin", "adm", 200, 5);
        Pelicula peli = new Pelicula("suspenso", "kaime", "coto", 300, 29);
        Redsocial red = new Redsocial("insta", "", "123", 100, 40);
        
        Coleccion col = new  Coleccion();
        col.agregarInteres(musc);
        col.agregarInteres(peli);
        col.agregarInteres(red);
        
        col.listarInterese();
        
        col.masLikes();
        
        
    }
}
