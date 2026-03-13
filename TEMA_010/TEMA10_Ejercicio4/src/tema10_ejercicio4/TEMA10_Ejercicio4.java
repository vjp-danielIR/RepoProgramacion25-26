/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio4;

import java.util.*;

/**
 *
 * @author Daniel
 */
public class TEMA10_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        rellenarNumeros(numeros);

        System.out.println("original:");
        mostrarNumeros(numeros);

        comprobarRepetidos(numeros);

        System.out.println("Despues de  sustituir duplicados:");
        mostrarNumeros(numeros);
    }

    public static void rellenarNumeros(ArrayList<Integer> numeros) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Introduce números enteros positivos (un negativo para terminar):");
        do {
            System.out.print("Número: ");
            num = entrada.nextInt();
            if (num >= 0) {
                numeros.add(num);
            }
        } while (num >= 0);
    }
    //metodo que mostrara el arrayList 
    public static void mostrarNumeros(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));

        }
    }
    //metodo que comprueba los numeros repetidos
    public static boolean comprobarRepetidos(ArrayList<Integer> numeros) {
        boolean repetido = false;
        if (numeros.indexOf(numeros) != numeros.lastIndexOf(numeros)) {
            repetido = true;
        }
        return repetido;
    }
    // metodo que sustituye los numeros repetidos
    public static void sustituirRepetidos(ArrayList<Integer> numeros) {
        int numAc;
        for (int i = 0; i < numeros.size(); i++) {
            numAc = numeros.get(i);
            if (comprobarRepetidos(numeros)) {
                for (int j = 1 + i; j < numeros.size(); j++) {
                    if (numeros.get(j) == numAc) {
                        numeros.set(j, 0);

                    }

                }
            }
        }
    }

}
