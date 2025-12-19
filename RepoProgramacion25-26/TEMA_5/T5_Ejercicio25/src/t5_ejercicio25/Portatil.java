/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio25;

/**
 *
 * @author alumno
 */
public class Portatil extends Ordenador {
 // atributos propios
    private String marca;
    private double tamPantalla;
    private double peso;

    // constructor por defecto
    public Portatil() {
        super();
        marca = "";
        tamPantalla = 0;
        peso = 0;
    }

    // constructor con parámetros
    public Portatil(int memoriaRam, int capacidadDisco, String modeloProcesador,
                    String modeloGrafica, int precio,
                    String marca, double tamPantalla, double peso) {

        super(memoriaRam, capacidadDisco, modeloProcesador, modeloGrafica, precio);
        this.marca = marca;
        this.tamPantalla = tamPantalla;
        this.peso = peso;
    }

    // getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(double tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " Marca: " + marca +
                " Pantalla: " + tamPantalla +
                " Peso: " + peso;
    }
}
