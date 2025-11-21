/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio25;

/**
 *
 * @author alumno
 */ 
public class Ordenador {
    //atributos
    private int memoriaRam;
    private int capacidadDisco;
    private String modeloProcesador;
    private String modeloGrafica;
    private int precio;
    
    //constructores
    public void ordenador(){
        memoriaRam=0;
        capacidadDisco=0;
        modeloProcesador="";
        modeloGrafica="";
        precio=0;
    }
     public void ordenador(int memoriaRamo, int capacidadDisco, String modeloProcesador, String modeloGrafica, int precio ){
        this.memoriaRam=memoriaRam;
        this.capacidadDisco=capacidadDisco;
        this.modeloProcesador=modeloProcesador;
        this.modeloGrafica=modeloGrafica;
        this.precio=precio;
     }
    //getter y setter de los atributos
     public int getMemoriaRam(){
     return memoriaRam;
     }
     
     public void setMemoriaRam(int memoriaRam){
     this.memoriaRam=memoriaRam;
     }
     
     public int getCapacidadDisco(){
     return capacidadDisco;
     }
     
     public void setCapacidadDisco(int capacidadDisco){
     this.capacidadDisco=capacidadDisco;
     }
     
     public String getModeloProcesador(){
     return modeloProcesador;
     }
     
     public void setModeloProcesador(String modeloProcesador){
     this.modeloProcesador=modeloProcesador;
     }
     
     public String getModeloGrafica(){
     return modeloGrafica;
     }
     
     public void setModeloGrafica(String modeloGrafica){
     this.modeloGrafica=modeloGrafica;
     }
     
     public int getPrecio(){
     return precio;
     }
     
     public void setPrecio(int precio){
     this.precio=precio;
     }

     
     @Override
     public String toString (){
     return "Tengo :" + this.memoriaRam + "GB de memoria Ram" + " ademas de: " + this.capacidadDisco + " GB de almacenamiento mi procesador es un: "
          + this.modeloProcesador + " y mi grafica es: " + this.modeloGrafica + " y todo me ha costado: " + this.precio + "€";
    }
    
     }