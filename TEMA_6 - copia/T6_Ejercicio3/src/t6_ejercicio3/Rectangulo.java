/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio3;

/**
 *
 * @author danie
 */
public class Rectangulo extends FiguraGeometrica {
  //atributos propios
    private double base;
    private double altura;
    
    
    //constructores
    public Rectangulo(){
    super();
    base=0;
    altura=0;
    }
    
    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    // get y set
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
    
    //to String
    @Override
    public String toString(){
    return "El rectangulo es de color: " + getColor() + " tiene una base de: " + base + " y una altura de: " + altura; 
    }
    
    
    //metodo abstracto
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
