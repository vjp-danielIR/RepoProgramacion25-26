/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio10;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4_Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // imprimir por el main 
        int numero;
        Scanner entrada = new Scanner (System.in);
        System.out.println("dime el numero del que quieres la tabla de multiplicar: ");
        numero = entrada.nextInt();//pido por pantalla el numero que quiere 
        tablaMultiplicar(numero);//llamo al metodo que hara la tabla de multiplicar
        
    }
    //crear la table en otro metodo
    public static void tablaMultiplicar(int numero) {
        //voy sumando 1 para que lo imprima desde el 0 hasta el 10 
            for (int i = 0; i <= 10; i++) {//aqui hago que i sea 0 y que se valla sumando simpre que no supere el num 10
            System.out.println(numero + " x " + i + " = " + 
                    /*aqui multiplico el numero que me dio el usuairo con el numero de la tabla*/(numero * i));
        }
}
 }