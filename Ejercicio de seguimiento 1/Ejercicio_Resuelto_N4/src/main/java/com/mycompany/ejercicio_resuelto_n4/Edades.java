/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_resuelto_n4;

/**
 *
 * @author esgar
 */
public class Edades {
    
public static double Calcular_edadber(double edjuan){
    /**Metodo que viene y retoma como parametro la edad de juan
    *y permite que se haga el calculo de la edad de juan luego de la edad de
    * alber
    
    */
    double edalber= 2 * edjuan/3;
    return edalber;
    }
public static double Calcular_edana(double edjuan){
    /**Metodo que calcula la edad de ana teniendo como parametro la edad de juan 
    */
    double edana= 4*edjuan/3;
    return edana;
    }           
public static double Calcular_edmama(double edjuan,double edalber,double edana){
    /**Metodo que realisa la suma de las edades y retorna la edad de la mama 
    */
    double edmama= edjuan + edalber + edana;
    return edmama;
    }       
        
}
