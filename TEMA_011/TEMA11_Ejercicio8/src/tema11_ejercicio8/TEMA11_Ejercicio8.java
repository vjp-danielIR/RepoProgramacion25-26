/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11_ejercicio8;

import java.util.*;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA11_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opcion = 0;
        Ciudades ciudad = new Ciudades();

        do {
            try {
                System.out.println("\n===== Menu =====");
                System.out.println("1. Añadir Ciudad");
                System.out.println("-----------------------");
                System.out.println("2. Mostrar ciudad con sus sedes");
                System.out.println("--------------------------------");
                System.out.println("3. Sedes que superan los ingresos de la media");
                System.out.println("---------------------------------------------");
                System.out.println("4. Buscar sede por nombre");
                System.out.println("-----------------------------");
                System.out.println("5. Añadir Sede");
                System.out.println("-----------------");
                System.out.println("6. Mostrar todas las sedes de mayor a menor");
                System.out.println("----------------------------------------------");
                System.out.println("7. Salir del Programa...");

                opcion = pedirInt("¿Que opcion desea?");

                switch (opcion) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        break;

                    case 6:
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
