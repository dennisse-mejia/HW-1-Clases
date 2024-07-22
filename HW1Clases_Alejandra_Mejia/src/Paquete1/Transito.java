/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dennisse
 */
public class Transito {

    // Atributos
    private Multa[] multas;
    private int contadorMultas;

    // Constructor
    public Transito() {
        this.multas = new Multa[100];
        this.contadorMultas = 0;
    }

    // Método para buscar una multa por código
    public Multa buscarMulta(int codigo) {
        for (Multa multa : multas) {
            if (multa != null && multa.getCodigo() == codigo) {
                return multa;
            }
        }
        return null;
    }

    // Método para agregar una nueva multa
    public void agregarMulta(int codigo, String nombre, String tipo) {
        if (contadorMultas >= multas.length) {
            JOptionPane.showMessageDialog(null, "No hay espacio en el sistema para agregar más multas.");
            return;
        }

        if (buscarMulta(codigo) != null) {
            JOptionPane.showMessageDialog(null, "El código de la multa ya existe en el sistema.");
            return;
        }

        Multa nuevaMulta = new Multa(codigo, nombre, tipo);
        multas[contadorMultas] = nuevaMulta;
        contadorMultas++;
        JOptionPane.showMessageDialog(null, "Multa agregada con éxito.");
    }

    // Método para pagar una multa
    public void pagarMulta(int codigo) {
        Multa multa = buscarMulta(codigo);
        if (multa != null) {
            if (!multa.isPagada()) {
                multa.pay();
            } else {
                JOptionPane.showMessageDialog(null, "La multa ya está pagada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró una multa con el código proporcionado.");
        }
    }

    // Método para imprimir la información de todas las multas
    public void imprimirMultas() {
        for (Multa multa : multas) {
            if (multa != null) {
                multa.print();
                System.out.println();
            }
        }
    }

    // Método para obtener la información del sistema
    public String obtenerInformacionSistema() {
        int multasPagadas = 0;
        double montoPagado = 0.0;
        int multasPendientes = 0;
        double montoPendiente = 0.0;

        for (Multa multa : multas) {
            if (multa != null) {
                if (multa.isPagada()) {
                    multasPagadas++;
                    montoPagado += multa.getMontoPagar();
                } else {
                    multasPendientes++;
                    montoPendiente += multa.getMontoPagar();
                }
            }
        }

        return "Cantidad de Multas generadas: " + contadorMultas
                + "\nCantidad de Multas Pagadas: " + multasPagadas + " con un monto total de Lps. " + montoPagado
                + "\nCantidad de Multas pendientes de pagar: " + multasPendientes + " con un monto total de Lps. " + montoPendiente;
    }

    // Método para obtener todas las multas
    public Multa[] getMultas() {
        return multas;
    }
}
