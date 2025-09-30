
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio26;
import java.util.Scanner;
        
/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numeros = new Scanner (System.in);
        System.out.println(" Dime  4 nuemros: " );
        
          int num1 = numeros.nextInt();
          int num2 = numeros.nextInt();
          int num3 = numeros.nextInt();
          int num4 = numeros.nextInt();
          
          System.out.println(" El primer numero es : " + num1 + " el segundo:" + num2 + " el tercero es: " + num3 + " el cuerto es: " + num4);
    }
    
}
