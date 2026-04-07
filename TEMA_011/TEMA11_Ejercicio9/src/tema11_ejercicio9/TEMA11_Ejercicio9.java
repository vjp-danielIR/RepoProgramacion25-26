/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11_ejercicio9;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA11_Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Sorteos> sorteo = new ArrayList<>();

        do {
            try {
                System.out.println("\n===== Menu =====");
                System.out.println("-------------------");
                System.out.println("1. Realizar sorteo");
                System.out.println("-----------------");
                System.out.println("2. Repetir sorteo");
                System.out.println("-------------------");
                System.out.println("3. Mostrar sorteo del mes actual");
                System.out.println("---------------------------------");
                System.out.println("4. Mostrar sorteo por fecha");
                System.out.println("---------------------------");
                System.out.println("5. Realizar sorteo por fecha");
                System.out.println("------------------------------");
                System.out.println("6. Mostrar todos los sorteos");
                System.out.println("----------------------------");
                System.out.println("7. Salir del programa...");

                switch (opcion) {

                    case 1 -> realizarSortro(sorteo);

                    case 2 -> repetirSorteo( sorteo);

                    case 3 -> mostrarSorteoActualMes(sorteo);

                    case 4 -> mostrarSorteoFecha(sorteo);

                    case 5 -> realizarSorteoFecha(sorteo);

                    case 6 -> mostrarSorteos(sorteo);

                    case 7 -> System.out.println("Saliendo...");
                }

            } catch (InputMismatchException e) {
                System.out.println("Valor no válido.");
            }

        } while (opcion != 7);
    }

    public static int pedirInt(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextInt();
    }

    public static double pedirDouble(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextDouble();
    }

    public static String pedirString(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextLine();
    }

    public static void realizarSortro(ArrayList<Sorteos> sorteo) {
        
        System.out.println("realizando sorteo.....");
        Sorteos nuevo= new Sorteos();
        nuevo.setFecha( LocalDate.now() , Integer.SIZE);
    
        System.out.println("Sorteo Realizado con exito");
    }

    public static void repetirSorteo(ArrayList<Sorteos> sorteo) {
    
    
    
    
    }

    public static void mostrarSorteoActualMes(ArrayList<Sorteos> sorteo) {
    
    
    
    }

    public static void mostrarSorteoFecha(ArrayList<Sorteos> sorteo) {

    
    
    }

    public static void realizarSorteoFecha(ArrayList<Sorteos> sorteo) {
   
    
    
    }

    public static void mostrarSorteos(ArrayList<Sorteos> sorteo) {
    
    
    
    
    }

}
