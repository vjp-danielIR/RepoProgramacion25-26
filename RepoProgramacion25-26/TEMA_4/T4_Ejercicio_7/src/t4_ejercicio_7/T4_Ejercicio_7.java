/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio_7;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class T4_Ejercicio_7 {

    /**
     * @param args the command line arguments
     * Metodo para pedir por pantalla los 4 numeros al usuairo
     */
    public static void main(String[] args) {
     int a, b, c, d;
     
        Scanner entrada = new Scanner(System.in);
              System.out.print("Introduce un numero ");
            a = entrada.nextInt();
            
             System.out.print("Introduce un numero ");
           b = entrada.nextInt();
            
            System.out.print("Introduce un numero");
            c = entrada.nextInt();
            
             System.out.print("Introduce un numero ");
            d = entrada.nextInt();
            
            ordenarNum(a, b, c, d);
               
    }
    
    /**
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * Metodo para cambiar los numeros de sitios de menor a mayor
     */
    public static void ordenarNum(int a, int b, int c, int d){ 
       int temp;
       //bucle que compara y cambia de lugar los numeros parra ordenarlos
           while (!(a < b && a < c &&  a < d && b < c && b < d && c < d)){
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
}}