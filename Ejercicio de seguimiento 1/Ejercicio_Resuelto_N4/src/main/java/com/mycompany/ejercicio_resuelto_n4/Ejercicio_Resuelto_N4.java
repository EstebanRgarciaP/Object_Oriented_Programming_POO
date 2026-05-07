/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_n4;

/**
 *
 * @author esgar
 */
public class Ejercicio_Resuelto_N4 {

    public static void main(String[] args) {
       double edalber, edana, edmama;
       double edjuan = 9;
       edalber=Edades.Calcular_edadber(edjuan);
       edana= Edades.Calcular_edana(edjuan);
       edmama=Edades.Calcular_edmama(edjuan, edalber, edana);
       System.out.println("Las edades son; Alberto = " + edalber + 
               " juan = " + edjuan + " Ana = "+ edana + " Mama = "+ edmama);
    }
}
