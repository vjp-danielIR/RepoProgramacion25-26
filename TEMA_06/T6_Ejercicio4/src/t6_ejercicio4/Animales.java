/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio4;

/**
 *
 * @author alumno
 */
public abstract class Animales {
    //atributos
    private String Nombre;
    private int Edad;
    private double Peso;
    
    //CONSTRUCTORES
    public Animales(){
    this.Nombre="";
    this.Edad = 0;
    this.Peso= 0;
    }
    public Animales(String Nombre, int Edad, double Peso){
    this.Nombre=Nombre;
    this.Edad=Edad;
    this.Peso=Peso;
    }
    
    //GETTER Y SETTER
    public String getNombre(){
    return this.Nombre;
      }
    public void setNombre(String Nombre){
    this.Nombre=Nombre;
    }
    public int getEdad(){
    return this.Edad;
    }
    public void setEdad(int Edad){
    this.Edad=Edad;
    }
    
    public double getPeso(){
    return this.Peso;
    }
    
    public void setPeso(double Peso){
    this.Peso=Peso;
    }
    //metodos abstractos
    public abstract void sonidoAnimal();
    public abstract void alimentacionAnimal();
    public abstract void habitadAnimal();
    public abstract  void nombreCientificoAnimal();
  
    @Override
    public String toString(){
    return " El nombre del animal es: " + this.Nombre + " tiene una edad de: " + this.Edad + " y pesa aproximadamente: " + this.Peso;
    }
    
    
}
