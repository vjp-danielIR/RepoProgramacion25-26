/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27_tema3;

import java.util.Scanner;
/**
 * hacer un menu y hacer lo que el usuario requiera de esas opciones
 * @author Daniel Iglesias
 */
public class Ejercicio27_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num1;
     int num2;
     int opcion;
      Scanner entrada = new Scanner (System.in);
       
      try {
            System.out.print("Introduce el primer número: ");
            num1 = entrada.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = entrada.nextInt();
           
          
       do { 
          
           System.out.println("_______MENU_______");
           System.out.println("1. sumar los dos numeros");
           System.out.println("2. restar los dos numeros");
           System.out.println("3. multiplicar los dos numeros");
           System.out.println("4. dividir los dos numeros");
           System.out.println("5. salir del programa");
            opcion = entrada.nextInt();
        
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                        break;
                    case 4:
                            System.out.println("Resultado de la división: " + ( num1 / num2));
                          break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                           System.out.println("opcion invalida");
                           break;
                }
        } while (opcion != 5);
      }
        catch(ArithmeticException e) {
                            System.out.println("no puedes dividir entre 0"); 
                               } 
       }}