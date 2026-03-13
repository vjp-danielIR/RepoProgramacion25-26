

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);

        System.out.print("introduzca el primer número = ");
        int num1 = numeros.nextInt();

        System.out.print(" introduzca el segundo número = ");
        int num2 = numeros.nextInt();
        
        System.out.print("introduzca el tercer número = ");
        int num3 = numeros.nextInt();

        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;

        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);
    }
    
}

