/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9_ejercicio2;

import java.util.Scanner; //para pedir al usuraio
/**
 *
 * @author alumno
 */
public class TEMA9_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in); //creamos el scanner
        String palabra;
        System.out.println("Dime alguna palabra");
        
        palabra=entrada.next();
        
       for(int i=0; i<palabra.length();i++){
           System.out.println(palabra.charAt(i));}
    
    
    
    }
    
}
