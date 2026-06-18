/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_406_java;

/**
 *
 * @author esgar
 */
import javax.swing.JOptionPane;

public class Vendedor {
    String nombre; 
    String apellido; 
    int edad; 
  
    Vendedor(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    }
    public void imprimir() {
    JOptionPane.showMessageDialog(null,"Nombre Registrada con éxito: "+nombre);
    JOptionPane.showMessageDialog(null,"Apellidos Registrada con éxito: "+apellido);
    JOptionPane.showMessageDialog(null,"la edad del vendedor es: " + edad,"Edad del vendedor",JOptionPane.INFORMATION_MESSAGE);
    }
    public int verificarEdad(int edad) {
        
        if (edad < 18) { 
            JOptionPane.showMessageDialog(null,"El vendedor debe ser mayor de 18 años.",
                    "Error de validacion de edad",JOptionPane.WARNING_MESSAGE);
             return -1 ;
        } 
        else if (edad >= 18 && edad < 120) { 
        this.edad = edad;
        JOptionPane.showMessageDialog(null,"edad Registrada con éxito: "+edad);
        
        return edad;
        }
        else{
        JOptionPane.showMessageDialog(null,"La edad No puede ser negativa ni mayor a 120",
        "Error de Rango",JOptionPane.WARNING_MESSAGE);
        return -1;
        }
    }

} 