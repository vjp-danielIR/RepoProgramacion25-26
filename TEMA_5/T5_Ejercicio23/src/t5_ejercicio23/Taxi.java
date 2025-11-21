/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio23;

/**
 *
 * @author danie
 */
public class Taxi extends Vehiculo {
     private String numeroLicencia;
    
    // Constructor vacío
    public Taxi() {
        super(); // Llama al constructor vacío de Vehiculo
        this.numeroLicencia = "";
    }
    
    // Constructor con todos los parámetros
    public Taxi(String matricula, String modelo, int potenciaCV, String numeroLicencia) {
        // Llama al constructor de Vehiculo
        super(matricula, modelo, potenciaCV); 
        this.numeroLicencia = numeroLicencia;
    }
    
    public String getNumeroLicencia() {
        return numeroLicencia;
    }
    
    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    @Override
    public String toString(){
        return "informacion del taxi: " + super.toString() + " numero de licencia es: " + this.numeroLicencia;
       
    }
}