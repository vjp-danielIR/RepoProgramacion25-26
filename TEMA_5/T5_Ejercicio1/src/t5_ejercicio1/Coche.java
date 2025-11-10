/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio1;

/**
 * inicio tema 5 programacion orientada a objetos
 * @author alumno
 * 
 */
//PLANTILLA
public class Coche {
    //atributos que nunca se inicializan
   private String marca;
   private String modelo;
   private String color;
   private int velocidad;
   private booelan motorEncendido;
   
   //Constructures para construir un objeto hay 2 tipos 
   
   //1 por defecto inicializa los valores de los atributos por los de defecto
   public Coche(){
   //se inicializan los atributos por defecto
   //this es una palabra que hace referencia a la clase "hago referencia a x atributo"
    this.marca = "";
    this.modelo= "";
    this.velocidad= 0;
    this.color= "";
    this.motorEncendido= false;
  
   }
   //2 constructor parametrizado ( personalizado)
   public Coche(String marca, String modelo, int velocidad, String color, boolean motorEncendido){
   this.marca = marca;
    this.modelo= modelo;
    this.velocidad= velocidad;
    this.color= color;
    this.motorEncendido= motorEncendido;
   }
   //getters y setters devuelven y establecen el valor de los atributos
   public String getMarca(){
       return this.marca;
   }
   
   public void setMarca(String marca){
       this.marca= marca;
   }
   
   public String getModelo(){
   return this.modelo;
   }
   
   public void setModelo(String modelo){
       this.modelo= modelo;
   }
   
   public int getVelocidad(){
   return this.velocidad;
   }
   public void setVelocidad(int velocidad){
       this.velocidad= velocidad;
   }
   
   public String getColor(){
       return this.color;
   }
   public void setColor(String color){
       this.color= color;
   }
   
   public String getColor
  
   
   @Override
   public String toString(){
   
       return "Mi coche tiene ruedas " + this. + ", suspension " + this. + " y espejos " + this.;
   
   }
   
   //otros metodos 
   public void acelerar(){
       System.out.println("Acelerando coche...");
   }
   public void frenar(){
       System.out.println("Frenando coche");
   }
   public void girar(){
       System.out.println("Girando coche");
   }
   
}

