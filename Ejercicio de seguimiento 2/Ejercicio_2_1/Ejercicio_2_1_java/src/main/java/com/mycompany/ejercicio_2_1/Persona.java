/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_1;

/**
 *
 * @author esgar
 */
public class Persona {
    String nombre; // Atributo que identifica el nombre de una persona
    String apellidos; // Atributo que identifica los apellidos de una persona       
    String númeroDocumentoIdentidad; /* Atributo que identifica el número de documento de identidad de 
    una persona */
    int añoNacimiento; /* Atributo que identifica el año de nacimiento 
    de una persona */
    /**
    * Constructor de la clase Persona
    * @param nombre Parámetro que define el nombre de la persona
    * @param apellidos Parámetro que define los apellidos de la persona
    * @param númeroDocumentoIdentidad Parámetro que define el  
    * número del documento de identidad de la persona
    * @param añoNacimiento Parámetro que define el año de nacimiento  
    * de la persona
    */
    Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, 
            int añoNacimiento) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
    this.añoNacimiento = añoNacimiento;
    }
    /**
    * Método que imprime en pantalla los datos de una persona
    */
    void imprimir() {
    System.out.println("Nombre ="+ nombre);
    System.out.println("Apellidos = " + apellidos);
    System.out.println("Número de documento de identidad ="+númeroDocumentoIdentidad);
    System.out.println("Año de nacimiento =" + añoNacimiento);
    System.out.println();
    }
    }
