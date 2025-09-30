/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner billetes = new Scanner(System.in);
        System.out.println("Dime cuánto dinero tienes: ");
        
         int dinero = billetes.nextInt();

        int b50 = dinero / 50;  
        dinero = dinero % 50;

        int b20 = dinero / 20;     
        dinero = dinero % 20; 
        
        int b10 = dinero / 10;
        dinero = dinero % 20;
        
        
        int b5 = dinero / 5;
        dinero = dinero % 5;
        
        int b2 = dinero / 2;
        dinero = dinero % 2;
        
        int b1 = dinero / 1;
        dinero = dinero % 1;

        System.out.println("Tienes " + b50 + "billetes de 50" + " con " + b20 + "billetes de 20" + " y " + b10 + "billetes de 10" + " con " + b2 + b1 + "monedas de 2 y de 1");
    }
}