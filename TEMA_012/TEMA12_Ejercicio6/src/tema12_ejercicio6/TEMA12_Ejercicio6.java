/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio6;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class TEMA12_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;

        do {
            try {
                System.out.println("\n=== MENU NUMEROS PARES ===");
                System.out.println("1. Volcar 100 primeros numeros pares a un fichero");
                System.out.println("2. Mostrar contenido del fichero");
                System.out.println("3. Salir");
                System.out.println("");

                opcion = pedirInt("Que opcion desea?");

                switch (opcion) {
                    case 1 ->
                        volcarNumerosPares();
                    case 2 ->
                        mostrarFichero();
                    case 3 ->
                        System.out.println("Hasta pronto");
                    default ->
                        System.out.println("Opcion no valida");
                }
            } catch (IOException ex) {
                Logger.getLogger(TEMA12_Ejercicio6.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (opcion != 3);

    }

    // Metodo para pedir Strring
    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        return entrada.next();
    }

    // Metodo para pedir int
    public static int pedirInt(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = entrada.nextInt();
        return valor;
    }

    //metodo para meter en el nombrefichero los primeros 100 numeros pares
    public static void volcarNumerosPares() throws IOException {
        String nombreFichero = pedirString("Nombre del fichero (ej: pares.txt): ");

        if (nombreFichero.isEmpty()) {
            System.out.println("El nombre del fichero no puede estar vacio");
        } else {

            int[] pares = new int[100];
            for (int i = 0; i < 100; i++) {
                pares[i] = (i + 1) * 2;
            }

            try (
                    FileWriter fw = new FileWriter(nombreFichero)) {
                for (int numero : pares) {
                    fw.write(numero + " - ");
                }
            }

            System.out.println("100 numeros pares guardados en " + nombreFichero);
        }
    }

    //muestra los numeros del fichero que el usuario quiera
    public static void mostrarFichero() throws IOException {
        String nombreFichero = pedirString("Nombre del fichero a mostrar: ");

        File archivo = new File(nombreFichero);
        if (!archivo.exists()) {
            System.out.println("El fichero no existe");
            return;
        }

        try (
                BufferedReader br = new BufferedReader(new FileReader(archivo)
                )) {
            String linea;
            System.out.println("\n=== CONTENIDO DEL FICHERO ===");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }
}
