/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 * Ventana principal de la Agenda de Contactos.
 *
 * @author esgar
 */
public class VentanaPrincipal extends JFrame {

    //====================================================
    // ATRIBUTOS
    //====================================================

    private GestorContactos gestor;

    private JLabel lblTitulo;
    private JLabel lblNombre;
    private JLabel lblNumero;

    private JTextField txtNombre;
    private JTextField txtNumero;

    private JButton btnCrear;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JButton btnSeleccionar;
    private JButton btnLimpiar;

    private DefaultListModel<Contacto> modeloLista;
    private JList<Contacto> listaContactos;
    private JScrollPane scrollLista;

    private JPanel panelFormulario;
    private JPanel panelBotones;
    private JPanel panelLista;

    /**
     * Constructor
     */
    public VentanaPrincipal() {

        gestor = new GestorContactos();

        inicializarComponentes();

        cargarLista();

        registrarEventos();

    }

    /**
     * Construye toda la interfaz gráfica.
     */
    private void inicializarComponentes() {

        //--------------------------------------------
        // CONFIGURACIÓN DE LA VENTANA
        //--------------------------------------------

        setTitle("Agenda de Contactos");

        setSize(700, 600);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(10,10));

        //--------------------------------------------
        // PANEL FORMULARIO
        //--------------------------------------------

        panelFormulario = new JPanel(new GridBagLayout());

        panelFormulario.setBorder(
                BorderFactory.createTitledBorder("Información del contacto"));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(8,8,8,8);

        gbc.fill = GridBagConstraints.HORIZONTAL;

        //--------------------------------------------
        // TITULO
        //--------------------------------------------

        lblTitulo = new JLabel("AGENDA DE CONTACTOS");

        lblTitulo.setFont(new Font("Arial",Font.BOLD,22));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;

        panelFormulario.add(lblTitulo, gbc);

        //--------------------------------------------
        // NOMBRE
        //--------------------------------------------

        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 1;

        lblNombre = new JLabel("Nombre:");

        panelFormulario.add(lblNombre, gbc);

        gbc.gridx = 1;

        txtNombre = new JTextField(25);

        panelFormulario.add(txtNombre, gbc);

        //--------------------------------------------
        // NÚMERO
        //--------------------------------------------

        gbc.gridx = 0;
        gbc.gridy = 2;

        lblNumero = new JLabel("Número:");

        panelFormulario.add(lblNumero, gbc);

        gbc.gridx = 1;

        txtNumero = new JTextField(25);

        panelFormulario.add(txtNumero, gbc);

        //--------------------------------------------
        // PANEL BOTONES
        //--------------------------------------------

        panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));

        btnCrear = new JButton("Crear");

        btnActualizar = new JButton("Actualizar");

        btnEliminar = new JButton("Eliminar");

        btnSeleccionar = new JButton("Seleccionar");

        btnLimpiar = new JButton("Limpiar");

        panelBotones.add(btnCrear);

        panelBotones.add(btnActualizar);

        panelBotones.add(btnEliminar);

        panelBotones.add(btnSeleccionar);

        panelBotones.add(btnLimpiar);

        //--------------------------------------------
        // PANEL LISTA
        //--------------------------------------------

        panelLista = new JPanel(new BorderLayout());

        panelLista.setBorder(
                BorderFactory.createTitledBorder("Lista de Contactos"));

        modeloLista = new DefaultListModel<>();

        listaContactos = new JList<>(modeloLista);

        listaContactos.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION);

        listaContactos.setFont(new Font("Arial",Font.PLAIN,15));

        scrollLista = new JScrollPane(listaContactos);

        scrollLista.setPreferredSize(new Dimension(600,280));

        panelLista.add(scrollLista, BorderLayout.CENTER);

        //--------------------------------------------
        // AGREGAR LOS PANELES A LA VENTANA
        //--------------------------------------------

        add(panelFormulario, BorderLayout.NORTH);

        add(panelBotones, BorderLayout.CENTER);

        add(panelLista, BorderLayout.SOUTH);

    }

    //====================================================
    // MÉTODOS (Se implementarán en la Parte 2)
    //====================================================

    /**
 * Carga los contactos del gestor en el JList.
 */
private void cargarLista() {

    modeloLista.clear();

    for (Contacto contacto : gestor.obtenerContactos()) {

        modeloLista.addElement(contacto);

    }

}

/**
 * Registra todos los eventos de los botones.
 */
private void registrarEventos() {

    //==============================
    // BOTÓN CREAR
    //==============================

    btnCrear.addActionListener(e -> {

        String nombre = txtNombre.getText().trim();
        String numero = txtNumero.getText().trim();

        if (nombre.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe ingresar un nombre.");

            return;

        }

        if (numero.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Debe ingresar un número.");

            return;

        }

        Contacto contacto = new Contacto(nombre, numero);

        if (gestor.agregarContacto(contacto)) {

            cargarLista();

            limpiarCampos();

            JOptionPane.showMessageDialog(
                    this,
                    "Contacto agregado correctamente.");

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "El contacto ya existe.");

        }

    });

    //==============================
    // BOTÓN SELECCIONAR
    //==============================

    btnSeleccionar.addActionListener(e -> {

        int indice = listaContactos.getSelectedIndex();

        if (indice == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Seleccione un contacto.");

            return;

        }

        Contacto contacto = gestor.obtenerContacto(indice);

        txtNombre.setText(contacto.getNombre());

        txtNumero.setText(contacto.getNumero());

    });

    //==============================
    // BOTÓN ACTUALIZAR
    //==============================

    btnActualizar.addActionListener(e -> {

        int indice = listaContactos.getSelectedIndex();

        if (indice == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Seleccione un contacto.");

            return;

        }

        String nombre = txtNombre.getText().trim();

        String numero = txtNumero.getText().trim();

        if (nombre.isEmpty() || numero.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Complete todos los campos.");

            return;

        }

        Contacto nuevo = new Contacto(nombre, numero);

        gestor.actualizarContacto(indice, nuevo);

        cargarLista();

        limpiarCampos();

        JOptionPane.showMessageDialog(
                this,
                "Contacto actualizado.");

    });

    //==============================
    // BOTÓN ELIMINAR
    //==============================

    btnEliminar.addActionListener(e -> {

        int indice = listaContactos.getSelectedIndex();

        if (indice == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Seleccione un contacto.");

            return;

        }

        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Desea eliminar este contacto?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {

            gestor.eliminarContacto(indice);

            cargarLista();

            limpiarCampos();

            JOptionPane.showMessageDialog(
                    this,
                    "Contacto eliminado.");

        }

    });

    //==============================
    // BOTÓN LIMPIAR
    //==============================

    btnLimpiar.addActionListener(e -> {

        limpiarCampos();

    });

}

/**
 * Limpia los campos de texto.
 */
private void limpiarCampos() {

    txtNombre.setText("");

    txtNumero.setText("");

    listaContactos.clearSelection();

    txtNombre.requestFocus();

}
}