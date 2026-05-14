/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2_5;

/**
 *
 * @author esgar
 */
public class Ejercicio_2_5 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Perez",123456789,CuentaBancaria.tipo.AHORROS);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
    }
}
