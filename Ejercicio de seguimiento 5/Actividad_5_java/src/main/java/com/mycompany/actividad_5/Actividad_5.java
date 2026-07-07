/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_5;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author esgar
 */
public class Actividad_5 {

     public static void main(String[] args) throws UnsupportedLookAndFeelException {

        // Intenta utilizar el aspecto visual del sistema operativo
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException |
                 InstantiationException |
                 IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {

            System.err.println("No fue posible cargar el Look & Feel del sistema.");
        }

        // Ejecuta la interfaz gráfica
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });

    }
}
