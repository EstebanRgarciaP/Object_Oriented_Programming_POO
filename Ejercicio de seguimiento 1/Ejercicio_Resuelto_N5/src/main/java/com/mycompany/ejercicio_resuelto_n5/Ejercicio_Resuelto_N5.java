/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_n5;

/**
 *
 * @author esgar
 */
public class Ejercicio_Resuelto_N5 {

    public static void main(String[] args) {
        double suma, x, y;
        suma =0;
        x =20;
        suma = suma + x;
        y=40;
        x=x+Math.pow(y,2);
        suma = suma + x/y;
        
        System.out.println("El valor de la x es:"+ x);        
        System.out.println("El valor de la y es:"+ y);       
        System.out.println("El valor de la suma es:"+ suma);
    }
}
