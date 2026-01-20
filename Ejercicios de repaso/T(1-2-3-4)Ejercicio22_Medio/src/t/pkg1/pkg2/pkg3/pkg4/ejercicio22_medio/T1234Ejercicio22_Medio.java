/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio22_medio;
 import java.util.Scanner; //importamos lo necesario
/**
 *
 * @author alumno
 */
public class T1234Ejercicio22_Medio {

    /**
     * @param args the command line arguments
     * 
     * Crea un programa que pida al usuario su peso y su altura y determine su índice de masa corporal (peso entre altura al cuadrado).
     */
    public static void main(String[] args) {
        //variabales
        double peso, altura;
        //scanner
     Scanner entrada = new Scanner(System.in);
        System.out.println("Dime tu altura"); //pido por pantalla
         altura = entrada.nextDouble(); //y lo guardo
        System.out.println("Ahora dime tu peso"); //vuelvo a pedir
         peso = entrada.nextDouble(); //y lo vuelvo a guardar
         
         System.out.println(" Su IMC  es de:" + (peso/Math.pow(altura,2))); //math pow es para multiplicarlo x veces 
    }
    
}
