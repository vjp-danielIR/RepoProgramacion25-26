/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9_tema3;
import java.util.Scanner;
/**
 * ORDENAR EN ORDEN
 * @author Daniel Iglesias
 */
public class Ejercicio9_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos por pantalla
           Scanner entrada = new Scanner(System.in);

        System.out.print("introduzca el primer numero: ");
        int a = entrada.nextInt();

        System.out.print("introduzca un segundo numero: ");
        int b = entrada.nextInt();

        System.out.print("introduzca el tercer numero: ");
        int c = entrada.nextInt();

        System.out.print("introduzca un cuarto numero: ");
        int d = entrada.nextInt();
            //auxiliar
        int temp;
            //comparamos 
        // Primer paso: ordenar a y b
        if (a > b) {
            temp = a; a = b; b = temp;
        }

        // Ordenar c y d
        if (c > d) {
            temp = c; c = d; d = temp;
        }

        // Ordenar a y c
        if (a > c) {
            temp = a; a = c; c = temp;
        }

        // Ordenar b y d
        if (b > d) {
            temp = b; b = d; d = temp;
        }

        // Ordenar b y c
        if (b > c) {
            temp = b; b = c; c = temp;
        }

        // Mostrar resultado
        System.out.println("El orden de los números introducidos es el " + a + " - " + b + " - " + c + " - " + d);

    }
    
}
