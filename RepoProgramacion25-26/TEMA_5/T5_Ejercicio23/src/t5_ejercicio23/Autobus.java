/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio23;

/**
 *
 * @author danie
 */
public class Autobus extends Vehiculo {
 private int numeroPlazas;
    
    // Constructor por defecto
    public Autobus() {
        // Llama al constructor vacío de Vehiculo
        super(); 
        this.numeroPlazas = 0;
    }
    
    // Constructor con todos los parámetros
    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
        super(matricula, modelo, potenciaCV); // Llama al constructor de Vehiculo
        this.numeroPlazas = numeroPlazas;
    }
    
    
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    
    // Muestra toda la información del autobús 
 @Override
    public String toString() {
        return "informacion del autobus: " + super.toString() + " numero de plazas: " + this.numeroPlazas;
    
    }
}