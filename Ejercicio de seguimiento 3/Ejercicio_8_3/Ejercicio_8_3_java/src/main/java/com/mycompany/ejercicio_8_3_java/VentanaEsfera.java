/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_8_3_java;

/**
 *
 * @author esgar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEsfera extends JFrame implements ActionListener {
    // Un contenedor de elementos gráficos
    private Container contenedor;
    /* Etiquetas estáticas para identificar los campos de texto a ingresar 
    y calcular */
    private JLabel radio, volumen, superficie;
    private JTextField campoRadio; // Campo de texto a ingresar
    private JButton calcular; /* Botón para realizar los cálculos 
    numéricos */
    /**
    * Constructor de la clase VentanaEsfera
    */
    public VentanaEsfera() {
        inicio();
        setTitle("“Esfera”"); // Establece el título de la ventana
        setSize(280,200); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
        setResizable(false); /* Establece que el botón de cerrar permitirá salir de la aplicación */
    }
    /**
    * Método que crea la ventana con sus diferentes componentes  
    * gráficos
    */
    private void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de 
        contenidos de la ventana */
        contenedor.setLayout(null); /* Establece que el contenedor no 
        tiene un layout */
        // Establece la etiqueta y campo de texto para el radio de la esfera
        radio = new JLabel();
        radio.setText("Radio (cms):");
        radio.setBounds(20, 20, 135, 23); /* Establece la posición de la 
        etiqueta de radio de la esfera */
        campoRadio = new JTextField();
        // Establece la posición del campo de texto de radio de la esfera
        campoRadio.setBounds(100, 20, 135, 23);
        /* Establece el botón para calcular el volumen y superficie de la 
        esfera */
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 50, 135, 23); /* Establece la posición 
        del botón calcular */
        /* Agrega al botón un ActionListener para que gestione eventos 
        del botón */
        calcular.addActionListener(this);
        // Establece la etiqueta y el valor del volumen de la esfera
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        // Establece la posición de la etiqueta de volumen de la esfera
        volumen.setBounds(20, 90, 135, 23);
        // Establece la etiqueta y el valor de la superficie de la esfera
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        // Establece la posición de la etiqueta de superficie de la esfera
        superficie.setBounds(20, 120, 135, 23);
        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
    /**
    * Método que gestiona los eventos generados en la ventana de la  
    * esfera throws Exception Excepción al ingresar un campo nulo o  
    * error en formato de número
    */
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) { /* Si se pulsa el botón Calcular */
        boolean error = false;
        try {
            // Se obtiene y convierte el valor numérico del radio
            double radio  = Double.parseDouble(campoRadio.
            getText());
            Esfera esfera = new Esfera(radio); /* Se crea un objeto Esfera */
            // Se muestra el volumen
            volumen.setText("Volumen (cm3): " + String.format("%.2f", esfera.calcularVolumen())); 
            // Se muestra la superficie
            superficie.setText("Superficie (cm2): " + String.format("%.2f",esfera.calcularSuperficie()));
        } catch (Exception e) {
            error = true; // Si ocurre una excepción
        } finally {
        if(error) { /* Si ocurre una excepción, se muestra un 
        mensaje de error */
        JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de número","Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        }
    } 
}
