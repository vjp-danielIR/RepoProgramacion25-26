/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio17;

/**
 *
 * @author danie
 */
public class Casilla {

    //atributos
    private String ficha;
    private boolean ocupada;

    // Constructor por defecto
    public Casilla() {
        this.ficha = " ";
        this.ocupada = false;
    }

    // Constructor parametrizado
    public Casilla(String ficha, boolean ocupada) {
        this.ficha = ficha;
        this.ocupada = ocupada;
    }

    // Getters y Setters
    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
        this.ocupada = true;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    // ToString
    @Override
    public String toString() {
        return "Casilla [ficha=" + ficha + ", ocupada=" + ocupada + "]";
    }
}
