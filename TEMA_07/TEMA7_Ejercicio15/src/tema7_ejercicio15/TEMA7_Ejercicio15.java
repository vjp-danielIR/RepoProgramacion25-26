/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion;
        int[] ventas = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        do {
            try {
                mostrarMenu();
                opcion = pedirOpcion();
                switch (opcion) {
                    case 1 ->
                        rellenarArray(ventas);
                    case 2 ->
                        mostrarVentas(ventas, meses);
                    case 3 ->
                        ventasReves(ventas);
                    case 4 ->
                        sumaTotal(ventas);
                    case 5 ->
                        ventasPares(ventas, meses);
                    case 6 ->
                        mesConMasVentas(ventas, meses);
                    case 7 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("Opcion no valida introduce un numero del 1 al 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido");
                opcion = 0;
            }
        } while (opcion != 7);
    }

    // metodo que rellena el array de ventas con numeros aleatorios entre 10 y 100
    public static void rellenarArray(int[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * (101 - 10) + 10);
        }
    }

    // metodo que muestra las ventas de cada mes junto al nombre del mes correspondiente
    public static void mostrarVentas(int[] ventas, String[] meses) {
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("el mes: " + meses[i] + " se hicieron: " + ventas[i] + " ventas");
        }
    }

    // metodo que muestra las ventas del array en orden inverso
    public static void ventasReves(int[] ventas) {
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(ventas[i]);
        }
    }

    // metodo que calcula y muestra la suma total de todas las ventas del año
    public static void sumaTotal(int[] ventas) {
        int suma = 0;
        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }
        System.out.println("las ventas por año han sido: " + suma);
    }

    // metodo que muestra las ventas de los meses cuyo numero de ventas es impar
    public static void ventasPares(int[] ventas, String[] meses) {
        for (int i = 0; i < meses.length; i++) {
            if (ventas[i] % 2 == 1) {
                System.out.println("las ventas del mes: " + meses[i] + " fueron: " + ventas[i]);
            }
        }
    }

    // metodo que recorre el array de ventas y muestra el nombre del mes que tuvo mas ventas
    public static void mesConMasVentas(int[] ventas, String[] meses) {
        int indiceMax = 0;
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventas[indiceMax]) {
                indiceMax = i;
            }
        }
        System.out.println("El mes con mas ventas es: " + meses[indiceMax]);
    }

    // metodo que muestra el menu de opciones por pantalla y devuelve la opcion introducida por el usuario
    public static void mostrarMenu() {
        System.out.println("-----MENU-----");
        System.out.println("-----------------");
        System.out.println("1. Rellenar array de ventas");
        System.out.println("-----------------");
        System.out.println("2. Mostrar las ventas");
        System.out.println("-----------------");
        System.out.println("3. Mostrar las ventas al reves");
        System.out.println("-----------------");
        System.out.println("4. Suma total de ventas del año");
        System.out.println("-----------------");
        System.out.println("5. Ventas de los meses pares");
        System.out.println("-----------------");
        System.out.println("6. Mes con mas ventas");
        System.out.println("-----------------");
        System.out.println("7. Salir del programa");
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
       
        opcion = entrada.nextInt();
        
        return opcion;
    }
}
