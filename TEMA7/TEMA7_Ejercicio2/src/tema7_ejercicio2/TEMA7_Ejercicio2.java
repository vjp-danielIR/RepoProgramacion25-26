/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //creamos el array con 7 caracteres
        int[] numeros = new int[7]; 
        
       //lo llevamos a los metodos
        introducirDatos(numeros);
        mostrarArray(numeros);
        intercambiar(numeros);
        mostrarArray(numeros);
    }

    // metodo para introducir los datos
    public static void introducirDatos(int[] numeros) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) { //mientras i sea menor que la cantidad de caracteres del array volvera a entrar
            System.out.print("Introduce un número " + ": ");
            numeros[i] = entrada.nextInt();
        }
    }

    // metodo para mostrar el array
    public static void mostrarArray(int[] numeros) {
        System.out.println("\nContenido del array:");
        for (int i = 0; i < numeros.length; i++) { //mientras i sea menor que la cantidad de caracteres seguira mostrando el array
            System.out.print(numeros[i] + " ");
        }
       
    }

    // metodo para intercambiar la 2da y 4ta posición
    public static void intercambiar(int[] numeros) {
        int aux;

        aux = numeros[1];      // guardamos el valor de la 2ª posición
        numeros[1] = numeros[3]; // ponemos el de la 4ª en la 2ª
        numeros[3] = aux;      // ponemos el guardado en la 4ª
        for(int i=0; i<numeros.length;i++){
            System.out.println("array actual:" + i);
        }
    }
}