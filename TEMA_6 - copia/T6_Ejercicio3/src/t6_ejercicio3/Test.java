/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ejercicio3;

/**
 *
 * @author danie
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
          Circulo circulo = new Circulo("Rojo", 5);
        Rectangulo rectangulo = new Rectangulo("Azul", 10, 5);
        Cuadrado cuadrado = new Cuadrado("Verde", 4);
        TrianguloRectangulo triangulo = new TrianguloRectangulo("Amarillo", 3, 4);
        
        System.out.println("Circulo: " + circulo.calcularArea());
        System.out.println("Rectangulo: " + rectangulo.calcularArea());
        System.out.println("Cuadrado: " + cuadrado.calcularArea());
        System.out.println("Triangulo: " + triangulo.calcularArea());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo: " + triangulo.determinarTipo());
        
        System.out.println("");
        System.out.println("====POLIMORFISMO====");
        System.out.println("");
        
        FiguraGeometrica fig1 = new Circulo("Naranja", 7);
        FiguraGeometrica fig2 = new Rectangulo("Morado", 8, 6);
        FiguraGeometrica fig3 = new Cuadrado("Negro", 5);
        FiguraGeometrica fig4 = new TrianguloRectangulo("Blanco", 6, 8);
        
        System.out.println("Circulo polimorfismo: " + fig1.calcularArea());
        System.out.println("Rectangulo polimorfismo: " + fig2.calcularArea());
        System.out.println("Cuadrado polimorfismo: " + fig3.calcularArea());
        System.out.println("Triangulo polimorfismo: " + fig4.calcularArea());
    }
}
