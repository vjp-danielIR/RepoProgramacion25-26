/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio12.bis2;

import java.util.*;
import java.io.*;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio12Bis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cadenas = new String[4];

        
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print("Introduce cadena " + (i + 1) + ": ");
            cadenas[i] = sc.nextLine();
        }

        System.out.print("Nombre del archivo: ");
        String nombreArchivo = sc.nextLine();

        escribirCadenasEnArchivo(cadenas, nombreArchivo);
    }

    public static void escribirCadenasEnArchivo(String[] cadenas, String nombreArchivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {

            for (String cadena : cadenas) {
                pw.println(cadena);
            }

            System.out.println("Archivo '" + nombreArchivo + "' creado correctamente.");

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
