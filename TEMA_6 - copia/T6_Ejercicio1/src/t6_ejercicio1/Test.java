/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ejercicio1;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Suma suma = new Suma(10, 5);
        Multiplicacion multiplicacion = new Multiplicacion(10, 3);
        Potencia potencia = new Potencia(2, 4);

        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();

        System.out.println("Prueba de polimorfismo");

        Calculadora cal1 = new Suma(20, 7);
        Calculadora cal2 = new Multiplicacion(6, 8);
        Calculadora cal3 = new Potencia(3, 3);
        System.out.println(cal1);
        System.out.println(cal2);
        System.out.println(cal3);
        
    }
    
}
