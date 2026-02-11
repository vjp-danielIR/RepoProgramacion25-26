package tema8_ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TEMA8_Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        // arrays auxiliares con los nombres
        String[] nombresAlumnos = {"Pepe", "Juan", "Marta"};
        String[] nombresAsignaturas = {"Lengua", "Mates", "Historia", "Fisica"};

        // crear array de alumnos
        Alumno[] alumnos = new Alumno[3];

        // inicializar los alumnos con sus nombres y asignaturas
        inicializarAlumnos(alumnos, nombresAlumnos, nombresAsignaturas);

        do {
            //menu
            System.out.println("===================================");
            System.out.println("MENU PRINCIPAL");
            System.out.println("===================================");
            System.out.println("1. Rellenar las notas de los alumnos");
            System.out.println("2. Mostrar las notas introducidas");
            System.out.println("3. Mostrar el mejor alumno de la clase");
            System.out.println("4. Mostrar el alumno con mas suspensos");
            System.out.println("5. Mostrar la asignatura mas dificil");
            System.out.println("6. Salir del programa");
            System.out.println("===================================");
            System.out.print("Elige una opcion: ");

            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        rellenarNotas(alumnos, entrada);
                        break;
                    case 2:
                        mostrarNotas(alumnos);
                        break;
                    case 3:
                        mostrarMejorAlumno(alumnos);
                        break;
                    case 4:
                        mostrarAlumnoMasSuspensos(alumnos);
                        break;
                    case 5:
                        mostrarAsignaturaMasDificil(alumnos, nombresAsignaturas);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero");

            }
        } while (opcion != 6);

    }

    public static void inicializarAlumnos(Alumno[] alumnos, String[] nombresAlumnos, String[] nombresAsignaturas) {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(nombresAlumnos[i]);

            for (int j = 0; j < 4; j++) {
                alumnos[i].getAsignaturas()[j] = new Asignatura(nombresAsignaturas[j], 0.0f);
            }
        }
    }

    public static void rellenarNotas(Alumno[] alumnos, Scanner entrada) {
        System.out.println("--- RELLENAR NOTAS ---");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno: " + alumnos[i].getNombre());

            for (int j = 0; j < alumnos[i].getAsignaturas().length; j++) {
                boolean notaValida = false;

                while (!notaValida) {

                    System.out.print("Nota de " + alumnos[i].getAsignaturas()[j].getNombre() + ": ");
                    float nota = entrada.nextFloat();

                    if (nota >= 0 && nota <= 10) {
                        alumnos[i].getAsignaturas()[j].setNota(nota);
                        notaValida = true;
                    }

                }
            }
        }

        System.out.println("Notas rellenadas correctamente");
    }

    public static void mostrarNotas(Alumno[] alumnos) {
        System.out.println("--- NOTAS DE LOS ALUMNOS ---");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno: " + alumnos[i].getNombre());
            for (int j = 0; j < alumnos[i].getAsignaturas().length; j++) {
                System.out.println(alumnos[i].getAsignaturas()[j]);
            }
        }
    }

    public static void mostrarMejorAlumno(Alumno[] alumnos) {
        System.out.println("--- MEJOR ALUMNO DE LA CLASE ---");

        Alumno mejorAlumno = alumnos[0];
        float mejorMedia = calcularNotaMedia(alumnos[0]);

        for (int i = 1; i < alumnos.length; i++) {
            float mediaActual = calcularNotaMedia(alumnos[i]);
            if (mediaActual > mejorMedia) {
                mejorMedia = mediaActual;
                mejorAlumno = alumnos[i];
            }
        }

        System.out.println("El mejor alumno es: " + mejorAlumno.getNombre());
        System.out.println("Nota media: " + mejorMedia);
    }

    public static void mostrarAlumnoMasSuspensos(Alumno[] alumnos) {
        System.out.println("--- ALUMNO CON MAS SUSPENSOS ---");

        Alumno alumnoMasSuspensos = alumnos[0];
        int maxSuspensos = contarSuspensos(alumnos[0]);

        for (int i = 1; i < alumnos.length; i++) {
            int suspensosActuales = contarSuspensos(alumnos[i]);
            if (suspensosActuales > maxSuspensos) {
                maxSuspensos = suspensosActuales;
                alumnoMasSuspensos = alumnos[i];
            }
        }

        System.out.println("El alumno con mas suspensos es: " + alumnoMasSuspensos.getNombre());
        System.out.println("Numero de suspensos: " + maxSuspensos);
    }

    public static void mostrarAsignaturaMasDificil(Alumno[] alumnos, String[] nombresAsignaturas) {
        System.out.println("--- ASIGNATURA MAS DIFICIL ---");

        float[] mediasAsignaturas = new float[4];

        //calcular nota media de cada asignatura
        for (int j = 0; j < 4; j++) {
            float suma = 0;
            for (int i = 0; i < alumnos.length; i++) {
                suma += alumnos[i].getAsignaturas()[j].getNota();
            }
            mediasAsignaturas[j] = suma / alumnos.length;
        }

        //buscar la asignatura con menor media
        int indiceMasDificil = 0;
        float menorMedia = mediasAsignaturas[0];

        for (int i = 1; i < mediasAsignaturas.length; i++) {
            if (mediasAsignaturas[i] < menorMedia) {
                menorMedia = mediasAsignaturas[i];
                indiceMasDificil = i;
            }
        }

        System.out.println("La asignatura mas dificil es: " + nombresAsignaturas[indiceMasDificil]);
        System.out.println("Nota media: " + menorMedia);
    }

    public static float calcularNotaMedia(Alumno alumno) {
        float suma = 0;
        for (int i = 0; i < alumno.getAsignaturas().length; i++) {
            suma += alumno.getAsignaturas()[i].getNota();
        }
        return suma / alumno.getAsignaturas().length;
    }

    public static int contarSuspensos(Alumno alumno) {
        int suspensos = 0;
        for (int i = 0; i < alumno.getAsignaturas().length; i++) {
            if (alumno.getAsignaturas()[i].getNota() < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }
}

