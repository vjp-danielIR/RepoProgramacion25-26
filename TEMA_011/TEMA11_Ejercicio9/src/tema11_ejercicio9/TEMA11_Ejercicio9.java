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
        TreeMap<LocalDate, Sorteos> sorteo = new TreeMap<>();

        do {
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
            try {
                opcion = pedirInt("Dime una opcion");

            } catch (InputMismatchException e) {
                System.out.println("Valor no válido.");
            }

            switch (opcion) {

                case 1 ->
                    realizarSortro(sorteo);

                case 2 ->
                    repetirSorteo(sorteo);

                case 3 ->
                    mostrarSorteoActualMes(sorteo);

                case 4 ->
                    mostrarSorteoFecha(sorteo);

                case 5 ->
                    realizarSorteoFecha(sorteo);

                case 6 ->
                    mostrarSorteos(sorteo);

                case 7 ->
                    System.out.println("Saliendo...");
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

    public static void realizarSortro(TreeMap<LocalDate, Sorteos> sorteo) {
        System.out.println("Realizando sorteo.....");

        Sorteos nuevo = new Sorteos();
        LocalDate hoy = LocalDate.now();
        nuevo.setFecha(hoy);
        System.out.println("");
        sorteo.put(hoy, nuevo);
        System.out.println("Sorteo realizado con exito...");
        System.out.println("El dia del sorteo sera:" + nuevo.getFecha());
        System.out.println("Tu numero ganador es: " + Arrays.toString(nuevo.getNumerosGanadores()));
    }

    public static void repetirSorteo(TreeMap<LocalDate, Sorteos> sorteo) {
        LocalDate hoy = LocalDate.now();
        sorteo.remove(hoy);
        Sorteos nuevo = new Sorteos();
        nuevo.setFecha(hoy);
        sorteo.put(hoy, nuevo);
        System.out.println("Sorteo repetido con éxito.");
         System.out.println("El dia del sorteo sera:" + nuevo.getFecha());
        System.out.println("Tu numero ganador es: " + Arrays.toString(nuevo.getNumerosGanadores()));
    }

    public static void mostrarSorteoActualMes(TreeMap<LocalDate, Sorteos> sorteo) {
        
    }

    public static void mostrarSorteoFecha(TreeMap<LocalDate, Sorteos> sorteo) {

        boolean encontrado = false;

        int dia = pedirInt("Introduce el día: ");
        int mes = pedirInt("Introduce el mes: ");
        int año = pedirInt("Introduce el año: ");
        LocalDate fecha = LocalDate.of(año, mes, dia);
        int i = 0;
        while (!encontrado) {

        }
    }

    public static void realizarSorteoFecha(TreeMap<LocalDate, Sorteos> sorteo) {
       Sorteo sorteos;
        if  (sorteos.containsKey(fecha)){
            System.out.println("El día " + fecha + "  ya tiene un sorteo realizado");
        }
        else{
            //Creamos un sorteo con la fecha recibida por parámetros y números ganadores entre 1 y 100.
            nSorteo = new Sorteo(fecha);  
            mSorteos.put(fecha, sorteos);
            //Mostramos por pantalla el sorteo 
            System.out.println(sorteos);
        }
    }
    }

    public static void mostrarSorteos(TreeMap<LocalDate, Sorteos> sorteo) {
        for (int i = 0; i < sorteo.size(); i++) {
            System.out.println(sorteo.get(i));
        }
    }

