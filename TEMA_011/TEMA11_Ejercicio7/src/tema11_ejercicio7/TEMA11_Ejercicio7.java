/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11_ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA11_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opcion = 0;
        Campania campania = new Campania();

        do {
            try {
                System.out.println("\n===== Menu =====");
                System.out.println("1. Añadir Campaña");
                System.out.println("2. Añadir Donacion");
                System.out.println("3. Mostrar Campañas junto a donaciones");
                System.out.println("4. Mostrar Campaña por Nombre");
                System.out.println("5. Mostrar total dinero recaudado");
                System.out.println("6. Mostrar mayor donacion ");
                System.out.println("7. Salir del Programa ");

                opcion = pedirInt("¿Que opcion desea?");

                switch (opcion) {
                    case 1:

                        campania.añadirCampania(pedirString("Nombre de la campaña:"));
                        break;

                    case 2:
                        campania.añadirDonacion(pedirString("Nombre del donante:"), pedirDouble("Cantidad donada:"));
                        break;

                    case 3:
                        campania.mostrarCampanias();
                        break;

                    case 4:
                        campania.mostrarCampaniaNombre(pedirString("Nombre de la campaña buscad:"));
                        break;

                    case 5:
                        campania.mostrarTotalRecaudado();
                        break;

                    case 6:
                        campania.mostrarMayorDonacion();
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido.");
            }
        } while (opcion != 7);
    }

    public static int pedirInt(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextInt();
    }

    public static double pedirDouble(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextDouble();
    }

    public static String pedirString(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(texto);
        return entrada.nextLine();
    }
}
