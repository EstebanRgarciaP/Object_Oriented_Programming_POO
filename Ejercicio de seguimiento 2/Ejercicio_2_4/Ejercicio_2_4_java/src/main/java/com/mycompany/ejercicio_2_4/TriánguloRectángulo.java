/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_4;

/**
 *
 * @author esgar
 */
public class TriánguloRectángulo {
    int base; // Atributo que define la base de un triángulo rectángulo
    int altura; // Atributo que define la altura de un triángulo rectángulo
    /**
    * Constructor de la clase TriánguloRectángulo
    * @param base Parámetro que define la base de un triángulo  
    * rectángulo
    * @param altura Parámetro que define la altura de un triángulo  
    * rectángulo
    */
    public TriánguloRectángulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    /**
    * Método que calcula y devuelve el área de un triángulo rectángulo  
    * como la base multiplicada por la altura sobre 2 
    * @return Área de un triángulo rectángulo
    */
    double calcularArea() {
    return (base * altura / 2);
    }
    /**
    * Método que calcula y devuelve el perímetro de un triángulo  
    * rectángulo como la suma de la base, la altura y la hipotenusa 
    * @return Perímetro de un triángulo rectángulo
    */
    double calcularPerímetro() {
    return (base + altura + calcularHipotenusa()); /* Invoca al 
    método calcular hipotenusa */
    }
    /**
    * Método que calcula y devuelve la hipotenusa de un triángulo  
    * rectángulo utilizando el teorema de Pitágoras 
    * @return Hipotenusa de un triángulo rectángulo
    */
    double calcularHipotenusa() {
    return Math.pow(base*base + altura*altura, 0.5);
    }
    /**
    * Método que determina si un triángulo es:
    * - Equilatero: si sus tres lados son iguales
    * - Escaleno: si sus tres lados son todos diferentes
    * - Escaleno: si dos de sus lados son iguales y el otro es diferente de  
    * los demás
    */
    void determinarTipoTriángulo() {
    if ((base == altura) && (base == calcularHipotenusa()) && (altura 
    == calcularHipotenusa()))
    System.out.println("Es un triángulo equilátero"); /* Todos sus 
    lados son iguales */
    else if ((base != altura) && (base != calcularHipotenusa()) && 
    (altura != calcularHipotenusa()))
    System.out.println("Es un triángulo escaleno"); /* Todos sus 
    lados son diferentes */
    else 
    System.out.println("Es un triángulo isósceles"); /* De otra 
    manera, es isósceles */
    }

}
