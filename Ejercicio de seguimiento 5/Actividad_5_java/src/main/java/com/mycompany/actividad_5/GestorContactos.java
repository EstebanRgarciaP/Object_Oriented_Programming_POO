/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de administrar los contactos.
 *
 * @author esgar
 */
public class GestorContactos {

    private ArrayList<Contacto> contactos;
    private File archivo;

    public GestorContactos() {

        contactos = new ArrayList<>();

        archivo = new File("contacts.txt");

        try {

            if (!archivo.exists()) {
                archivo.createNewFile();
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        cargarContactos();

    }

    /**
     * Devuelve todos los contactos.
     */
    public ArrayList<Contacto> obtenerContactos() {
        return contactos;
    }

    /**
     * Agrega un nuevo contacto.
     */
    public boolean agregarContacto(Contacto contacto) {

        if (contacto == null) {
            return false;
        }

        if (contacto.getNombre().trim().isEmpty()) {
            return false;
        }

        if (contacto.getNumero().trim().isEmpty()) {
            return false;
        }

        if (existeNombre(contacto.getNombre())) {
            return false;
        }

        contactos.add(contacto);

        guardarContactos();

        return true;

    }

    /**
     * Actualiza un contacto.
     */
    public boolean actualizarContacto(int indice, Contacto contacto) {

        if (indice < 0 || indice >= contactos.size()) {
            return false;
        }

        contactos.set(indice, contacto);

        guardarContactos();

        return true;

    }

    /**
     * Elimina un contacto.
     */
    public boolean eliminarContacto(int indice) {

        if (indice < 0 || indice >= contactos.size()) {
            return false;
        }

        contactos.remove(indice);

        guardarContactos();

        return true;

    }

    /**
     * Busca un contacto por nombre.
     */
    public int buscarContacto(String nombre) {

        for (int i = 0; i < contactos.size(); i++) {

            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {

                return i;

            }

        }

        return -1;

    }

    /**
     * Verifica si ya existe un nombre.
     */
    public boolean existeNombre(String nombre) {

        for (Contacto contacto : contactos) {

            if (contacto.getNombre().equalsIgnoreCase(nombre)) {

                return true;

            }

        }

        return false;

    }

    /**
     * Obtiene un contacto.
     */
    public Contacto obtenerContacto(int indice) {

        if (indice < 0 || indice >= contactos.size()) {

            return null;

        }

        return contactos.get(indice);

    }

    /**
     * Guarda los contactos en el archivo.
     */
    public void guardarContactos() {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));

            for (Contacto contacto : contactos) {

                bw.write(contacto.guardarEnArchivo());
                bw.newLine();

            }

            bw.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    /**
     * Carga los contactos desde el archivo.
     */
    public final void cargarContactos() {

        contactos.clear();

        try {

            BufferedReader br = new BufferedReader(new FileReader(archivo));

            String linea;

            while ((linea = br.readLine()) != null) {

                Contacto contacto = Contacto.desdeArchivo(linea);

                if (contacto != null) {

                    contactos.add(contacto);

                }

            }

            br.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    /**
     * Elimina todos los contactos.
     */
    public void eliminarTodos() {

        contactos.clear();

        guardarContactos();

    }

    /**
     * Devuelve la cantidad de contactos.
     */
    public int cantidadContactos() {

        return contactos.size();

    }

}