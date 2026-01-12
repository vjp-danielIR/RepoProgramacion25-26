/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TEMA7_Ejercicio1;
import java.util.Scanner; //importamos para poder pedir al usuario
/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = pedirNumeros(); //creamos el array connombre numeros y el contenido se lo pedimos al usuario
        mostrarPares(numeros);
    }

    // Método que pide 10 números y los guarda en un array
    public static int[] pedirNumeros() { //statis para que pertenezca a la clase  y va a devolver el array
        Scanner entrada = new Scanner(System.in); 
        int[] numeros = new int[10]; //hacemos el array de 10 caracteres

        for (int i = 0; i < 10; i++) { 
            System.out.print("Introduce un número "  + ": ");
            numeros[i] = entrada.nextInt();
        }

        return numeros; //devuelvo los numeros que pedi
    }

    // Método que muestra solo los números pares del array
    public static void mostrarPares(int numeros[]) {
        System.out.println("Números pares:");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { //si x posicion del array el resto es 0 
                System.out.println(numeros[i]);
            }
        }
    }
}