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
public class Multa {

    // Atributos privados
    private int codigo;
    private String nombreInfractor;
    private String tipo;
    private double montoPagar;
    private boolean pagada;

    // Atributos públicos a nivel de instancia
    public double TIPO_GRAVE = 2500.0;
    public double TIPO_MEDIO = 1000.0;
    public double TIPO_LEVE = 600.0;

    // Constructor
    public Multa(int codigo, String nombreInfractor, String tipo) {
        this.codigo = codigo;
        this.nombreInfractor = nombreInfractor;
        this.tipo = tipo;
        this.pagada = false;

        // Inicializar el monto a pagar según el tipo de multa
        switch (tipo.toUpperCase()) {
            case "GRAVE":
                this.montoPagar = TIPO_GRAVE;
                break;
            case "MEDIO":
                this.montoPagar = TIPO_MEDIO;
                break;
            case "LEVE":
            default:
                this.montoPagar = TIPO_LEVE;
                this.tipo = "LEVE"; // Asegura que el tipo sea LEVE si no es válido
                break;
        }
    }

    // Métodos get
    public int getCodigo() {
        return codigo;
    }

    public String getNombreInfractor() {
        return nombreInfractor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMontoPagar() {
        return montoPagar;
    }

    public boolean isPagada() {
        return pagada;
    }

    // Método para imprimir los valores de los atributos de la multa
    public void print() {
        String estado = pagada ? "Pagada por un monto de Lps " + montoPagar : "Multa pendiente";
        System.out.println("Código: " + codigo);
        System.out.println("Nombre del infractor: " + nombreInfractor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto a pagar: " + montoPagar);
        System.out.println("Estado: " + estado);
    }

    // Método para pagar la multa
    public void pay() {
        this.pagada = true;
        JOptionPane.showMessageDialog(null, "Multa con Código " + codigo + " fue pagada por un monto de Lps. " + montoPagar);
    }
}
