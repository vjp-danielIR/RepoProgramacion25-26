/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_tema3;
import java.util.Scanner;
/**
 * PAR O IMPAR
 * @author Daniel Iglesias
 */
public class Ejercicio5_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //corregido
        //pido por pantalla y lo guardo 
         Scanner entrada = new Scanner(System.in);

        System.out.print("introduzca un número: ");
        int num = entrada.nextInt();
        
            //Calcula el resto de dividir num entre 2 
        if (num % 2 == 0) {
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }

    }
    
}
