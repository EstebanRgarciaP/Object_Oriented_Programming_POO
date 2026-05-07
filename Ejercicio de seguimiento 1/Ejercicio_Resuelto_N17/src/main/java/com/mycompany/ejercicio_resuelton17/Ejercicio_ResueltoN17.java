/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelton17;

/**
 *
 * @author esgar
 */

import java.util.Scanner;
public class Ejercicio_ResueltoN17 {

    public static void main(String[] args) {
        double r;
        double Area,Longitud;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor del radio r ");
        r=Entrada.nextDouble();
        
        Area = Operacion.area(r);
        Longitud = Operacion.Longitud(r);
        
        
        System.out.println("El area de la circuferencia de radio "+ r + " Es "+ Area);
        System.out.println("La longitud de la circuferencia de radio "+ r + " Es "+ Longitud);
    }
}
