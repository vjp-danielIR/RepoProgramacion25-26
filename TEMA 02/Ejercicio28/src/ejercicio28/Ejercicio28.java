/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio28 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mb = new Scanner (System.in);
        
        System.out.println(" Dime el tamaño del archivo en MB= ");
       int tamaño = mb.nextInt();
        
        System.out.println("Dime lo que tarda el archivo en descargar  en segundos Mbits = ");
        int velocidad = mb.nextInt();
        
         int tiempo = (tamaño * 8) / (velocidad * 60);
        
         System.out.println("El archivo tardaria " + tiempo + " minutos ");
        
    }
    
}
