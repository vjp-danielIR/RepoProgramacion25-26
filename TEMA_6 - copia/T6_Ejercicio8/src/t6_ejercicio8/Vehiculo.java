/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio8;

/**
 *
• 
 * @author alumno
 */
public abstract class Vehiculo {
    
    //atributo
    int velocidad;
    
    //constructores
    public Vehiculo(){
    this.velocidad=0;
    }
    public Vehiculo(int velocidad){
    this.velocidad=velocidad;
    }
    
    //get y set
    
    public int getVelocidad(){
    return this.velocidad;
    }
    
    public void setVelocidad(){
    this.velocidad=velocidad;
    
    }
    
    public abstract void mostrarMovimiento();
    //to string
    @Override
    public String toString(){
    
    return "El coche va a una velocidad de: " + this.velocidad + " km/h";
    }
    
}
