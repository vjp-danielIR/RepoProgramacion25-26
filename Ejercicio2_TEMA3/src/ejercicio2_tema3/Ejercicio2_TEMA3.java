/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio2_TEMA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Dime un numero");
        int num1 = entrada.nextInt();
        System.out.println("Dime otro numero");
        int num2 = entrada.nextInt();
        
        if (num1 >= 10 ){
            System.out.println(" la multiplicacion de =" + num1 + " por " + num2 + " es igual a =" + num1 * num2);
       } else {
            System.out.println("La suma de :" + num1 + " y " + num2 + " es igual a =" + (num1 + num2));
                   
    }
    }
    
}
