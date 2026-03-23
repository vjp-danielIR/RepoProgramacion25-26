/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11_ejercicio6;

import java.util.*;

/**
 *
 * @author alumno
 */
public class TEMA11_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        Campania campania = new Campania("Campaña Principal");

        do {
            try {
                System.out.println("\n===== Menu =====");
                System.out.println("1. Añadir Donacion");
                System.out.println("2. Mostrar Donaciones");
                System.out.println("3. Mostrar donaciones por nombre de donante");
                System.out.println("4. Mostrar número de donaciones");
                System.out.println("5. Mostrar total dinero recaudado");
                System.out.println("6. Ordenar donaciones ");
                System.out.println("7. Salir del Programa ");

                opcion = pedirInt("¿Que opcion desea?");

                switch (opcion) {
                    case 1:

                        campania.añadirDonacion(pedirString("Nombre del donante:"), pedirDouble("Cantidad donada:"));

                    case 2:
                        campania.mostrarDonaciones();

                    case 3:
                        campania.mostrarDonacionesNombre(pedirString("Nombre del donante buscado:"));

                    case 4:
                        campania.mostrarNumeroDonaciones();

                    case 5:
                        campania.mostrarTotalRecaudado();

                    case 6:
                        campania.ordenarDonaciones();

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido.");
            }
        } while (opcion != 8);
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
