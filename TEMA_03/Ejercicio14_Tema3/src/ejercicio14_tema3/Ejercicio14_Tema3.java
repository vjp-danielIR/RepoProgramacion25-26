/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14_tema3;

/**
 *  mostrar  100 numeros pares
 * @author Daniel Iglesias 
 */
public class Ejercicio14_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0; 
        // Contador de pares
        int contador = 0;

        do {
            // Solo imprimimos si es par
            if (num % 2 == 0) {
                System.out.println(num);
                contador++; // solo aumentamos contador si imprimimos un par
            }

            // Pasamos al siguiente número
            num++;
            

        } while (contador < 100); // hasta imprimir 100 números pares
    }
}
