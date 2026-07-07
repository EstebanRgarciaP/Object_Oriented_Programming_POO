/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_5;

/**
 *
 * @author esgar
 */
public class Contacto {

    private String nombre;
    private String numero;

    /**
     * Constructor vacío.
     */
    public Contacto() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del contacto.
     * @param numero Número telefónico del contacto.
     */
    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return Nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del contacto.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número telefónico.
     *
     * @return Número.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Asigna el número telefónico.
     *
     * @param numero Nuevo número.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Devuelve la representación del contacto.
     * Este método es utilizado automáticamente por el JList.
     *
     * @return Nombre del contacto.
     */
    @Override
    public String toString() {
        return nombre;
    }

    /**
     * Convierte el contacto al formato utilizado para guardar en el archivo.
     *
     * Formato:
     * Nombre!Numero
     *
     * @return Cadena lista para guardar.
     */
    public String guardarEnArchivo() {
        return nombre + "!" + numero;
    }

    /**
     * Crea un objeto Contacto a partir de una línea del archivo.
     *
     * @param linea Línea leída del archivo.
     * @return Contacto creado o null si la línea es inválida.
     */
    public static Contacto desdeArchivo(String linea) {

        if (linea == null || linea.trim().isEmpty()) {
            return null;
        }

        String[] datos = linea.split("!");

        if (datos.length != 2) {
            return null;
        }

        return new Contacto(datos[0], datos[1]);
    }

}
