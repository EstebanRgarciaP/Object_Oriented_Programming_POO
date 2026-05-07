/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2_1;

/**
 *
 * @author esgar
 */
import java.util.Scanner;

public class Ejercicio_2_1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea registrar? ");
        int cantidad = lector.nextInt();
        
        // Limpiar el buffer (importante después de nextInt)
        lector.nextLine(); 

        // Ciclo para capturar los datos de cada persona
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\n--- Datos de la Persona " + i + " ---");
            
            System.out.print("Nombre: ");
            String nom = lector.nextLine();

            System.out.print("Apellidos: ");
            String ape = lector.nextLine();

            System.out.print("Número de documento: ");
            String doc = lector.nextLine();

            System.out.print("Año de nacimiento: ");
            int año = lector.nextInt();
            
            // Limpiar el buffer para la siguiente vuelta del ciclo
            lector.nextLine(); 

            // Crear el objeto e imprimir sus datos de inmediato
            Persona p = new Persona(nom, ape, doc, año);
            p.imprimir();
        }

        System.out.println("\nRegistro finalizado.");
        lector.close();
    }
}