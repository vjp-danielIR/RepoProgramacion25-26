/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio23;

/**
 *
 * @author danie
 */
public class Vehiculo {
    
 private String matricula;
    private String modelo;
    private int potenciaCV;
    
    // Constructor vacío para crear vehículos sin datos iniciales
    public Vehiculo() {
        this.matricula = "";
        this.modelo = "";
        this.potenciaCV = 0;
    }
    
    // Constructor con parámetros para crear vehículos con todos sus datos
    public Vehiculo(String matricula, String modelo, int potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }
    
  //getter y setter
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public int getPotenciaCV() {
        return potenciaCV;
    }
    
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public String toString() {
        return "La matricula es: " + this.matricula + " y el modelo: " + this.modelo + 
                "y tiene una potencia de: " + this.potenciaCV + " caballos";
    }
}