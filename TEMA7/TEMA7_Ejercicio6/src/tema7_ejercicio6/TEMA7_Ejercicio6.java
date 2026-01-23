/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio6;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primos = new int[8];
        int num = 1;
        int contador = 0;

        while (contador < 8) {
            if (esPrimo(num)) {
                primos[contador] = num;
                contador++;
            }
            num++;
        }

        // Mostrar el array
        for (int i = 0; i < primos.length; i++) {
            System.out.print("[" + i + "] - " + primos[i]);
            if (i < primos.length - 1) {
                System.out.print("; ");
            }
        }
    }

    // Función simple para saber si un número es primo
    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
