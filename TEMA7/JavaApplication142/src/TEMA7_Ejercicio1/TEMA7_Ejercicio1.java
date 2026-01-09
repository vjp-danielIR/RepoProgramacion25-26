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
        Scanner entrada = new Scanner(System.in); //creamos el scanner
        int[] numeros = new int[10]; //hacemos el array de 10 caracteres por decirlo de alguna manera (del 0 al 9)

        for (int i = 0; i < 10; i++) { //y creamos un bucle que mientras i sea menos a 10 se volvera a repetir
            System.out.print("Introduce un número "  + ": "); //vamos pidiendo los numeros 
            numeros[i] = entrada.nextInt();
        }

        return numeros; //devuelvo al array numeros los 10 numeros que pedi 
    }

    // Método que muestra solo los números pares del array
    public static void mostrarPares(int[] numeros) {
        System.out.println("Números pares:");

        for (int i = 0; i < numeros.length; i++) { //mientras que i sea menor a la cantidad de caracteres que tiene el array seguira entrando al bucle
            if (numeros[i] % 2 == 0) { //si x posicion del array el resto es 0 
                System.out.println(numeros[i]);//lo imprimo
            }
        }
    }
}