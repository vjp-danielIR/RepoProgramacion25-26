/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11_ejercicio3;

import java.util.*;

/**
 *
 * @author alumno
 */
public class TEMA11_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autobus[] espacio = new Autobus[6];
        int opcion = 0;

        do {
            System.out.println("======== MENU =========");
            System.out.println("1. Aparcar autobus");
            System.out.println("2. Mostrar espacios libres");
            System.out.println("3. Buscar autobus");
            System.out.println("4. Buscar conductor");
            System.out.println("5. Autobus con más conductores");
            System.out.println("6. Salir");

            try {
                System.out.print("Qué opción quiere? ");
                opcion = pedirInt();
            } catch (InputMismatchException e) {
                System.out.println("opcion no valida");
            }
            switch (opcion) {
                case 1 ->
                    aparcar(espacio);
                case 2 ->
                    mostrarLibres(espacio);
                case 3 ->
                    buscarAutobus(espacio);
                case 4 ->
                    buscarConductor(espacio);
                case 5 ->
                    masConductores(espacio);
            }

        } while (opcion != 6);
    }

    // Aparca un autobús en la posición indicada si está libre y es válida

    /**
     *
     * @param espacio
     */
    public static void aparcar(Autobus[] espacio) {
        System.out.print("Posición (0-5): ");
        int pos = pedirInt();

        if (pos < 0 || pos > 5 || espacio[pos] != null) {
            System.out.println(" Posición no válida o ya ocupada.");

        } else {

            System.out.print("Matrícula: ");
            String matricula = pedirString();
            Autobus autobus = new Autobus(matricula);

            System.out.print(" Número de conductores: ");
            int num = pedirInt();
            for (int i = 0; i < num; i++) {
                System.out.print(" DNI conductor " + (i + 1) + ":");
                String dni = pedirString();

                System.out.print(" Nombre conductor " + (i + 1) + ":");
                String nombre = pedirString();
                autobus.getConductores().put(dni, nombre);
            }

            espacio[pos] = autobus;
            System.out.println(" Autobús aparcado correctamente.");
        }
    }

    // Muestra todas las dársenas que no tienen autobús aparcado

    /**
     *
     * @param espacio
     */
    public static void mostrarLibres(Autobus[] espacio) {
        System.out.println("----Espacios libres----");
        boolean hayLibres = false;
        for (int i = 0; i < espacio.length; i++) {
            if (espacio[i] == null) {
                System.out.println("  Espacio " + i + " libre");
                hayLibres = true;
            }
        }
        if (!hayLibres) {
            System.out.println("  No hay espacios  libres.");
        }
    }

    // Busca un autobús por matrícula y muestra toda su información

    /**
     *
     * @param espacio
     */
    public static void buscarAutobus(Autobus[] espacio) {
        System.out.print(" -Matrícula a buscar: ");
        String matricula = pedirString();
        int i = 0;
        boolean encontrado = false;
        System.out.println("");
        while (encontrado != false) {
            if (espacio[i] != null && espacio[i].getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println(espacio[i]);
                encontrado=true;
            } else {
                i++;
            }
            System.out.println("Autobús no encontrado.");
        }

    }

    // Busca un conductor por DNI y muestra la matrícula del autobús que tiene asignado

    /**
     *
     * @param espacio
     */
    public static void buscarConductor(Autobus[] espacio) {
        System.out.print(" DNI del conductor: ");
        String dni = pedirString();
        int i = 0;
        boolean encontrado = false;
        while (encontrado != false) {
            if (espacio[i] != null && espacio[i].getConductores().containsKey(dni)) {
                System.out.println(" El conductor trabaja en el autobús: " + espacio[i].getMatricula());
                encontrado=true;
            } else {
                i++;
            }
        }
        System.out.println(" Conductor no encontrado");

    }

    // Metodo que muestra la dársena del autobús que tiene mayor número de conductores asignados
    public static String masConductores(Autobus[] espacio) {
        int max = -1;
        int pos = -1;

        for (int i = 0; i < espacio.length; i++) {
            if (espacio[i] != null) {
                int num = espacio[i].getConductores().size();
                if (num > max) {
                    max = num;
                    pos = i;
                }
            }
        }

        return " autobus con más conductores: " + pos + " (" + espacio[pos].getMatricula() + " con " + max + " conductores)";

    }

    // pedir int
    public static int pedirInt() {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        entrada.nextLine();
        return num;
    }

    // pedir Strings
    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();

    }
}
