/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio2;

/**
 *
 * @author alumno
 * atributo nombre y el método abstracto saludar
 */
public abstract  class Persona {
    //atributo
    String nombre;
    //constructor
    public Persona(){
    this.nombre="";
    }
    //parametrizado
    public Persona(String nombre){
    this.nombre=nombre;
    }
    
    //getter y seter
    public String getNombre(){
    return this.nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    //metodo saluda  
    public abstract void Saludar();   

    

}
