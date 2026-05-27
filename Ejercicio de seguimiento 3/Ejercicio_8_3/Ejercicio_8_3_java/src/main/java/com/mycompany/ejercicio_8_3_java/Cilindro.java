/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8_3_java;

/**
 *
 * @author esgar
 */
public class Cilindro extends FiguraGeométrica {
    private double radio; // Atributo que establece el radio de un cilindro
    private double altura; // Atributo que establece la altura de un cilindro
    /**
    * Constructor de la clase Cilindro
    * @param radio Parámetro de define el radio de un cilindro
    * @param altura Parámetro de define la altura de un cilindro
    */
   public Cilindro(double radio, double altura) {
    this.radio = radio;
    this.altura = altura;
    this.setVolumen(calcularVolumen()); /* Calcula el volumen y 
    establece su atributo */
    this.setSuperficie(calcularSuperficie()); /* Calcula la superficie y 
    establece su atributo */
   }
   /**
   * Método para calcular el volumen de un cilindro
   * @return El volumen de un cilindro
   */
   public double calcularVolumen() {
    double volumen = Math.PI * altura * Math.pow(radio, 2.0);
    return volumen;
   }
   /**
   * Método para calcular la superficie de un cilindro
   * @return La superficie de un cilindro
   */
   public double calcularSuperficie() {
    double áreaLadoA = 2.0 * Math.PI * radio * altura;
    double áreaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
    return áreaLadoA + áreaLadoB;
   }
}

