/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22_tema3;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * lo mismo que el 21 solo que sumando y que le salte error si pone una letra
 * @author Daniel Iglesias
 */
public class Ejercicio22_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //hacemos el scanner para pedir por pantalla y hacemos 2 variables para guardar los numeros
        Scanner entrada = new Scanner (System.in);
         int  num1;
        int num2;
        
    try {
        //las inicializamos las variables y imprimimos la division
            System.out.print("Introduce el primer número: ");
            num1 = entrada.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = entrada.nextInt();
            
           System.out.println("el resultado de dividir " + num1 + " + " + num2 + " es igual a = " + (num1 + num2));
       //en caso de que el usuario quiera dividir entre 0 le saldrea este esrror 
    } catch(java.util.InputMismatchException e) {
            System.out.println("no puedes sumar letras solo numeros");
}}}