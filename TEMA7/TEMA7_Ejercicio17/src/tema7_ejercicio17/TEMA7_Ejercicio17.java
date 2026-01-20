/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio17;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];

        rellenar(numeros);

        System.out.println("Array original:");
        mostrarNumeros(numeros);

        ordenarMayorMenor(numeros);

        System.out.println("Array ordenado de mayor a menor:");
        mostrarNumeros(numeros);
    }

    // Rellena el array con numeros aleatorios del 0 al 9
    static void rellenar(int[] numeros) {
        int i = 0;
        while (i < numeros.length) {
            numeros[i] = (int) (Math.random() * 10) ;
            i++;
        }
    }

    // Muestra los elementos del array en una linea
    static void mostrarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    // Ordena el array de mayor a menor
    static void ordenarMayorMenor(int[] numeros) {
        int num = 0;
        while (num < numeros.length - 1) {
            int j = num + 1;
            while (j < numeros.length) {
                if (numeros[num] < numeros[j]) {
                    int temporal = numeros[num];
                    numeros[num] = numeros[j];
                    numeros[j] = temporal;
                }
                j++;
            }
            num++;
        }
    }
}
