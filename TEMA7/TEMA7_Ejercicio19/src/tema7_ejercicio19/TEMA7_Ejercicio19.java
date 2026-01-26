/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio19;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio19 {

    /**
     * @param args the command line arguments
     *
     *
     * Realiza un programa que cree un vector de 100 posiciones con números
     * aleatorios entre 10 y 80. Una vez creado este vector, el programa deberá
     * mostrar el mayor, el menor, el valor que más se repite y la media.
     *
     */
    public static void main(String[] args) {
        //creamos el array
        int[] vector = new int[100];

        //las variables que necesitaremos
        int min = 10;
        int max = 80;
        int mayor = vector[0];
        int menor = vector[0];
        int media = 0;
        int suma = 0;

        //rellenamos el array contre min(10) y max(80) 
        for (int i = 0; i < 100; i++) {
            vector[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(vector[i]);
        }
        //saber que numeros es el mayor
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];

            }
        }
        System.out.println("El numero mas grande es: " + mayor);

        //para saber el menor
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < menor) {
                menor = vector[i];

            }
        }
        System.out.println("El numero mas pequeño es: " + menor);

        //para sumar cuantos repetidos hay
        int veces = 0;
        int numeroRepetido = 0;

        for (int i = 0; i < vector.length; i++) {
            int contador = 0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    contador++;
                }
            }
            if (contador > veces) {
                veces = contador;
                numeroRepetido = vector[i];
            }
        }

        System.out.println("El numero mas repetido es " + numeroRepetido);

        //para saber la media de todos los numeros
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
            media = suma / vector.length;
        }

        System.out.println(
                "La media de todos los numeros es igual a: " + media);

    }
}
