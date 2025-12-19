/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_tema3;
import java.util.Scanner;
/**
 * PROGRAMA DE SUMA O MULTIPLICACIÓN SEGÚN EL PRIMER NÚMERO
 * @author Daniel Iglesias
 */
public class Ejercicio2_TEMA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos por pantalla
        Scanner entrada = new Scanner (System.in);
        System.out.println("Dime un numero");
        int num1 = entrada.nextInt(); //guardo la primera variable en num1 
        System.out.println("Dime otro numero");
        int num2 = entrada.nextInt(); 
        //la segunda en num2 y puedo hacerlp por que estoy pidiendo del mismo valor es decir un nunmero
         
        //si num 1 es mayor o igual a 10 se multiplicara si no se sumara
        if (num1 >= 10 ){
            System.out.println(" la multiplicacion de =" + num1 + " por " + num2 + " es igual a =" + num1 * num2);
       } else {
            System.out.println("La suma de :" + num1 + " y " + num2 + " es igual a =" + (num1 + num2));
                   
    }
    }
    
}
