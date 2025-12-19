/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio3;

/**
 *
 * @author danie
 */
abstract class FiguraGeometrica {
    //atributos
    private String color;
    
    //constructores
    public FiguraGeometrica(){
    color="";
    }
    
    public FiguraGeometrica(String color) {
        this.color = color;
    }
    // getter y setter
    public String getColor(){
    return this.color;
    }
    
    public void setColor(String color){
    this.color=color;
    }
    
    //metodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    //to String
    @Override
    public String toString(){
    return "la figura geometrica es de color: " + color;
    }
}
