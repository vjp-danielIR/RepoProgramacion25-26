/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio1;

/**
 *
 * @author alumno
 */
public abstract class Suma  extends Calculadora{
    //atributo
    private int sumando;

     //constructores
    public Suma(){
      super();
      this.sumando=0;
    }
    //constructor parametrizado
    public Suma(int sumando, int numero){
    super(numero);
    this.sumando=sumando;
    }
    
    //getter y setter
    public int getSumando(){
    return this.sumando;
    }
    public void setSumando(int sumando){
    this.sumando=sumando;
    }
    
    @Override
   public int  realizarOperacion(){
         System.out.println("la suma de " + super.getNumero() + " y " + this.sumando + " es igual a = " + (super.getNumero() + this.sumando));
        return 0;
     }
    
}
