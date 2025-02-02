/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paquete1;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Dennisse
 */
public class Main extends javax.swing.JFrame {

    private Transito transito;

    /**
     * Creates new form Main
     */
    public Main() {
        transito = new Transito();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        agregarMulta = new javax.swing.JButton();
        pagarMulta = new javax.swing.JButton();
        buscarMulta = new javax.swing.JButton();
        printMulta = new javax.swing.JButton();
        printSystemInfo = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titulo.setText("SISTEMA DE MULTAS");

        agregarMulta.setText("Agregar Multas");
        agregarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMultaActionPerformed(evt);
            }
        });

        pagarMulta.setText("Pagar Multa");
        pagarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarMultaActionPerformed(evt);
            }
        });

        buscarMulta.setText("Buscar Multa");
        buscarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMultaActionPerformed(evt);
            }
        });

        printMulta.setText("Imprimir Multas");
        printMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printMultaActionPerformed(evt);
            }
        });

        printSystemInfo.setText("Imprimir Info del Sistema");
        printSystemInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printSystemInfoActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel1.setText("Grave L2,500 -- Medio L1,000 -- Leve L600");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salir)
                            .addComponent(titulo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pagarMulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agregarMulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(printSystemInfo)
                            .addComponent(printMulta)
                            .addComponent(buscarMulta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titulo)
                .addGap(27, 27, 27)
                .addComponent(agregarMulta)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pagarMulta)
                        .addGap(18, 18, 18)
                        .addComponent(buscarMulta)
                        .addGap(18, 18, 18)
                        .addComponent(printMulta)
                        .addGap(18, 18, 18)
                        .addComponent(printSystemInfo))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMultaActionPerformed
        JTextField codigoField = new JTextField(5);
        JTextField nombreField = new JTextField(20);
        JTextField tipoField = new JTextField(10);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Código:"));
        panel.add(codigoField);
        panel.add(Box.createHorizontalStrut(15));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(Box.createHorizontalStrut(15));
        panel.add(new JLabel("Tipo:"));
        panel.add(tipoField);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Ingrese los datos de la multa", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                int codigo = Integer.parseInt(codigoField.getText());
                String nombre = nombreField.getText();
                String tipo = tipoField.getText().toUpperCase();
                // Validar que el nombre no esté vacío y sea solo letras
                if (nombre.trim().isEmpty() || !nombre.matches("[a-zA-Z\\s]+")) {
                    JOptionPane.showMessageDialog(null, "Nombre inválido. Solo se permiten letras y no puede estar vacío.");
                    return;
                }

                // Validar que el tipo sea uno de los permitidos
                if (!(tipo.equals("GRAVE") || tipo.equals("MEDIO") || tipo.equals("LEVE"))) {
                    JOptionPane.showMessageDialog(null, "Tipo de multa inválido. Debe ser 'grave', 'medio' o 'leve'.");
                    return;
                }

                transito.agregarMulta(codigo, nombre, tipo);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Código inválido. Por favor ingrese un número entero.");
            }
        }
    }//GEN-LAST:event_agregarMultaActionPerformed

    private void pagarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarMultaActionPerformed
        String codigoStr = JOptionPane.showInputDialog("Ingrese el código de la multa a pagar:");
        if (codigoStr != null && !codigoStr.isEmpty()) {
            try {
                int codigo = Integer.parseInt(codigoStr);
                transito.pagarMulta(codigo);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Código inválido. Por favor ingrese un número entero.");
            }
        }
    }//GEN-LAST:event_pagarMultaActionPerformed

    private void buscarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMultaActionPerformed
        String codigoStr = JOptionPane.showInputDialog("Ingrese el código de la multa a buscar:");
        if (codigoStr != null && !codigoStr.isEmpty()) {
            try {
                int codigo = Integer.parseInt(codigoStr);
                Multa multa = transito.buscarMulta(codigo);
                if (multa != null) {
                    JOptionPane.showMessageDialog(null, multaDetalles(multa), "Detalles de la Multa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una multa con el código proporcionado.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Código inválido. Por favor ingrese un número entero.");
            }
        }
    }//GEN-LAST:event_buscarMultaActionPerformed

    private void printMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printMultaActionPerformed
        // TODO add your handling code here:
        JTextArea textArea = new JTextArea(20, 40);
        for (Multa multa : transito.getMultas()) {
            if (multa != null) {
                textArea.append(multaDetalles(multa) + "\n\n");
            }
        }
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane, "Todas las Multas", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_printMultaActionPerformed

    private void printSystemInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printSystemInfoActionPerformed
        // TODO add your handling code here:
        String info = transito.obtenerInformacionSistema();
        JOptionPane.showMessageDialog(null, info, "Información del Sistema", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_printSystemInfoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
    private String multaDetalles(Multa multa) {
        return "Código: " + multa.getCodigo()
                + "\nNombre del infractor: " + multa.getNombreInfractor()
                + "\nTipo: " + multa.getTipo()
                + "\nMonto a pagar: " + multa.getMontoPagar()
                + "\nEstado: " + (multa.isPagada() ? "Pagada" : "Pendiente");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarMulta;
    private javax.swing.JButton buscarMulta;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pagarMulta;
    private javax.swing.JButton printMulta;
    private javax.swing.JButton printSystemInfo;
    private javax.swing.JButton salir;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
