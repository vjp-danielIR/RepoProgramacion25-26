/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero cualquiera: ");
        int num1 = entrada.nextInt();
        numPositivo(num1);
        
    }
    public static int numPositivo(int num1){
            if (num1 > 0){
                System.out.println("El numero es positivo");
                }else if (num1 < 0){
                   System.out.println("El numero es negativo");
                } else {
                      System.out.println("el numero no puede ser 0");
                            } 
            return 0; 
     }
    }