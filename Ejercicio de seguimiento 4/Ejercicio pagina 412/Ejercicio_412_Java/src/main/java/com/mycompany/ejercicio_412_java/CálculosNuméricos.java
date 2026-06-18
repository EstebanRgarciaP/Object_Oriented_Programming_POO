/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_412_java;

import java.util.InputMismatchException;
import java.util.*;

/**
 *
 * @author esgar
 */
public class CálculosNuméricos {

    public static String calcularLogaritmoNeperiano(double valor) {

        if (valor < 0) {
            return "Error: El valor debe ser positivo.";
        }

        double resultado = Math.log(valor);
        return "Resultado = " + resultado;
    }

    public static String calcularRaizCuadrada(double valor) {

        if (valor < 0) {
            return "Error: El valor debe ser positivo.";
        }

        double resultado = Math.sqrt(valor);
        return "Resultado = " + resultado;
    }
}