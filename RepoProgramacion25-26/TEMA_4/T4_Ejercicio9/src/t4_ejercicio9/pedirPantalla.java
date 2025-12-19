/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_ejercicio9;
import java.util.Scanner;
/**
 * pedir por pantalla
 * @author daniel
 */
public class pedirPantalla {
    public static int pedirPantalla(){
        int num;
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("introduzca un número: ");
             num = entrada.nextInt();
    
    
             return num ;
    }
}
