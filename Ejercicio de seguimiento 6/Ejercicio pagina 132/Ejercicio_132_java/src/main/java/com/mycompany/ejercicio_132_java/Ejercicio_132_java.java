/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_132_java;

/**
 *
 * @author esgar
 */
public class Ejercicio_132_java {

    public static void main(String[] args) {
        String[] palabras = {"Física","Espacio","Tiempo"};
    ArtículoCientífico artículo = new ArtículoCientífico("La teoría especial de la relatividad",
            "Albert Einstein",palabras,"Anales de Física",
            1913,"Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
        artículo.imprimir();


    };
}

