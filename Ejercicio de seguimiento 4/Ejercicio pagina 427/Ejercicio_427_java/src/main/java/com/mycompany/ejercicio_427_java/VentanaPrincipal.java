/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_427_java;

/**
 *
 * @author esgar
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    private JLabel lblArchivo;
    private JTextField txtArchivo;
    private JButton btnLeer;
    private JButton btnLimpiar;
    private JTextArea txtResultado;
    private JScrollPane scroll;

    public VentanaPrincipal() {

        setTitle("Lectura de Archivos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblArchivo = new JLabel("Ruta del archivo:");
        lblArchivo.setBounds(20, 20, 120, 25);
        add(lblArchivo);

        txtArchivo = new JTextField();
        txtArchivo.setBounds(140, 20, 320, 25);
        add(txtArchivo);

        btnLeer = new JButton("Leer");
        btnLeer.setBounds(470, 20, 90, 25);
        add(btnLeer);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        scroll = new JScrollPane(txtResultado);
        scroll.setBounds(20, 70, 540, 230);
        add(scroll);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(230, 320, 120, 30);
        add(btnLimpiar);

        btnLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ruta = txtArchivo.getText();

                if (ruta.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Ingrese la ruta del archivo."
                    );
                    return;
                }

                LeerArchivo lector = new LeerArchivo();
                String contenido = lector.leer(ruta);

                txtResultado.setText(contenido);
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArchivo.setText("");
                txtResultado.setText("");
            }
        });
    }
}