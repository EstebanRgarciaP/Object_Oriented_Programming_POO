/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_412_java;

/**
 *
 * @author esgar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JLabel lblValor;
    private JTextField txtValor;

    private JButton btnLogaritmo;
    private JButton btnRaiz;
    private JButton btnLimpiar;
    private JButton btnSalir;

    private JTextArea txtResultado;

    public VentanaPrincipal() {

        setTitle("Cálculos Numéricos");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblValor = new JLabel("Ingrese un número:");
        lblValor.setBounds(40, 30, 150, 30);
        add(lblValor);

        txtValor = new JTextField();
        txtValor.setBounds(190, 30, 200, 30);
        add(txtValor);

        btnLogaritmo = new JButton("Logaritmo");
        btnLogaritmo.setBounds(40, 90, 150, 35);
        btnLogaritmo.addActionListener(this);
        add(btnLogaritmo);

        btnRaiz = new JButton("Raíz Cuadrada");
        btnRaiz.setBounds(240, 90, 150, 35);
        btnRaiz.addActionListener(this);
        add(btnRaiz);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(90, 150, 130, 35);
        btnLimpiar.addActionListener(this);
        add(btnLimpiar);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(260, 150, 130, 35);
        btnSalir.addActionListener(this);
        add(btnSalir);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);

        JScrollPane scroll = new JScrollPane(txtResultado);
        scroll.setBounds(40, 210, 400, 70);
        add(scroll);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnLogaritmo) {

            try {
                double valor = Double.parseDouble(txtValor.getText());

                String resultado =
                        CálculosNuméricos.calcularLogaritmoNeperiano(valor);

                txtResultado.setText(resultado);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "Debe ingresar un valor numérico.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        if (e.getSource() == btnRaiz) {

            try {
                double valor = Double.parseDouble(txtValor.getText());

                String resultado =
                        CálculosNuméricos.calcularRaizCuadrada(valor);

                txtResultado.setText(resultado);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "Debe ingresar un valor numérico.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        if (e.getSource() == btnLimpiar) {
            txtValor.setText("");
            txtResultado.setText("");
            txtValor.requestFocus();
        }

        if (e.getSource() == btnSalir) {
            System.exit(0);
        }
    }
}