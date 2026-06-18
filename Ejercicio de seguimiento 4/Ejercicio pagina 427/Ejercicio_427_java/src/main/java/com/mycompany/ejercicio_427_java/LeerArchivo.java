/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_427_java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerArchivo {

    public String leer(String nombreArchivo) {

        StringBuilder contenido = new StringBuilder();

        try {
            FileInputStream archivo = new FileInputStream(nombreArchivo);
            InputStreamReader conversor = new InputStreamReader(archivo);
            BufferedReader filtro = new BufferedReader(conversor);

            String linea = filtro.readLine();

            while (linea != null) {
                contenido.append(linea).append("\n");
                linea = filtro.readLine();
            }

            filtro.close();

        } catch (IOException e) {
            return "No se pudo leer el archivo.";
        }

        return contenido.toString();
    }
}
