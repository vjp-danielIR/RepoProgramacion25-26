/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21_tema3;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Daniel Iglesias
 */
public class Ejercicio21_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         int  num1;
        int num2;
        
    try {
            System.out.print("Introduce el primer número: ");
            num1 = entrada.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = entrada.nextInt();
            
           System.out.println("el resultado de dividir " + num1 + " entre " + num2 + " es igual a = " + (num1 / num2));
       
    } catch(ArithmeticException e) {
            System.out.println("no puedes dividir entre 0");
}}}
