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
            System.out.println("1. realizar sorteo");
            System.out.println("2. repetir sorteo");
            System.out.println("3. mostrar sorteo del mes actual");
            System.out.println("4. mostrar sorteo por fecha");
            System.out.println("5. realizar sorteo por fecha");
            System.out.println("6. mostrar todos los sorteos");
            System.out.println("7. salir");

            try {
                opcion = pedirInt("dime una opcion");
            } catch (InputMismatchException e) {
                System.out.println("valor no valido");
            }

            switch (opcion) {
                case 1 ->
                    realizarSorteo(sorteo);
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
                    System.out.println("saliendo");
            }

        } while (opcion != 7);
    }

    // pide un numero entero al usuario
    public static int pedirInt(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextInt();
    }

    // realiza un sorteo con la fecha actual y lo guarda en el map
    public static void realizarSorteo(TreeMap<LocalDate, Sorteos> sorteo) {

        LocalDate hoy = LocalDate.now();

        Sorteos nuevo = new Sorteos();
        nuevo.setFecha(hoy);

        sorteo.put(hoy, nuevo);

        System.out.println("sorteo realizado");
        System.out.println(hoy + " : " + Arrays.toString(nuevo.getNumerosGanadores()));
    }

    // elimina el sorteo de hoy y crea uno nuevo con numeros distintos
    public static void repetirSorteo(TreeMap<LocalDate, Sorteos> sorteo) {

        LocalDate hoy = LocalDate.now();

        sorteo.remove(hoy);

        Sorteos nuevo = new Sorteos();
        nuevo.setFecha(hoy);

        sorteo.put(hoy, nuevo);

        System.out.println("sorteo repetido");
        System.out.println(hoy + " : " + Arrays.toString(nuevo.getNumerosGanadores()));
    }

    // muestra los sorteos que pertenecen al mes y ano actual
    public static void mostrarSorteoActualMes(TreeMap<LocalDate, Sorteos> sorteo) {

        LocalDate hoy = LocalDate.now();

        for (LocalDate fecha : sorteo.keySet()) {
            if (fecha.getMonth() == hoy.getMonth() && fecha.getYear() == hoy.getYear()) {
                Sorteos s = sorteo.get(fecha);
                System.out.println(fecha + " : " + Arrays.toString(s.getNumerosGanadores()));
            }
        }
    }

    // muestra el sorteo de una fecha introducida por el usuario si existe
    public static void mostrarSorteoFecha(TreeMap<LocalDate, Sorteos> sorteo) {

        int dia = pedirInt("dia");
        int mes = pedirInt("mes");
        int ano = pedirInt("ano");

        LocalDate fecha = LocalDate.of(ano, mes, dia);

        if (sorteo.containsKey(fecha)) {
            Sorteos s = sorteo.get(fecha);
            System.out.println(fecha + " -> " + Arrays.toString(s.getNumerosGanadores()));
        } else {
            System.out.println("no hay sorteo en esa fecha");
        }
    }

    // crea un sorteo en una fecha concreta si no existe previamente
    public static void realizarSorteoFecha(TreeMap<LocalDate, Sorteos> sorteo) {

        int dia = pedirInt("dia");
        int mes = pedirInt("mes");
        int año = pedirInt("año");

        LocalDate fecha = LocalDate.of(año, mes, dia);

        if (sorteo.containsKey(fecha)) {
            System.out.println("ya existe un sorteo en esa fecha");
        } else {
            Sorteos nuevo = new Sorteos();
            nuevo.setFecha(fecha);

            sorteo.put(fecha, nuevo);

            System.out.println("sorteo creado");
            System.out.println(fecha + " : " + Arrays.toString(nuevo.getNumerosGanadores()));
        }
    }

    // recorre y muestra todos los sorteos almacenados en el map
    public static void mostrarSorteos(TreeMap<LocalDate, Sorteos> sorteo) {

        for (LocalDate fecha : sorteo.keySet()) {
            Sorteos s = sorteo.get(fecha);
            System.out.println(fecha + " -> " + Arrays.toString(s.getNumerosGanadores()));
        }
    }
}
