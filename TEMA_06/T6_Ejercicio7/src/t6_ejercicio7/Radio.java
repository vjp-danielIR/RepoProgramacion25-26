/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio7;

/**
 *
 * @author danie
 */
public class Radio implements ControlRemoto{
      private boolean encendido;
    private float emisora;
    private int volumen;
    
    // Constructor
    public Radio() {
        this.encendido = false;
        this.emisora = 0;
        this.volumen = 0;
    }
    
    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido =encendido;
        this.emisora =emisora;
        this.volumen =volumen;
    }
    // Getters y Setters 
    public float getEmisora() {
        return emisora;
    }
    
    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }
    
    public int getVolumen() {
        return volumen;
    }
    
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    // Implementación de métodos de la interfaz
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Radio encendida.");
        } else {
            System.out.println("La radio ya está encendida.");
        }
    }
    
    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Radio apagada.");
        } else {
            System.out.println("La radio ya está apagada.");
        }
    }
    
    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen -= 5;
            System.out.println("Volumen actual: " + volumen);
        } else {
            System.out.println("La radio está apagada. Enciéndela primero.");
        }
    }
    
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5;
            System.out.println("Volumen actual: " + volumen);
        } else {
            System.out.println("La radio está apagada. Enciéndela primero.");
        }
    }
    
    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.emisora = canal;
            System.out.println("Emisora actual: " + this.emisora + " FM");
        } else {
            System.out.println("La radio está apagada. Enciéndela primero.");
        }
    }
    
    // Método toString para mostrar información
    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", emisora=" + emisora +  " FM, volumen=" + volumen + '}';
    }
}
