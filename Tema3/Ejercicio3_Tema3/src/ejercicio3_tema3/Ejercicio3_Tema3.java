/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_tema3;
 import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio3_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        //pedir primer numero
        System.out.print("introduzca el primer número: ");
        int num1 = entrada.nextInt();
        //el segundo
        System.out.print("introduzca un segundo número: ");
        int num2 = entrada.nextInt();
            //el tercero
        System.out.print("introduzca un tercer número: ");
        int num3 = entrada.nextInt();
            
        //solo necesito un  Scanner entrada por que todos los valores son del mismo tipo
        int mayor;

        // Determinar el mayor de los tres números
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El número mayor de los introducidos es el " + mayor);
    }
    
}
