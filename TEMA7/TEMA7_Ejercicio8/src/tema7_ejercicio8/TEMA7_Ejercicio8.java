/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio8;

import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero=pedirNumeros(); 
      int[] reves=delReves(numero);
        System.out.println("Antes de darle la vuelta:" + numero);
        mostrarArray(reves);
    }
    
    public static int pedirNumeros(){ 
        Scanner entrada= new Scanner(System.in);
    
        System.out.println("Dime 5 numeros: ");
         return entrada.nextInt();
 
    }
    //metodo que le da le da la vuelta a los numeros
    public static int[] delReves( int numero){
        int[] reves = new int[5];

        for (int i = 0; i < 5; i++) {
            reves[i] = numero % 10;
            numero = numero / 10;
          
        }
        return reves;
    }
    //metodo que muesta el array
    public static void mostrarArray(int[] reves) {
        for (int i = 0; i < reves.length; i++) {
            System.out.print(reves[i]);
            System.out.println("");
        }
    }
}