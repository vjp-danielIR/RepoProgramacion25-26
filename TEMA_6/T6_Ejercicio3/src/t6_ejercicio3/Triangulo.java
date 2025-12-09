/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio3;

/**
 *
 * @author danie
 */

 public class Triangulo extends FiguraGeometrica {
    //atributos
    private double base;
    private double altura;
    
    //constructores
    public Triangulo(){
    super();
    base=0;
    altura=0;
    }
    
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //get y set
     public double getBase(){
    return this.base;
    }
    public void setBase(){
    this.base=base;
    }
    public double getAltura(){
    return this.altura;
    }
    public void setAltura(){
    this.altura=altura;
    }
    
    //metodos abstractos
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }
    
    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }
    
    //to Stering
    public String toString(){
    return "el triangulo es de color: " + getColor() + " tambien tiene una altura de: " + altura + " y una base de: " + base;  
    }
}
