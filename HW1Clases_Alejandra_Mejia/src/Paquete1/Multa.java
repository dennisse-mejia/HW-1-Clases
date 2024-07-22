/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author Dennisse
 */
public class Multa {

    // Atributos
    private int codigo;
    private String nombreInfractor;
    private String tipo;
    private double montoPagar;
    private boolean pagada;

    public double TIPO_GRAVE = 1500.0;
    public double TIPO_MEDIO = 1000.0;
    public double TIPO_LEVE = 500.0;

    // Constructor
    public Multa(int codigo, String nombreInfractor, String tipo) {
        this.codigo = codigo;
        this.nombreInfractor = nombreInfractor;
        this.tipo = tipo;
        this.pagada = false;
    }

    // Funciones get
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

    // Función para imprimir los valores de los atributos
    public void print() {
        String estado = pagada ? "Pagada por un monto de Lps " + montoPagar : "Multa pendiente";
        System.out.println("Código: " + codigo);
        System.out.println("Nombre del infractor: " + nombreInfractor);
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto a pagar: " + montoPagar);
        System.out.println("Estado: " + estado);
    }

    // Función para pagar la multa
    public void pay() {
        this.pagada = true;
        System.out.println("Multa con Código " + codigo + " fue pagada por un monto de Lps. " + montoPagar);
    }

}
