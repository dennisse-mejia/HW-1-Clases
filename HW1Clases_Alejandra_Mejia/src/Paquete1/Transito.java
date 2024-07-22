/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

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
            System.out.println("No hay espacio en el sistema para agregar más multas.");
            return;
        }

        if (buscarMulta(codigo) != null) {
            System.out.println("El código de la multa ya existe en el sistema.");
            return;
        }

        Multa nuevaMulta = new Multa(codigo, nombre, tipo);
        multas[contadorMultas] = nuevaMulta;
        contadorMultas++;
        System.out.println("Multa agregada con éxito.");
    }

}
