/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio12_medio;

import java.util.Scanner;
import java.util.InputMismatchException; //importamos los paquetes necesarios 

/**
 *
 * @author daniel
 */
public class T1234Ejercicio12_Medio {

    /**
     * @param args the command line arguments
     * 
     * Complementa el ejercicio anterior con un método que ordene los 3 números de menor a mayor utilizando el método de la burbuja.
     */
    public static void main(String[] args) {
      //variables
        int num1=0,num2=0,num3=0;
        boolean correcto=false;
        Scanner entrada= new Scanner(System.in); //creamos el scanner y como son del mismo tipo puedo usar solo este para los 3 numeros 
        do {
            try {
      
        System.out.println("dime un numero"); //pido el primer numero 
        num1=entrada.nextInt(); // y lo guardo
        System.out.println("Dime otro numero"); //pido el segundo
        num2=entrada.nextInt(); //y lo guardo
        System.out.println("Dime un ultimo numero"); //pido el ultimo
        num3=entrada.nextInt(); //y lo guardo
       
        // si no hubo excepción el valor de correcto se pone en true para salir del bucle
                correcto = true;
                
        } catch (InputMismatchException e) {
                System.out.println("Valor no permitido tiene que ser un numero.");
                entrada.next(); // Limpiar el scanner para que no se quede en bucle
            }

        } while (!correcto); // El bucle sigue hasta que "correcto" sea true
        mayorQue(num1,num2,num3); //se lo paso al metodo estatico
    }
    public static void mayorQue(int num1,int num2,int num3){
      // el metodo de la burbuja consiste en ir cambiandolo con un auxiliar  para poder ordenarlos
        // aplicamos burbuja para ordenar de menor a mayor
        if (num1 > num2) {  // comparamos 1 y 2
            int temp = num1;
            num1 = num2; 
            num2 = temp;
        }
        if (num2 > num3) {  // comparamos 2 y 3
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {  // repetimos 1 y 2 por si cambiaron antes con el num 3
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Mostramos los números ordenados
        System.out.println("numeros ordenados de menor a mayor: ");
        System.out.println(num1 + "- " + num2 + " - " + num3);
        
    }
}