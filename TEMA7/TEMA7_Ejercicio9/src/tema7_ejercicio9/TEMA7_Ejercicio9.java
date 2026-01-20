/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int numero = pedirNumero();
        int contar = contarCaracteres(numero);
        int[] cifras = dividirEnCifras(numero, contar);
        mostrarAlReves(cifras);
    }

    // metodo que pide el número al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num= entrada.nextInt();
        return num;
    }

    //metodo que cuenta cuantas cifras tiene el número
    public static int contarCaracteres(int numero) {
        int contador = 0;

        while (numero >= 0) {
            numero = numero / 10;
            contador++;
        }

        return contador;
    }

    // metodo que divide el número en cifras y guardarlas en un array
    public static int[] dividirEnCifras(int numero, int contar) {
        int[] reves = new int[contar];

        for (int i = 0; i < reves.length; i++) {
            reves[i] = numero % 10;
            numero = numero / 10;
          
        }
        return reves;
    }

    // metodo que muestra el array al reves
    public static void mostrarAlReves(int[] reves) {
        System.out.print("El numero al reves es: ");

        for (int i = 0; i < reves.length; i++) {
            System.out.print(reves[i]);
            System.out.println("");
        }
    }
}
