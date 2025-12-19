/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 * CALCULOS DE CUANTOS BILLETES TIENE DE CADA
 * 
 * @author Daniel Iglesias
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner billetes = new Scanner(System.in);
        System.out.println("Dime cuánto dinero tienes: ");
        //PIDO POR PANTALLA CUANTO TIENE Y LO GUARDO EN DINERO 
         int dinero = billetes.nextInt();
        //DIVIDO ENTRE 50 EUROS Y GUARDO EL RESTO EN LA MISMA VARIABLE Y ASI SUCESIVAMENTE
        int b50 = dinero / 50;  
        dinero = dinero % 50;
     
        //DE  BILLETES DE 20
        int b20 = dinero / 20;     
        dinero = dinero % 20; 
       
        //BILLETES DE 10
         int b10 = dinero / 10;
        dinero = dinero % 10;
       
        //BILLETES DE 5
        int b5 = dinero / 5;
        dinero = dinero % 5;
        //MONEDAS DE 2 Y DE 1
        int b2 = dinero / 2;
        dinero = dinero % 2;
        
        int b1 = dinero / 1;
        dinero = dinero % 1;
        
        
            //IMPRIMO CUANTOS BILLETES TIENE DE CADA
        System.out.println("Tienes " + b50 + "billetes de 50" + " con " + b20 + "billetes de 20" + " y " + b10 + "billetes de 10" + " con " + b2 +" monedas de 2 y " + b1 + " monedas de 1");
    }
}