
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio26;
import java.util.Scanner;
        
/**
 *MOSTRAR NUMEROS POR SEPARADO
 * @author Daniel Iglesias
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numeros = new Scanner (System.in);
        System.out.println(" Dime  4 nuemros: " );
        //VOY DIVIDIENDO Y SACANDO CADA NUMERO 
          int num1 = numeros.nextInt();
          int num0 = num1 / 1000; 
          int num2 = (num1 %1000) /100;
          int num3 = ((num1%1000)%100) / 10;
          int num4 = (((num1%1000)%100)%10);
          
          System.out.println(" El primer numero es : " + num0 + " el segundo:" + num2 + " el tercero es: " + num3 + " el cuerto es: " + num4);
    }
    
}
