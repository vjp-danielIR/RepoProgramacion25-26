/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio15;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author danie
 */
public class T4_Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int num1,num2;
        
        try {
                System.out.print("Dime un numero ");
                num1 = entrada.nextInt();
                System.out.print("Dime otro numero ");
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
                      
            }
                 } while (opcion != 5);
                            }
          catch(ArithmeticException e) {
               System.out.println("no puedes dividir entre 0"); 
                System.out.println(e);
                     } 
         catch(InputMismatchException e) {
               System.out.println("no pueden ser letras solo numeros"); 
                System.out.println(e);
                     } 
    }
}