/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12_tema3;

/**
 *  Mostrar 100 primeros numeros pares desde el 11
 * @author Daniel Iglesias
 */
public class Ejercicio12_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 11; // Número inicial

        // hacemos que el bucle compruebe si x numero es par o impar si es y 
        //sumamos 1 hasta que el while compare si el numero es mayor o igual que 133
        do {
            // Comprobamos si el número es par
            if (numero % 2 == 0) {
                System.out.println(numero);
            }

            // sumamos 1
            numero++;
        } while (numero <= 133); // Condición para seguir el bucle
    }
}