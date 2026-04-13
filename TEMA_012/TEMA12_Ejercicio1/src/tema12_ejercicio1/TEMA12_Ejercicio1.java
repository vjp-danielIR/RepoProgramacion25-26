/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio1;

import java.util.*;

/**
 *
 *
 * @author Daniel_Iglesias
 *
 *
 */
public class TEMA12_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;

        ArrayList<Agenda> contactos = new ArrayList<>();

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("-------------------");
            System.out.println("1. Añadir contactor a la agenda");
            System.out.println("-----------------");
            System.out.println("2. Visualizar lista de contactos");
            System.out.println("-------------------");
            System.out.println("3. Eliminar contactos de la lista");
            System.out.println("---------------------------------");
            System.out.println("4. Mostrar todos los contactos ordenados por su edad");
            System.out.println("---------------------------");
            System.out.println("5. Salir del programa...");

            try {
                opcion = pedirInt("Dime una opcion");

            } catch (InputMismatchException e) {
                System.out.println("Valor no válido.");
            }
            switch (opcion) {
                case 1 ->
                    añadirContacto(contactos);
                case 2 ->
                    visualizarContactos(contactos);
                case 3 ->
                    eliminarContactos(contactos);
                case 4 ->
                    mostrarContactosEdad(contactos);
                case 5 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    public static int pedirInt(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextInt();
    }

    public static String pedirString(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextLine();
    }

    public static void añadirContacto(ArrayList<Agenda> contactos) {

        Agenda nuevo = new Agenda();
        do {
            String nombre = pedirString("Cual es el nombre del contacto?");
            int edad = pedirInt("¿Que edad tiene?");
            int numeroMovil = pedirInt("¿Cual es su numero de telefono?");
            nuevo.setNombre(nombre);
            nuevo.setEdad(edad);
            nuevo.setNumeroMovil(numeroMovil);
        } while (pedirSeguir().equals("s"));
        contactos.add(nuevo);
    }

    public static void visualizarContactos(ArrayList<Agenda> contactos) {
        for (Agenda contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public static void eliminarContactos(ArrayList<Agenda> contactos) {

        String nombreBorrar = pedirString("Cual es el nombre del contacto que desea borrar?");

        Iterator<Agenda> it = contactos.iterator();

        boolean encontrado = false;

        while (it.hasNext()) {

            Agenda contactoActual = it.next();

            if (contactoActual.getNombre().equalsIgnoreCase(nombreBorrar)) {

                it.remove();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        } else {
            System.out.println("Contacto eliminado correctamente.");
        }
    }

    public static void mostrarContactosEdad(ArrayList<Agenda> contactos) {
        contactos.sort(Comparator.comparingInt(Agenda::getEdad));
        for (Agenda contacto : contactos) {
            System.out.println(contacto);
        }
    }

    public static Object pedirSeguir() {
        System.out.print("¿Quieres añadir otro nombre? (s/n): ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

}
