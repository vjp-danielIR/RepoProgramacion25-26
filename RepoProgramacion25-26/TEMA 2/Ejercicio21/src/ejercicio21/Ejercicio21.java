
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
 import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Ejercicio21 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner segundos1 = new Scanner(System.in);
        System.out.println(" Dime cuantos segundos quieres calcular a horas minutos: ");
        
        int segundos = segundos1.nextInt();
        
        int horas = segundos / 3600;        
        int minutos = (segundos % 3600) / 60;   
        int segundos2 = segundos % 60;  
        System.out.println(segundos + " segundos hacen un total de: " + horas + " horas "   + minutos + " minutos y "   + segundos2 + " segundos");
        
    }
    
}
