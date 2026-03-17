/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_n12;

/**
 *
 * @author esgar
 */
public class Ejercicio_Resuelto_N12 {

    public static void main(String[] args) {
        double HorasTrabajadas = 48;
        double Valorhora = 5000;
        //double retencion = 12.5;
        double retencion_Fuente = 12.5/100;
        double salario_bruto,Valor_retencion,salario_neto;

        salario_bruto=Nomina.salario_bruto(HorasTrabajadas, Valorhora); 
        Valor_retencion=Nomina.Valor_retencion(salario_bruto, retencion_Fuente);
        salario_neto=Nomina.salario_neto(salario_bruto, Valor_retencion);

        System.out.println("El valor del Salario Bruto del empleado es "+salario_bruto);
        System.out.println("El valor de retención en la fuente es de "+Valor_retencion);
        System.out.println("El Salario neto del empleado Es de "+salario_neto);
        
    }
}
