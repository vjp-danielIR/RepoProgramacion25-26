/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        int resulA = -a + 5 % b - a * a;
        int resulB = 5 + 3 % 7 * b * a - b % a;
        int resulC = (a + 1) * (b + 1) - b / a;

        System.out.println(" la operacion = -a + 5 % b - a * a es igual a =" + resulA);
        System.out.println("La operacion:  5 + 3 % 7 * b * a - b % a es igual a = " + resulB);
        System.out.println("La operacion: (a + 1) * (b + 1) - b / a; es igual a =" +  resulC);   
    }
    
}
