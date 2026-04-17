/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio14;

import java.util.*;

/**
 *
 * @author danie
 */
public class TEMA10_Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENU ALUMNOS ---");
            System.out.println("1. Introducir nuevo alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mejor alumno");
            System.out.println("4. Asignatura más difícil");
            System.out.println("5. Salir");

            try {
                opcion = pedirInt("Opción: ");

                switch (opcion) {
                    case 1 ->
                        agregarAlumno(listaAlumnos);
                    case 2 ->
                        mostrarAlumnos(listaAlumnos);
                    case 3 ->
                        mejorAlumno(listaAlumnos);
                    case 4 ->
                        asignaturaDificil(listaAlumnos);
                    case 5 ->
                        System.out.println("Saliendo...");
                    default ->
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Introduce un número entero.");

            }
        } while (opcion != 5);
    }

    public static String pedirString(String m) {
        System.out.print(m);
        return new Scanner(System.in).nextLine();
    }

    public static int pedirInt(String m) {
        System.out.print(m);
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    private static float pedirFloat(String m) {
        System.out.print(m);
        return Float.parseFloat(new Scanner(System.in).nextLine());
    }

    // Registra un nuevo alumno con sus 3 asignaturas en la lista
    public static void agregarAlumno(List<Alumno> lista) {
        String nombre = pedirString("Nombre del alumno: ");
        Asignatura[] notas = new Asignatura[3];
        String[] nombres = {"Lengua", "Mates", "Fisica"};

        for (int i = 0; i < 3; i++) {
            float nota = pedirFloat("Nota de " + nombres[i] + ": ");
            notas[i] = new Asignatura(nombres[i], nota);
        }
        lista.add(new Alumno(nombre, notas));
    }

    // Imprime la información de todos los alumnos de la lista
    public static void mostrarAlumnos(List<Alumno> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos.");
        } else {
            for (Alumno a : lista) {
                System.out.println(a.toString());
            }
        }
    }

    // Identifica y muestra al alumno con el promedio más alto
    public static void mejorAlumno(List<Alumno> lista) {
        if (lista.isEmpty()) {
            return;
        }
        Alumno mejor = lista.get(0);
        for (Alumno a : lista) {
            if (a.obtenerMedia() > mejor.obtenerMedia()) {
                mejor = a;
            }
        }
        System.out.println("El mejor es " + mejor.getNombreAlumno() + " con media de " + mejor.obtenerMedia());
    }

    // Calcula cuál de las asignaturas tiene mayor cantidad de alumnos suspensos
    public static void asignaturaDificil(List<Alumno> lista) {
        if (lista.isEmpty()) {
            return;
        }
        int[] suspensos = new int[3];

        for (Alumno a : lista) {
            for (int i = 0; i < 3; i++) {
                if (a.getAsignaturas()[i].getNotaAsignatura() < 5) {
                    suspensos[i]++;
                }
            }
        }

        String[] nombres = {"Lengua", "Mates", "Fisica"};
        int maxSusp = -1, indiceMax = 0;

        for (int i = 0; i < 3; i++) {
            if (suspensos[i] > maxSusp) {
                maxSusp = suspensos[i];
                indiceMax = i;
            }
        }
        System.out.println("Asignatura más difícil: " + nombres[indiceMax] + " (" + maxSusp + " suspensos)");

    }
}
