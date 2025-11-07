/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_5_;

/**
 * inicio tema 5 programacion orientada a objetos
 * @author alumno
 * 
 */
//PLANTILLA
public class Coche {
    //atributos que nunca se inicializan
   private String ruedas;
   private String suspension;
   private int  espejos;
   
   //Constructures para construir un objeto hay 2 tipos 
   
   //1 por defecto inicializa los valores de los atributos por los de defecto
   public Coche(){
   //se inicializan los atributos por defecto
   //this es una palabra que hace referencia a la clase "hago referencia a x atributo"
    this.ruedas = "";
    this.suspension= "";
    this.espejos= 0;
  
   }
   //2 constructor parametrizado ( personalizado)
   public Coche(String ruedas, String suspension, int espejos){
   this.ruedas= ruedas;
   this.suspension=suspension;
   this.espejos= espejos;
   
   }
   //getters y setters devuelven y establecen el valor de los atributos
   public String getRuedas(){
       return this.ruedas;
   
   }
   
   public void setRuedas(String ruedas){
       this.ruedas= ruedas;
   
   }
   
   public String getSuspension(){
   return this.suspension;
   }
   
   public void setSuspension(String suspension){
       this.suspension= suspension;
   }
   
   public int getEspejos(){
   return this.espejos;
   }
   public void setEspejos(int espejos){
       this.espejos= espejos;
   }
   
   //TO STRING devuelve a String con los datos del objeto

    /**
     *
     * @return
     */
   @Override
   public String toString(){
   
       return "Mi coche tiene ruedas " + this.ruedas + ", suspension " + this.suspension + " y espejos " + this.espejos;
   
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

