/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio26_intermedio;
import java.util.Scanner; //importamos lo necesario
/**
 *
 * @author alumno
 */
public class T1234Ejercicio26_Intermedio {

    /**
     * @param args the command line arguments
     * 
     * Simula un cajero: pide un importe y descompónlo en billetes (50, 20, 10, 5) y monedas (2,1).
     */
    public static void main(String[] args) {
        
        //creamos el scanner
        Scanner entrada= new Scanner(System.in);
        
        //variable
        int ingreso, bi50,bi20,bi10,bi5,mo1;
        
        System.out.println("Cuanto quieres ingresar?: ");
        ingreso=entrada.nextInt();
        
       
         bi50 = ingreso / 50;
        ingreso = ingreso % 50;

         bi20 = ingreso / 20;
        ingreso = ingreso % 20;

        bi10 = ingreso / 10;
        ingreso = ingreso % 10;

         bi5 = ingreso / 5;
        ingreso = ingreso % 5;

         mo1 = ingreso;
         System.out.println("Desglose de tu ingreso:");
        System.out.println("Billetes de 50: " + bi50);
        System.out.println("Billetes de 20: " + bi20);
        System.out.println("Billetes de 10: " + bi10);
        System.out.println("Billetes de 5: " + bi5);
        System.out.println("Monedas de 1: " + mo1);
         
                
    }
    
}
