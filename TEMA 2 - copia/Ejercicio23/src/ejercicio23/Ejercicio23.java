
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner precio1 = new Scanner(System.in);
        System.out.println(" Cuanto cuesta el producto deseado = ");
        
        float precio2 = precio1.nextFloat();
        
        Scanner cantidad1 = new Scanner(System.in);
         System.out.println(" Que cantidad desea = ");
         int cantidad2 = cantidad1.nextInt();
         
       float  precioTotal = precio2 * cantidad2;
        System.out.println("Cuesta = " + precioTotal);
    }
    
}

