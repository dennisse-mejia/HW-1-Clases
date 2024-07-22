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
}
