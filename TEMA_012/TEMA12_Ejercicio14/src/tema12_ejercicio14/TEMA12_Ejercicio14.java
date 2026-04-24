/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio14;

import java.util.*;
import java.io.*;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("DatosBeca.txt"));

            String linea;

            System.out.println("===== listado de becas =====\n");

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(" - ");

                double beca = calcularBeca(edad, suspensos, residencia, ingresos);
                

                if (beca > 0) {
                    System.out.printf("becario: %-25s | beca: %.2f €%n", nombre, beca);
                }
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("error: fichero no encontrado");
        } catch (IOException e) {
            System.out.println("error de lectura");
        }
    }

    // calcula la beca segun las condiciones del enunciado
    public static double calcularBeca(int edad, int suspensos, String residencia, double ingresos) {
        double beca = 1500;

        if (suspensos >= 2) {
            return 0; // sin beca
        }

        if (ingresos <= 12000) {
            beca += 500;
        }

        if (edad < 23) {
            beca += 200;
        }

        if (suspensos == 0) {
            beca += 500;
        } else if (suspensos == 1) {
            beca += 200;
        }

        if (residencia.equalsIgnoreCase("no")) {
            beca += 1000;
        }

        return beca;
    }
}
