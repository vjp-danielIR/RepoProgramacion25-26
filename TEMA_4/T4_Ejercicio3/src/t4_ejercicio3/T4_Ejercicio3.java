/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio3;
//importo scanner y mi metodo
import java.util.Scanner;
import metodo.comprobador;
/**
 *
 * @author danie
 */
public class T4_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado; //creo la variable resultado
       Scanner entrada = new Scanner(System.in);//guardo lo que el usuario me vaya a dar
    System.out.println("Dime un numero");//pido por pantalla
    int num1 = entrada.nextInt(); //y lo guardo en num1
    
    System.out.println("Dime otro numero");//pido otra vez
    int num2 = entrada.nextInt();//y lo guardo en num2
    
    System.out.println("Dime otro numero");//otra vez pido
    int num3 = entrada.nextInt();//y lo vuelvo a guardar
    
    resultado = metodo.comprobador.mayor(num1, num2, num3); //llamo a mi metodo y le doy las 3 variables
        System.out.println(resultado);//imprimo por pantalla el resultado
    }
    
}
