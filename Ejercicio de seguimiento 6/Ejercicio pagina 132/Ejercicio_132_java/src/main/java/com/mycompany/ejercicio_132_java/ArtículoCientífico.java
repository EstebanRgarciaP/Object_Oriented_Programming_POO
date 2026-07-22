/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_132_java;

/**
 *
 * @author esgar
 */
public class ArtículoCientífico {
    
    String título;
    String autor;
    String[]palabrasClaves = new String[3];
    String publicación;
    int año;
    String resumen;
    
    public ArtículoCientífico(String título, String autor) {
        this.título = título;
        this.autor = autor;
        }
    
    public ArtículoCientífico(String título, String autor, String[] palabrasClaves,
            String publicación, int año) {
        this(título, autor);
        this.palabrasClaves = palabrasClaves;
        this.publicación = publicación;
        this.año = año;
        }  
    
    public ArtículoCientífico(String título, String autor, String[] palabrasClaves, 
            String publicación, int año, String resumen) {
        this(título, autor, palabrasClaves, publicación, año);
        this.resumen = resumen;
        }
    
    public void imprimir(){
        System.out.println("Título del artículo = " + título);
        System.out.println("Autor del artículo = " + autor);
        System.out.println("Palabras clave = ");
       // Recorre el array para imprimir cada palabra clave
        for (int i = 0; i < palabrasClaves.length; i++) {
        System.out.println(palabrasClaves[i]);
        }
        System.out.println("Publicación = " + publicación);
        System.out.println("Año = " + año);
        System.out.println("Resumen = " + resumen);
    
    
    }

}
