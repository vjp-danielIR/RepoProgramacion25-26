/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Matriz de temp: 4 semanas x 7 días
        double[][] temp = new double[4][7];

        // Días de la s
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        int opcion;

        do {
            System.out.println("----MENU----");
            System.out.println("1. Rellenar las temperaturas");
            System.out.println("2. Mostrar las temperaturas");
            System.out.println("3. Temperatura media del mes");
            System.out.println("4. Dia o dias mas calurosos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    // Rellenar temp
                    rellenarTemp(temp, dias);
                    break;

                case 2:
                    // Mostrar temp
                    mostrarTemp(temp, dias);
                    break;

                case 3:
                    // Temperatura media del mes
                    tempMedia(temp, dias);
                    break;

                case 4:
                    // Día o días más calurosos
                    maxCalor(temp, dias);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");

                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 5);

    }

    public static void rellenarTemp(double temp[][], String dias[]) {
        Scanner entrada = new Scanner(System.in);
        for (int s = 0; s < 4; s++) {
            System.out.println("");
            System.out.println("Semana " + (s + 1));
            for (int d = 0; d < 7; d++) {
                System.out.print(dias[d] + ":");
                temp[s][d] = entrada.nextDouble();
            }
        }
    }

    public static void mostrarTemp(double temp[][], String dias[]) {
        for (int s = 0; s < 4; s++) {
            System.out.println("");
            System.out.println("Semana " + (s + 1));
            for (int dia = 0; dia < 7; dia++) {
                System.out.println(dias[dia] + ": " + temp[s][dia] + " grados");
            }
        }
    }

    public static void tempMedia(double temp[][], String dias[]) {
        double suma = 0;

        for (int s = 0; s < 4; s++) {
            for (int d = 0; d < 7; d++) {
                suma += temp[s][d];
            }
        }

        double media = suma / 28;
        System.out.printf("La temperatura media del mes es:%.1f grados\n ", media);
    }

    public static void maxCalor(double temp[][], String dias[]) {
        double maxCalor = temp[0][0];

        for (int s = 0; s < 4; s++) {
            for (int d = 0; d < 7; d++) {
                if (temp[s][d] > maxCalor) {
                    maxCalor = temp[s][d];
                }
            }
        }

        System.out.println("El dia o dias mas calurosos fueron:");
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                if (temp[semana][dia] == maxCalor) {
                    System.out.println(
                            dias[dia] + " de la semana " + (semana + 1)
                            + " con " + maxCalor + " grados"
                    );
                }
            }
        }

    }

}
