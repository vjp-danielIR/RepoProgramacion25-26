/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alumno
 */
public class Jugador extends Personaje{
    //Atributos
    private String inventario;
    
    //constructores
    public Jugador(){
    //llamar constructor por defecto de Personaje
    super();
    this.inventario="";
    }
    /**
     *
     * @param vida
     * @param inventario
     */
     public Jugador(int vida, String inventario){
     super(vida);
     this.inventario = inventario;
     }
     
     
     
     public String getInventario(){
         return this.inventario;
         
     }
      public void setInventario(String inventario){
          this.inventario=inventario;
      }

      
        //metodo para Jugador
      public void recoger(String objeto){
          System.out.println("Recogiendo " + objeto + " ...");
      }
      @Override
      public String toString(){
          return super.toString() + " y es un Jugador con " + this.inventario;
      }


}