/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio11;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = new int[10]; // Creamos el array de 10 elementos
        
        rellenarArray(numero); // Rellenamos con números aleatorios sin repetir
        visualizarArray(numero); // Mostramos el array
    }

    // Método que rellena el numero con números del 0 al 9 sin repetir
    public static void rellenarArray(int[] numero) {
        int i = 0;
        while (i < numero.length) {
            int num = (int)(Math.random() * 10); 
            boolean repetido = false;

            // Comprobamos si ya está en el numero
            for (int j = 0; j < i; j++) {
                if (numero[j] == num) {
                    repetido = true;
                    
                }
            }

            // Si no está repetido, lo añadimos
            if (!repetido) {
                numero[i] = num;
                i++;
            }
        }
    }

    // Método que muestra el array en pantalla
    public static void visualizarArray(int[] numero) {
        System.out.println("Se ha generado el siguiente array:");
        for (int num : numero) {
            System.out.print(num + " ");
        }
    }
}