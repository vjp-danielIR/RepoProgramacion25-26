/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio3;

/**
 *
 * @author alumno
 */
public class Coche {
      //atributos que nunca se inicializan
   private String marca;
   private String modelo;
   private Rueda ruedas;
   
 
   public Coche(){
   
    this.marca = "";
    this.modelo= "";
    this.ruedas= new Rueda();
  
   }
   //2 constructor parametrizado ( personalizado)
   public Coche(String marca, String modelo,String material, String pulgadas){
   this.marca=marca;
   this.modelo=modelo;
   this.ruedas= new Rueda(material, pulgadas);
   
   }
   //getters y setters devuelven y establecen el valor de los atributos
   public String getMarca(){
       return this.marca;
   
   }
   
   public void setMarca(String marca){
       this.marca=marca;
   
   }
   
   public String getModelo(){
   return this.modelo;
   }
   
   public void setModelo(String modelo){
       this.modelo=modelo;
   }
  
  
   @Override
   public String toString(){
   
       return "Mi coche es de la marca " + this.marca + ", modelo  " + this.modelo  + this.ruedas;
   
   }
   
}
