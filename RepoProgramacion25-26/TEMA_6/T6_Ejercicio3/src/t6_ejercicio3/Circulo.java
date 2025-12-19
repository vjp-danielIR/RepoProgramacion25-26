/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio3;

/**
 *
 * @author danie
 */
public class Circulo  extends FiguraGeometrica {
    //atributo
    private double radio;
    
    //constructores
    public Circulo(){
    super();
    radio=0;
    }
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    //get y set
    
    public double getRadio(){
    return this.radio;
    }
    
    public void setRadio(double radio){
    this.radio=radio;
    }
    
    
    //metodos abstractos
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // no se si era asi osea lo he puesto por lo que recuerdo de clase
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    //to String
    @Override
    public String toString(){
    return "El cirulo es de color: " + getColor() + " y tinene un radio de: " + radio;
    }
}

