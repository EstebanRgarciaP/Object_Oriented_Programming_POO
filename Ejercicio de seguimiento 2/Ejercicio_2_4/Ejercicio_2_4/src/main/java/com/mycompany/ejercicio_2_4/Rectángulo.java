/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_4;

/**
 *
 * @author esgar
 */
public class Rectángulo {
    int base; // Atributo que define la base de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo
    /**
    * Constructor de la clase Rectangulo
    * @param base Parámetro que define la base de un rectángulo
    * @param altura Parámetro que define la altura de un rectángulo
    */
    Rectángulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    /**
    * Método que calcula y devuelve el área de un rectángulo como la
    * multiplicación de la base por la altura 
    * @return Área de un rectángulo
    */
    double calcularArea() {
    return base * altura;
    }
    /**
    * Método que calcula y devuelve el perímetro de un rectángulo 
    * como (2 * base) + (2 * altura) 
    * @return Perímetro de un rectángulo
    */
    double calcularPerímetro() {
    return (2 * base) + (2 * altura);
    }
}
