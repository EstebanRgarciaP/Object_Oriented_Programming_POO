/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_418_java;

/**
 *
 * @author esgar
 */
public class EquipoMaratonProgramacion {
    private String nombreEquipo;
    private String universidad;
    private String lenguajeProgramacion;
    private Programador[] programadores;
    private int tamanoEquipo;

    public EquipoMaratonProgramacion(String nombreEquipo,
                                     String universidad,
                                     String lenguajeProgramacion) {

        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;

        tamanoEquipo = 0;
        programadores = new Programador[3];
    }

    public boolean estaLleno() {
        return tamanoEquipo == programadores.length;
    }

    public void anadir(Programador programador)
            throws Exception {

        if (estaLleno()) {
            throw new Exception(
                    "El equipo ya está completo."
            );
        }

        programadores[tamanoEquipo] = programador;
        tamanoEquipo++;
    }

    public static void validarCampo(String campo)
            throws Exception {

        if (campo.trim().isEmpty()) {
            throw new Exception(
                    "El campo no puede estar vacío."
            );
        }

        if (campo.length() > 20) {
            throw new Exception(
                    "La longitud no puede ser superior a 20 caracteres."
            );
        }

        for (int i = 0; i < campo.length(); i++) {

            if (Character.isDigit(campo.charAt(i))) {
                throw new Exception(
                        "El campo no puede contener números."
                );
            }
        }
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public Programador[] getProgramadores() {
        return programadores;
    }
}

