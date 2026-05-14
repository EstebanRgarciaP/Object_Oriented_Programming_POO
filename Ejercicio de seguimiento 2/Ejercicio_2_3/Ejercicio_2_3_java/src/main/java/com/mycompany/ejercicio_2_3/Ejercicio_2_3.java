/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2_3;

/**
 *
 * @author esgar
 */
public class Ejercicio_2_3 {

    public static void main(String[] args) {
        Automóvil auto1 = new 
        Automóvil("Ford",2018,3,Automóvil.tipoCom.DIESEL,Automóvil.tipoA.EJECUTIVO,5,6,250,Automóvil.tipoColor.NEGRO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
        }
    }

