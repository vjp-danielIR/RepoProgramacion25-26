/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4_ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA4_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); //integer es ula forma de poner un int 
        rellenarLista(numeros); //rellena el array de numeros
        mostrarLista(numeros); //al terminar de rellenarlos los mostrara
        cambiarRepetidos(numeros); //ahora cambiara las posiciones del 2 al 4 y del 4 al 2

    }

    // Pide números al usuario y los añade a la lista hasta que introduce un negativo
    public static void rellenarLista(ArrayList<Integer> numeros) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número positivo: ");
            num = entrada.nextInt();
            if (num >= 0) {
                numeros.add(num); //Añade un numero al array
            }
        } while (num >= 0);
    }

    // Muestra por pantalla todos los elementos de la lista
    public static void mostrarLista(ArrayList<Integer> numeros) {
        System.out.println("\n===== LISTA DE NUMEROS =====");
        for (int i = 0; i < numeros.size(); i++) { // size() devuelve el numero de elementos que tiene la lista

            System.out.println((i + 1) + ". " + numeros.get(i));
        }
        System.out.println("");
    }
    //metodo que cada vez que 
    public static void cambiarRepetidos(ArrayList<Integer> numeros) {
         int num = 0;
        while (num < numeros.size()) {
            int valorActual = numeros.get(num);
            if (valorActual != 0) {
                int j = num + 1;
                boolean hayCopia = false;

                while (j < numeros.size()) {
                    if (numeros.get(j) == valorActual) {
                        hayCopia = true;
                        numeros.set(j, 0);
                    }
                    j++;
                }
                if (hayCopia) {
                    numeros.set(num, 0);
                }
            }
            num++;
        }
    }
    }
