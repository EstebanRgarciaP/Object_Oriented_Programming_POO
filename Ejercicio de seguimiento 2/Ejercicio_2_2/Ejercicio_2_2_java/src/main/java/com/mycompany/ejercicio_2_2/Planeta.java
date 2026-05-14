/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_2;

/**
 *
 * @author esgar
 */
public class Planeta {
    String nombre = null;
    int cantidadSatélites = 0;
    double masa = 0;
    double volumen = 0;
    int diámetro = 0;
    int distanciaSol = 0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    tipoPlaneta tipo;
    boolean esObservable = false;
   
    Planeta(String nombre, int cantidadSatélites, double masa, double 
    volumen, int diámetro, int distanciaSol, tipoPlaneta tipo, boolean 
    esObservable) {
    this.nombre = nombre;
    this.cantidadSatélites = cantidadSatélites;
    this.masa = masa;
    this.volumen = volumen;
    this.diámetro = diámetro;
    this.distanciaSol = distanciaSol;
    this.tipo = tipo;
    this.esObservable = esObservable;
    }
    void imprimir() {
    System.out.println("Nombre del planeta = " + nombre);
    System.out.println("Cantidad de satélites = " + cantidadSatélites);
    System.out.println("Masa del planeta = " + masa);
    System.out.println("Volumen del planeta = " + volumen);
    System.out.println("Diámetro del planeta = " + diámetro);
    System.out.println("Distancia al sol = " + distanciaSol);
    System.out.println("Tipo de planeta = " + tipo);
    System.out.println("Es observable = " + esObservable);
    }
    double calcularDensidad() {
    return masa/volumen;
    }
    boolean esPlanetaExterior(){
    float límite = (float) (149597870 * 3.4);
    if (distanciaSol > límite) {
    return true;
    } else {
    return false;
    }
    }
}
