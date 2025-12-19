/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio3;

/**
 *
 * @author danie
 */
public class Cuadrado extends FiguraGeometrica {
    //atributo
    private double lado;
    
    //constructores
    public Cuadrado(){
    super();
    lado=0;
    }
    
    
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }
    
    //get y set
    public double getLado(){
    return this.lado;
    }
    public void setLado(){
    this.lado=lado;
    }
    
    //metodos abstractos
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

