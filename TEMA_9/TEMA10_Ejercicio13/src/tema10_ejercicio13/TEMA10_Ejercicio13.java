/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio13;

import java.util.*;

/**
 *
 * @author daniel
 */
public class TEMA10_Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Ventas> ventas = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int opcion = 0;
        do {
            try {
                System.out.println("===== MENÚ VENTAS DE COCHES =====");
                System.out.print("------------------------------------ ");
                System.out.println("1. Introducir las ventas de coches de cada mes");
                System.out.print("------------------------------------ ");
                System.out.println("2. Mostrar las ventas introducidas");
                System.out.print("------------------------------------ ");
                System.out.println("3. Mostrar la suma total de ventas del año");
                System.out.print("------------------------------------ ");
                System.out.println("4. Mostrar las ventas de los meses que empiezan por A");
                System.out.print("------------------------------------ ");
                System.out.println("5. Mostrar el mes con más ventas");
                System.out.print("------------------------------------ ");
                System.out.println("6. Salir");
                System.out.print("------------------------------------ ");

                opcion = pedirOpcion();

                switch (opcion) {
                    case 1 ->
                        introducirVentas(ventas, meses);
                    case 2 ->
                        mostrarVentas(ventas, meses);
                    case 3 ->
                        mostrarSumaTotal(ventas, meses);
                    case 4 ->
                        mostrarVentasMesesA(ventas, meses);
                    case 5 ->
                        mesMasVentas(ventas, meses);
                    case 6 ->
                        System.out.println("Saliendo del programa....");
                    default ->
                        System.out.println("los valores son entre 1 y 6, valor no valido");
                }
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número.");

            }

        } while (opcion != 6);
    }

    // Pide al usuario que elija una opción del menú
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("Dime una opcion del menú");
        int opcion = entrada.nextInt();
        return opcion;
    }

    // Pide al usuario que introduzca las ventas de cada mes del año
    public static void introducirVentas(ArrayList<Ventas> ventas, String[] meses) {
        for (int i = 0; i < meses.length; i++) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Dime las ventas del mes " + meses[i] + ":");
            int venta = entrada.nextInt();
            ventas.add(new Ventas(meses[i], venta));

        }

    }

    // Muestra las ventas de todos los meses que se han introducido
    public static void mostrarVentas(ArrayList<Ventas> ventas, String[] meses) {

        for (int i = 0; i < ventas.size(); i++) {
            System.out.println(ventas.get(i).getNombreMes() + ": " + ventas.get(i).getVentasCochesMes());
        }
    }

    // Calcula y muestra la suma total de ventas del año
    public static void mostrarSumaTotal(ArrayList<Ventas> ventas, String[] meses) {
        double suma = 0;

        for (int i = 0; i < ventas.size(); i++) {
            suma += ventas.get(i).getVentasCochesMes();
        }

        System.out.println("La suma total de ventas del año es: " + suma);

    }

    // Muestra solo las ventas de los meses que empiezan por A (Abril y Agosto)
    public static void mostrarVentasMesesA(ArrayList<Ventas> ventas, String[] meses) {
        boolean hayMeses = false;

        for (int i = 0; i < ventas.size(); i++) {
            String nombreMes = ventas.get(i).getNombreMes();

            // Comprobamos si la primera letra es 'A'
            if (nombreMes.charAt(0) == 'A') {
                System.out.println(nombreMes + ": " + ventas.get(i).getVentasCochesMes());
                hayMeses = true;
            }
        }

        if (!hayMeses) {
            System.out.println("No hay meses que empiecen por 'A'.");
        }
    }

    // Busca y muestra cuál es el mes con más ventas
    public static void mesMasVentas(ArrayList<Ventas> ventas, String[] meses) {
        Ventas mayor = ventas.get(0);

        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getVentasCochesMes() > mayor.getVentasCochesMes()) {
                mayor = ventas.get(i);
            }
        }

        System.out.println("El mes con más ventas es "
                + mayor.getNombreMes() + " con "
                + mayor.getVentasCochesMes() + " ventas.");
    }
}
