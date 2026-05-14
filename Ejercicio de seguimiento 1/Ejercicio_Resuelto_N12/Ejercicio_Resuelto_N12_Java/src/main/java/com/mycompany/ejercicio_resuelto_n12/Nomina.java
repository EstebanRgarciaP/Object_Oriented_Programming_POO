/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_resuelto_n12;

/**
 *
 * @author esgar
 */
public class Nomina {

public static double salario_bruto(double HorasTrabajadas,double Valorhora){
return HorasTrabajadas * Valorhora;

}
public static double Valor_retencion(double salario_bruto,double retencion_Fuente){

return salario_bruto*retencion_Fuente;

}
public static double salario_neto(double salario_bruto,double Valor_retencion){

return salario_bruto-Valor_retencion;

}
}
