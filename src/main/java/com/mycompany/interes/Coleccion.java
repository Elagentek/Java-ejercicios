/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interes;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Coleccion {
    private ArrayList<Interes>listaIntereses;
    
    public Coleccion()
    {
        listaIntereses = new ArrayList<>();
    }
    
    public boolean agregarInteres(Interes interes)
    {
        return listaIntereses.add(interes);
    }
    
    public void listarInterese()
    {
        for (Interes Interes: listaIntereses) {
            System.out.println(Interes);
        }
    }
    
    
    public void masLikes()
    {
        int mayor=0;
        
        String mayorinteres="";
        for (Interes Interes : listaIntereses) {
            if (Interes.getLike() > mayor) {
                mayor=Interes.getLike();
                mayorinteres = Interes.getClass().getName();
            }
        }
        System.out.println("el mayor interes es : "+ mayorinteres);
        
    } 
    
    
}
