/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_127_java;

/**
 *
 * @author esgar
 */
public class Ejercicio_127_java {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        pedido1.calcularPedido("Sanchocho", 5000, "Gaseosa", 2000);
        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido("Crema de verduras", 5000,
                "Churrasco",6000, "Gaseosa", 2000);
        Pedido pedido3 = new Pedido();
        pedido3.calcularPedido("Crema de espinicas", 
                5000, "Salmón", 10000, "Tiramisú", 5000,"Gaseosa", 2000);
    }
}
