/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8_3_java;

/**
 *
 * @author esgar
 */
public class FiguraGeométrica {
    private double volumen; /* Atributo que identifica el volumen de una figura geométrica */
    private double superficie; /* Atributo que identifica la superficie de una figura geométrica */
    
    /**
    * Método para establecer el volumen de una figura geométrica
    * @param volumen Parámetro que define el volumen de una figura  
    * geométrica
    */
    public void setVolumen(double volumen) {
    this.volumen = volumen;
    }
    /**
    * Método para establecer la superficie de una figura geométrica
    * @param superficie Parámetro que define la superficie de una  
    * figura geométrica
    */
    public void setSuperficie(double superficie) {
    this.superficie = superficie;
    }
    /**
    * Método para obtener el volumen de una figura geométrica
    * @return El volumen de una figura geométrica
    */
    public double getVolumen() {
    return this.volumen;
    }
    /**
    * Método para obtener la superficie de una figura geométrica
    * @return La superficie de una figura geométrica
    */
    public double getSuperficie() {
    return this.superficie;
    }
 }
