/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio1;

/**
 *
 * @author alumno
 */
public class Potencia  extends Calculadora{
     private int exponente;

     public Potencia(){
     super();
     this.exponente=exponente;
     }
    public Potencia(int numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }

  
     @Override
   public void realizarOperacion() {
        double resultado = Math.pow(numero, exponente);
         System.out.println("el resultado de la operacion es: " + resultado );
        
    }
}
