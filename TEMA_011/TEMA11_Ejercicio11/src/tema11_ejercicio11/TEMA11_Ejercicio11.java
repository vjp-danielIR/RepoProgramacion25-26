/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11_ejercicio11;

import java.util.*;

/**
 *
 * @author danie
 */
public class TEMA11_Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();
        int opcion=0;

        do {
            try {
                mostrarMenu();
                opcion = pedirInt("Elige una opcion: ");
            } catch (InputMismatchException e) {
                System.out.println("valor no valido");
            }
            switch (opcion) {
                case 1 ->
                    anadirAlumno(alumnos);
                case 2 ->
                    mostrarAlumnosPorExpediente(alumnos);
                case 3 ->
                    buscarPorExpediente(alumnos);
                case 4 ->
                    mostrarAlumnosPorNota(alumnos);
                case 5 ->
                    System.out.println("Hasta pronto!");
                default ->
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        } while (opcion != 5);

    }

    public static void mostrarMenu() {
        System.out.println("=== GESTION DE ALUMNOS ===");
        System.out.println("1. Anadir alumno");
        System.out.println("2. Mostrar alumnos (ordenados de menor a mayor numero de expediente)");
        System.out.println("3. Buscar por numero de expediente");
        System.out.println("4. Mostrar alumnos por nota");
        System.out.println("5. Salir");
    }

    public static int pedirInt(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = entrada.nextInt();
        entrada.nextLine();
        return valor;
    }

    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    public static double pedirDouble(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = entrada.nextDouble();
        entrada.nextLine();
        return valor;
    }

    public static void anadirAlumno(Set<Alumno> alumnos) {
        String dni = pedirString("Introduce DNI: ");
        int exp = pedirInt("Introduce numero de expediente: ");
        double nota = pedirDouble("Introduce nota media: ");

        Alumno nuevo = new Alumno(dni, exp, (float) nota);

        if (alumnos.add(nuevo)) {
            System.out.println("Alumno anadido correctamente.");
        } else {
            System.out.println("Error: Ya existe un alumno con ese numero de expediente.");
        }
    }

    public static void mostrarAlumnosPorExpediente(Set<Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            List<Alumno> lista = new ArrayList<>(alumnos);

            System.out.println("");
            System.out.println("--- Alumnos ordenados por numero de expediente ---");
            for (Alumno a : lista) {
                System.out.println(a);
            }
        }
    }

    public static void buscarPorExpediente(Set<Alumno> alumnos) {
        int buscar = pedirInt("Introduce numero de expediente a buscar: ");
        boolean encontrado = false;

        for (Alumno a : alumnos) {
            if (a.getNumExpediente() == buscar) {
                System.out.println("Alumno encontrado: " + a);
                encontrado = true;

            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun alumno con ese numero de expediente.");
        }
    }

    public static void mostrarAlumnosPorNota(Set<Alumno> alumnos) {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            List<Alumno> lista = new ArrayList<>(alumnos);
            lista.sort(Comparator.comparingDouble(Alumno::getNotaMedia));

            System.out.println("\n--- Alumnos ordenados por nota media (ascendente) ---");
            for (Alumno a : lista) {
                System.out.println(a);
            }
        }
    }
}
