/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio1;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
   //atributo
    private int numero;
   //constructores
    public Calculadora(){
    this.numero=0;
    }
    public Calculadora(int numero){
    this.numero=numero;
    }
    //getter setter
    public int getNumero(){
    return this.numero;
    }
    public void setNumero(int numero){
    this.numero=numero;
    }
    
    public abstract int realizarOperacion();
    
    @Override
    public String toString(){
        
       return " el numero es " + this.numero;
    }
}