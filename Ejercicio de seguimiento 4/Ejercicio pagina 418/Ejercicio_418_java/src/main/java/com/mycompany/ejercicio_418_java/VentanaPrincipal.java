/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_418_java;

/**
 *
 * @author esgar
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class VentanaPrincipal extends JFrame 
        implements ActionListener{
    private JTextField txtEquipo;
    private JTextField txtUniversidad;
    private JTextField txtLenguaje;

    private JTextField txtNombre1;
    private JTextField txtApellido1;

    private JTextField txtNombre2;
    private JTextField txtApellido2;

    private JTextField txtNombre3;
    private JTextField txtApellido3;

    private JButton btnGuardar;
    private JButton btnLimpiar;

    private JTextArea areaResultado;

    public VentanaPrincipal() {

        setTitle("Maratón de Programación");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(
                new GridLayout(11, 2, 5, 5));

        panelDatos.add(
                new JLabel("Nombre del equipo:"));
        txtEquipo = new JTextField();
        panelDatos.add(txtEquipo);

        panelDatos.add(
                new JLabel("Universidad:"));
        txtUniversidad = new JTextField();
        panelDatos.add(txtUniversidad);

        panelDatos.add(
                new JLabel("Lenguaje de programación:"));
        txtLenguaje = new JTextField();
        panelDatos.add(txtLenguaje);

        panelDatos.add(
                new JLabel("Nombre integrante 1:"));
        txtNombre1 = new JTextField();
        panelDatos.add(txtNombre1);

        panelDatos.add(
                new JLabel("Apellido integrante 1:"));
        txtApellido1 = new JTextField();
        panelDatos.add(txtApellido1);

        panelDatos.add(
                new JLabel("Nombre integrante 2:"));
        txtNombre2 = new JTextField();
        panelDatos.add(txtNombre2);

        panelDatos.add(
                new JLabel("Apellido integrante 2:"));
        txtApellido2 = new JTextField();
        panelDatos.add(txtApellido2);

        panelDatos.add(
                new JLabel("Nombre integrante 3:"));
        txtNombre3 = new JTextField();
        panelDatos.add(txtNombre3);

        panelDatos.add(
                new JLabel("Apellido integrante 3:"));
        txtApellido3 = new JTextField();
        panelDatos.add(txtApellido3);

        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this);
        panelDatos.add(btnGuardar);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(this);
        panelDatos.add(btnLimpiar);

        add(panelDatos, BorderLayout.NORTH);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);

        JScrollPane scroll =
                new JScrollPane(areaResultado);

        add(scroll, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnGuardar) {

            try {

                EquipoMaratonProgramacion equipo =
                        new EquipoMaratonProgramacion(
                                txtEquipo.getText(),
                                txtUniversidad.getText(),
                                txtLenguaje.getText());

                String[] nombres = {
                    txtNombre1.getText(),
                    txtNombre2.getText(),
                    txtNombre3.getText()
                };

                String[] apellidos = {
                    txtApellido1.getText(),
                    txtApellido2.getText(),
                    txtApellido3.getText()
                };

                for (int i = 0; i < 3; i++) {

                    EquipoMaratonProgramacion
                            .validarCampo(nombres[i]);

                    EquipoMaratonProgramacion
                            .validarCampo(apellidos[i]);

                    Programador programador =
                            new Programador(
                                    nombres[i],
                                    apellidos[i]);

                    equipo.anadir(programador);
                }

                areaResultado.setText(
                        "EQUIPO REGISTRADO CORRECTAMENTE\n\n");

                areaResultado.append(
                        "Equipo: "
                        + equipo.getNombreEquipo()
                        + "\n");

                areaResultado.append(
                        "Universidad: "
                        + equipo.getUniversidad()
                        + "\n");

                areaResultado.append(
                        "Lenguaje: "
                        + equipo.getLenguajeProgramacion()
                        + "\n\n");

                areaResultado.append(
                        "INTEGRANTES\n");

                for (int i = 0; i < 3; i++) {
                    areaResultado.append(
                            (i + 1)
                            + ". "
                            + nombres[i]
                            + " "
                            + apellidos[i]
                            + "\n");
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == btnLimpiar) {
            limpiarCampos();
        }
    }

    private void limpiarCampos() {

        txtEquipo.setText("");
        txtUniversidad.setText("");
        txtLenguaje.setText("");

        txtNombre1.setText("");
        txtApellido1.setText("");

        txtNombre2.setText("");
        txtApellido2.setText("");

        txtNombre3.setText("");
        txtApellido3.setText("");

        areaResultado.setText("");

        txtEquipo.requestFocus();
    }
    
}
