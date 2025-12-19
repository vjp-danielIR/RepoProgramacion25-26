/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio3;

/**
 *
 * @author danie
 */
public class TrianguloRectangulo extends Triangulo {
    //no tiene atributos
    //constructores
    public TrianguloRectangulo(){
    super();
    }
    
    public TrianguloRectangulo(String color, double base, double altura) {
        super(color, base, altura);
    }
    
    
    //metodo propio
    public String determinarTipo() {
        double hipotenusa = calcularHipotenusa();
        
        if (getBase() == getAltura() && getBase() == hipotenusa) {
            return "Equilatero";
        } else if (getBase() == getAltura() || getBase() == hipotenusa || getAltura()== hipotenusa) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}
