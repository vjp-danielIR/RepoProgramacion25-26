/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio2;

import java.util.*;

/**
 *
 * @author alumno
 */
public class TEMA10_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); //integer es la forma de poner un int 
        rellenarLista(numeros); //rellena el array de numeros
        mostrarLista(numeros); //al terminar de rellenarlos los mostrara
        //y despues calculara el numero mas grande  el menor y la suma de todos los numeros
        System.out.println("Mayor: " + calcularMayor(numeros));
        System.out.println("Menor: " + calcularMenor(numeros));
        System.out.println("Suma: " + calcularSuma(numeros));
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

    // Recorre la lista comparando cada elemento para encontrar el mayor
    public static int calcularMayor(ArrayList<Integer> numeros) {
        int mayor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }
        }
        return mayor;
    }

    // Recorre la lista comparando cada elemento para encontrar el menor
    public static int calcularMenor(ArrayList<Integer> numeros) {
        int menor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        return menor;
    }

    // Suma todos los elementos de la lista y devuelve el resultado
    public static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }
        return suma;
    }

    
}
