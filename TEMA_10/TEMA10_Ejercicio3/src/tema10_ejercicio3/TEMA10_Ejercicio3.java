/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio3;

import java.util.*;

/**
 *
 * @author alumno
 */
public class TEMA10_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>(); //integer es ula forma de poner un int 
        rellenarLista(numeros); //rellena el array de numeros
        mostrarLista(numeros); //al terminar de rellenarlos los mostrara
        cambiarPosiciones(numeros); //ahora cambiara las posiciones del 2 al 4 y del 4 al 2

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
        System.out.println("===== LISTA DE NÚMEROS =====");
        for (int i = 0; i < numeros.size(); i++) { // size() devuelve el numero de elementos que tiene la lista

            System.out.println((i + 1) + ". " + numeros.get(i));
        }
        System.out.println("");
    }

    public static void cambiarPosiciones(ArrayList<Integer> numeros) {
        int aux;
        aux = numeros.get(1);
        numeros.set(1, numeros.get(3));
        numeros.set(3, aux);

        System.out.println("Posiciones cambiadas");
        mostrarLista(numeros);
    }
}
