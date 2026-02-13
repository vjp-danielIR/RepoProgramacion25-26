/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema8_ejercicio15;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class TEMA8_Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       

            Peliculas[] peliculas = new Peliculas[100];
            int numPeliculas = 0;
            int opcion;

            do {
                mostrarMenu();
                Scanner entrada = new Scanner(System.in);
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                        numPeliculas = rellenarPeliculas(peliculas, numPeliculas);
                        break;
                    case 2:
                        mostrarPeliculasYSocios(peliculas, numPeliculas);
                        break;
                    case 3:
                        mostrarPeliculaMasRentable(peliculas, numPeliculas);
                        break;
                    case 4:
                        mostrarPeliculaMenosRentable(peliculas, numPeliculas);
                        break;
                    case 5:
                        buscarPeliculaYMostrarInfo(peliculas, numPeliculas);
                        break;
                    case 6:
                        contarSociosQuePaganMas(peliculas, numPeliculas);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }

            } while (opcion != 7);
        }

        // ================= METODOS =================
        static void mostrarMenu() {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Rellenar peliculas y socios");
            System.out.println("2. Mostrar peliculas y socios");
            System.out.println("3. Mostrar pelicula mas rentable");
            System.out.println("4. Mostrar pelicula menos rentable");
            System.out.println("5. Buscar pelicula y mostrar info");
            System.out.println("6. Contar socios que pagan mas");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
        }

        static int rellenarPeliculas(Peliculas[] peliculas, int numPeliculas) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Introduce el titulo: ");
            String titulo = entrada.nextLine();

            System.out.print("Introduce el coste licencia: ");
            double coste = entrada.nextDouble();
            entrada.nextLine();

            peliculas[numPeliculas] = new Peliculas(titulo, coste);

            System.out.print("Cuantos socios asistieron (max 4): ");
            int cantidad = entrada.nextInt();
            entrada.nextLine();

            if (cantidad > 4) {
                cantidad = 4;
            }

            for (int i = 0; i < cantidad; i++) {
                System.out.print("Nombre socio " + (i + 1) + ": ");
                String nombre = entrada.nextLine();

                System.out.print("Precio abonado: ");
                double precio = entrada.nextDouble();
                entrada.nextLine();

                peliculas[numPeliculas].socios[i] = new Socio(nombre, precio);
                peliculas[numPeliculas].numSocios++;
            }

            System.out.println("Pelicula añadida");
            return numPeliculas + 1;
        }

        static void mostrarPeliculasYSocios(Peliculas[] peliculas, int numPeliculas) {
            if (numPeliculas == 0) {
                System.out.println("No hay peliculas");
                return;
            }

            for (int i = 0; i < numPeliculas; i++) {
                System.out.println("\nPelicula: " + peliculas[i].titulo);
                System.out.println("Coste licencia: " + peliculas[i].costeLicencia);
                System.out.println("Socios:");

                for (int j = 0; j < peliculas[i].numSocios; j++) {
                    System.out.println(" - " + peliculas[i].socios[j].nombre
                            + " (abonado: " + peliculas[i].socios[j].precioAbonado + ")");
                }
            }
        }

        static double calcularBeneficio(Pelicula p) {
            double total = 0;
            for (int i = 0; i < p.numSocios; i++) {
                total += p.socios[i].precioAbonado;
            }
            return total - p.costeLicencia;
        }

        static void mostrarPeliculaMasRentable(Peliculas[] peliculas, int numPeliculas) {
            if (numPeliculas == 0) {
                System.out.println("No hay peliculas");
                return;
            }

            int indice = 0;
            double max = calcularBeneficio(peliculas[0]);

            for (int i = 1; i < numPeliculas; i++) {
                double b = calcularBeneficio(peliculas[i]);
                if (b > max) {
                    max = b;
                    indice = i;
                }
            }

            System.out.println("Pelicula mas rentable: " + peliculas[indice].titulo);
            System.out.println("Beneficio: " + max);
        }

        static void mostrarPeliculaMenosRentable(Peliculas[] peliculas, int numPeliculas) {
            if (numPeliculas == 0) {
                System.out.println("No hay peliculas");
                return;
            }

            int indice = 0;
            double min = calcularBeneficio(peliculas[0]);

            for (int i = 1; i < numPeliculas; i++) {
                double b = calcularBeneficio(peliculas[i]);
                if (b < min) {
                    min = b;
                    indice = i;
                }
            }

            System.out.println("Pelicula menos rentable: " + peliculas[indice].titulo);
            System.out.println("Beneficio: " + min);
        }

        static void buscarPeliculaYMostrarInfo(Peliculas[] peliculas, int numPeliculas) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Introduce el nombre de la pelicula: ");
            String nombre = entrada.nextLine();

            for (int i = 0; i < numPeliculas; i++) {
                if (peliculas[i].titulo.equalsIgnoreCase(nombre)) {
                    double beneficio = calcularBeneficio(peliculas[i]);
                    System.out.println("Pelicula: " + peliculas[i].titulo);
                    System.out.println("Beneficio: " + beneficio);
                    System.out.println("Socios:");

                    for (int j = 0; j < peliculas[i].numSocios; j++) {
                        System.out.println(" - " + peliculas[i].socios[j].nombre
                                + " (abonado: " + peliculas[i].socios[j].precioAbonado + ")");
                    }
                    return;
                }
            }

            System.out.println("Pelicula no encontrada");
        }

        static void contarSociosQuePaganMas(Peliculas[] peliculas, int numPeliculas) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Introduce la cantidad: ");
            double cantidad = entrada.nextDouble();

            int contador = 0;

            for (int i = 0; i < numPeliculas; i++) {
                for (int j = 0; j < peliculas[i].numSocios; j++) {
                    if (peliculas[i].socios[j].precioAbonado > cantidad) {
                        contador++;
                    }
                }
            }

            System.out.println("Socios que pagaron mas de " + cantidad + ": " + contador);
        }
    
}
