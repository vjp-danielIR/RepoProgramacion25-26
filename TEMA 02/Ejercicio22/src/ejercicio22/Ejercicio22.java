/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
 import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner radio1 = new Scanner (System.in);
       
       System.out.println(" dime la longitud que quieres que tenga el radio = ");
       
       float radio = radio1.nextFloat();
       
       double area = Math.PI*radio*radio;
        System.out.println(" El area del radio que me has entregado es igual a = " + area);
    }
    
}

