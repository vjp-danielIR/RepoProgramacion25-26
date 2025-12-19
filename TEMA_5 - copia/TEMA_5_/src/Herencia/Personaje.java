/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alumno
 */
public class Personaje {
    //Atributos
    private int vida;
    
    
    //constructores
    public Personaje(){
    this.vida= 100;
    
    }
    
    public Personaje(int vida){
    this.vida=vida;
    }
    
    //getter y setter
    
   public int getVida(){
   return this.vida;
   }
    public void setVida(int vida){
        this.vida=vida;
    
    }public void atacar(){
            System.out.println("Atacando");
    }
    
    @Override
    public String toString(){
    return " El personaje tiene: " + this.vida + " puntos de vida";
    }
    
    
    
}
