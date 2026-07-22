/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_244_java;

/**
 *
 * @author esgar
 */
public class Perro extends Cánido {
    
     @Override
     public String getSonido(){
     return "Ladrido";
     }

     @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

     @Override
    public String getHábitat() {
        return "Doméstico";
    }

     @Override
    public String getNombreCientífico() {
        return "Canus lupus familiaris";
    }
     
     
}
