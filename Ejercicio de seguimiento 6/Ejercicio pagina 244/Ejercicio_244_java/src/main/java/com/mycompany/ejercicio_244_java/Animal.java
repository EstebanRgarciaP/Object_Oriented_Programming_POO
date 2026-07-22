/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_244_java;

/**
 *
 * @author esgar
 */
public abstract class Animal {
    
    protected String sonido;/*Atributo que identifica el sonido emitido por un animal*/
    
    protected String alimentos;/*Atributo que identifica los alimentos que consume un animal*/
    
    protected String hábitat;/*Atributo que identifica el hábitat de un animal*/
    
    protected String nombreCientífico;/*Atributo que identifica el nombre científico de un animal*/

    /**
    * Método abstracto que permite obtener el nombre científico del animal
    * @return El nombre científico del animal
    */

    public abstract String getNombreCientífico();

    public abstract String getSonido();
    
    public abstract String getAlimentos();
    
    public abstract String getHábitat();
    
}
