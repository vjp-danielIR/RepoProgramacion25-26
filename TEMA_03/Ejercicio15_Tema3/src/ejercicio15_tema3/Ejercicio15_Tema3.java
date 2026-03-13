/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_tema3;
import java.util.Scanner;
/**
 * crear una table de multiplicar
 * @author Daniel Iglesias
 */
public class Ejercicio15_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // pedimos por pantalla del numero que quiere saber la table de multiplicar
        Scanner entrada = new Scanner(System.in); 
        
        System.out.print("Dime un número para calcular su tabla de multiplicar: ");
      
        // Se guarda la variable en numero
        int num = entrada.nextInt(); 
        
        System.out.println("Tabla de multiplicar del " + num);
        
        // Bucle para generar la tabla del 0 al 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}