/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio1;



/**
 *
 * @author alumno
 */
   public  class Multiplicacion  extends Calculadora{

    private int multiplicador;
    
    public Multiplicacion(){
    super();
    this.multiplicador=0;
    }


     public Multiplicacion(int numero, int multiplicador) {
        super(numero);
        this.multiplicador=multiplicador;
    }
   
    
    public double getMultiplicador(){
     return this.multiplicador;
    }
    
    public void setMultiplicador(int multiplicador){
    this.multiplicador=multiplicador;
            }
    
  
    @Override
    public void realizarOperacion() {
        int resultado;
        resultado = (int) (numero * multiplicador);
        System.out.println("El resultado de multiplicar: " + super.getNumero() + " y " + this.multiplicador + " es: " + resultado);  
    }

    
   }