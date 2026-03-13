/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio4;
//importo los metodos
import java.util.Scanner;
import t4_ejercicio4.comprobador;
/**
 *
 * @author daniel
 */
public class T4_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int resultado;//creo variable resultado
       Scanner entrada = new Scanner(System.in);//guardo lo que me de el usuario
    System.out.println("Dime un numero");//imprimo por pantalla para pedir
    int num1 = entrada.nextInt();//lo guardo en num1
    
    System.out.println("Dime otro numero");//otro num2
    int num2 = entrada.nextInt();
    
    System.out.println("Dime otro numero");// y num 3
    int num3 = entrada.nextInt();
    //llamo a mi metodo y el resultado de la comparacion lo guardo en la variable resultado y la imprimo por pantalla
    resultado = t4_ejercicio4.comprobador.menor(num1, num2, num3);
        System.out.println(resultado);
    }
    
}
