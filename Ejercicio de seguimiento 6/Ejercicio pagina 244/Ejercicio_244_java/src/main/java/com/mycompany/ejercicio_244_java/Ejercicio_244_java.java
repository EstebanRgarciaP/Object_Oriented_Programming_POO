/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_244_java;

/**
 *
 * @author esgar
 */
public class Ejercicio_244_java {

    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
       animales[0]=new Gato();
       animales[1]=new Perro();
       animales[2]=new Lobo();
       animales[3]=new León();
       
       for (int i=0;i<animales.length;i++){
       
           System.out.println(animales[i].getNombreCientífico());
           System.out.println("Sonido"+animales[i].getSonido());
           System.out.println("Alimentos"+animales[i].getAlimentos());
           System.out.println("Hábitad"+animales[i].getHábitat());
           System.out.println();
       }
    }
}
