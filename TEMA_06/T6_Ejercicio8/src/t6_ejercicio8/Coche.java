/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio8;

/**
 *
 * @author alumno
 
 */
public class Coche extends Vehiculo {
    //atributo propio
    private boolean aire;
    
    //constructores
    
    public Coche(){
    super();
    this.aire=false;
    }
    
    public Coche(int velocidad, boolean aire){
    super(velocidad);
    this.aire=aire;
    }
    
    //no necesito get y set por que lo hereda de vehiculo lo unico que no se hereda son los constructores

   
    @Override
    public void mostrarMovimiento() {
        System.out.println("El coche esta circulando a:  " + super.getVelocidad() + " km/h");
    }
    
    public void encenderAire(){
    if(aire==false){
        System.out.println("El coche ha encendido el aire la velocidad se reduce");
        velocidad-=10;
        aire= true;
        
    }  else {
        System.out.println("El aire ya esta encendido");
    }
    }
    
    
    
    
    
    
}
