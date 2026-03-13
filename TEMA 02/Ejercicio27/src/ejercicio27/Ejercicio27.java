
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
 import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner numeros = new Scanner (System.in);
       
        System.out.println("dime el numero del que quieres saber su doble y su cubo = ");
        int numero = numeros.nextInt();
        System.out.println("el doble de" + numero + " es igual a = " + (numero*2));
        System.out.println("el cubo de " + numero + " es igual a = " + (numero * numero * numero));

        
        
    }
    
}
