/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13_tema3;

/**
 *   Mostrar los numeros pares desde el 12 hasta el 133
 * @author Daniel Iglesias
 */
public class Ejercicio13_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num = 11; // Número inicial

        // hacemos que el bucle compruebe si x numero es par o impar si es y sumamos 
        //1 hasta que el while compare si el numero es mayor o igual que 133
     // Condición para seguir el bucle
        while (num <= 133){ 
            // Comprobamos si el número es par
            if (num % 2 == 0) {
                System.out.println(num);
            }
            // Sumamos 1
            num++;
        } 
    }
}
    
  