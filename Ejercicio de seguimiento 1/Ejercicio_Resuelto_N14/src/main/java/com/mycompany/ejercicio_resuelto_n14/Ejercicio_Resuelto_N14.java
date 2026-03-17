/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_n14;

/**
 *
 * @author esgar
 */

import java.util.Scanner;

public class Ejercicio_Resuelto_N14 {

    public static void main(String[] args) {
        float x;
        double cuadrado,cubo;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor del Numero X ");
        x=Entrada.nextFloat();
        
        cuadrado = Operacion.Cuadrado(x);
        cubo =Operacion.Cubo(x);
        
        System.out.println("El cuadrado del numero "+x+" Es "+cuadrado);
        System.out.println("El cubo del numero "+x+" es "+cubo);
    }
}
