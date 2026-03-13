/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio7;

/**
 *
 * @author danie
 */
public class Televisor implements ControlRemoto{
 private boolean encendido;
 private int canal;
 private int volumen;
 
    /**
     *
     */
    public Televisor(){
    canal=1;
    volumen=0;
     encendido=false;
    }
 
  public Televisor(boolean encendido, int canal, int volumen) {
        this.encendido =encendido;
        this.canal =canal;
        this.volumen =volumen;
    }
    
    // Getters y Setters (excepto get y set de encendido)
    public int getCanal() {
        return canal;
    }
    
    public void setCanal(int canal) {
        this.canal = canal;
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
            System.out.println("television encendida. Canal actual: " + canal);
        } else {
            System.out.println("La television ya está encendida.");
        }
    }
    
    @Override
    public void apagar() {
        if (encendido) {
            System.out.println("La television se apagará en 10s");
            encendido = false;
        } else {
            System.out.println("La television ya está apagada.");
        }
    }
    
    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen--;
            System.out.println("Volumen actual: " + volumen);
        } else {
            System.out.println("La television está apagada. Enciéndela primero.");
        }
    }
    
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen actual: " + volumen);
        } else {
            System.out.println("La television está apagada. Enciéndela primero.");
        }
    }
    
    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal;
            System.out.println("Canal actual: " + this.canal);
        } else {
            System.out.println("La television está apagada enciéndela primero.");
        }
    }
    
    // Método toString para mostrar información
    @Override
    public String toString() {
        return "Televisor" + "encendido: " + encendido +   " canal: " + canal + ", volumen=" + volumen;
    }
}
