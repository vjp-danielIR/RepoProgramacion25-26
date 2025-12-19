/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17_tema3;
import java.util.Scanner;
/**
 *  la raiz cuadrada de x numero positivo
 * @author Daniel Iglesias
 */
public class Ejercicio17_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner (System.in);
         float num;
        do { 
            System.out.println("Dime un numero");
        num = entrada.nextFloat();
        
        if (num < 0) {
        System.out.println("El número debe ser positivo.");
          }
        }  while (num < 0);
         double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada es = " + raiz);
    }
}