/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio5;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class T4_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pido por pantalla y guardo el resultado en num1
       Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = entrada.nextInt();
        //no sabia como representarlo asi que lo hice con un boolean preguntando si era par
        boolean resultado = comprobar.parImpar.parImpar(num1);
        System.out.println("Es par? = " + resultado);//imprimo si es true o false
    }
    
}
