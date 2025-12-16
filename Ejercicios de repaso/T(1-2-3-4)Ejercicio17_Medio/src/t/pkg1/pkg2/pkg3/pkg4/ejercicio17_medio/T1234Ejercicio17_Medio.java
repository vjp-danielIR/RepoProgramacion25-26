/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio17_medio;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class T1234Ejercicio17_Medio {

    /**
     * @param args the command line arguments
     * 
     * Suma los números del 1 al n (n ingresado
     */
    public static void main(String[] args) {
       //variable
       int suma = 0;
        // creamos scanner
        Scanner entrada= new Scanner(System.in);
        //pedimos por pantalla
        System.out.println("Dime un numero: ");
        int num = entrada.nextInt(); //lo guardamos en num
      for (int i = 1; i <= num; i++) {
            suma += i; // suma = suma + i
        }

        System.out.println("La suma de los números del 1 al " + num + " es: " + suma);
    }
    }
   
