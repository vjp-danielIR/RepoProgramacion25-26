/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template */
package tema8_ejercicio13y14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA8_Ejercicio13y14 {

    // metodo principal que ejecuta el programa, crea dos alumnos de ejemplo y muestra un menu interactivo para gestionar un array de alumnos
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 13: CLASE ALUMNO ===\n");

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Maria Garcia");
        alumno1.setEdad(20);
        alumno1.setNotaMedia(7.5);

        Alumno alumno2 = new Alumno("Carlos Lopez", 22, 8.3);

        System.out.println("INFORMACIÓN DE LOS ALUMNOS");
        mostrarDatosAlumno(alumno1, "Alumno 1");
        mostrarDatosAlumno(alumno2, "Alumno 2");

        System.out.println("\nCOMPARACIÓN DE NOTAS");
        if (alumno1.getNotaMedia() > alumno2.getNotaMedia()) {
            System.out.println(alumno1.getNombre() + " tiene mejor nota media");
        } else if (alumno2.getNotaMedia() > alumno1.getNotaMedia()) {
            System.out.println(alumno2.getNombre() + " tiene mejor nota media");
        } else {
            System.out.println("Ambos alumnos tienen la misma nota media");
        }

        Alumno[] array = new Alumno[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Alumno();
        }

        int opcion;
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            System.out.println("");
            switch (opcion) {
                case 1:
                    rellenarAlumno(array);
                    break;
                case 2:
                    mostrarDatosAlumno(array);
                    break;
                case 3:
                    mostrarPorMedia(array);
                    break;
                case 4:
                    mostrarSuspensos(array);
                    break;
                case 5:
                    buscarAlumno(array);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Por favor introduzca una opcion valida\n");
            }
        } while (opcion != 6);
    }

    // metodo que pide al usuario una posicion del array y rellena ese alumno con nombre, edad y nota media introducidos por teclado
    public static void rellenarAlumno(Alumno[] array) {
        int posicion;
        do {
            System.out.print("Introduce la posicion del alumno a rellenar ");
            posicion = pedirOpcion();
        } while (posicion < 0 || posicion >= array.length);

        array[posicion] = new Alumno();
        System.out.print("Introduce el nombre del alumno: ");
        array[posicion].setNombre(pedirString());
        System.out.print("Introduce la edad del alumno: ");
        array[posicion].setEdad(pedirOpcion());
        System.out.print("Introduce la media del alumno: ");
        array[posicion].setNotaMedia(pedirFloat());
        System.out.println("DATOS DE " + array[posicion].getNombre() + " recogidos\n");
    }

    // metodo que muestra todos los alumnos del array cuya nota media sea igual o superior a la introducida por el usuario
    public static void mostrarPorMedia(Alumno[] array) {
        float media;
        boolean encontrado = false;
        System.out.print("Por favor introduzca la nota media minima: ");
        media = pedirFloat();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getNotaMedia() >= media) {
                System.out.println(array[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay ningun alumno con una media igual superior");
        }
        System.out.println("");
    }

    // metodo que busca en el array todos los alumnos cuyo nombre coincida con el introducido por el usuario y los muestra por pantalla
    public static void buscarAlumno(Alumno[] array) {
        System.out.print("Por favor introduzca el nombre que quiere buscar: ");
        String nombre = pedirString();
        int i = 0;
        while (i < array.length) {
            if (array[i] != null && array[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(array[i].toString());
            }
            i++;
        }
    }

    // metodo que cuenta y muestra el numero de alumnos del array que tienen una nota media inferior a 5
    public static void mostrarSuspensos(Alumno[] array) {
        int suspensos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getNotaMedia() < 5) {
                suspensos++;
            }
        }
        System.out.println("El numero de alumnos suspensos es " + suspensos);
    }

    // metodo que muestra por pantalla las opciones disponibles del menu principal
    public static void mostrarMenu() {
        System.out.println("---- MENU ----");
        System.out.println("1. Rellenar un alumno");
        System.out.println("2. Mostrar alumnos");
        System.out.println("3. Mostrar alumnos con una media mayor a la dada");
        System.out.println("4. Mostrar cantidad de alumnos con una media suspensa");
        System.out.println("5. Buscar alumnos por nombre");
        System.out.println("6. Salir");
    }

    // metodo que lee un numero entero introducido por el usuario por teclado y devuelve 0 si el valor no es valido
    public static int pedirOpcion() {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        try {
            opcion = entrada.nextInt();
        } catch (InputMismatchException e) {
            opcion = 0;
            entrada.nextLine();
        }
        return opcion;
    }

    // metodo que lee y devuelve una cadena de texto introducida por el usuario por teclado
    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }

    // metodo que lee y devuelve un numero decimal introducido por el usuario por teclado
    public static float pedirFloat() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }

    // metodo que muestra por pantalla los datos de todos los alumnos contenidos en el array
    public static void mostrarDatosAlumno(Alumno[] array) {
        System.out.println("Estos son todos los alumnos: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
        System.out.println("");
    }

    // metodo que muestra por pantalla los datos de un alumno concreto junto a una etiqueta identificativa
    public static void mostrarDatosAlumno(Alumno alumno, String etiqueta) {
        System.out.println(etiqueta + ": " + alumno.toString());
    }
}