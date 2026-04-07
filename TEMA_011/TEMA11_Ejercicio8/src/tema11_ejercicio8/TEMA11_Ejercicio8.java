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
        ArrayList<Ciudades> ciudades = new ArrayList<>();

        do {
            try {
                System.out.println("\n===== Menu =====");
                System.out.println("1. Añadir Ciudad");
                System.out.println("------------------");
                System.out.println("2. Mostrar ciudades");
                System.out.println("------------------");

                System.out.println("3. Sedes por encima de la media");
                System.out.println("------------------");

                System.out.println("4. Buscar sede");
                System.out.println("------------------");

                System.out.println("5. Añadir sede");
                System.out.println("------------------");

                System.out.println("6. Mostrar sedes ordenadas");
                System.out.println("------------------");

                System.out.println("7. Salir");
                System.out.println("------------------");

                opcion = pedirInt("¿Que opcion desea?");

                switch (opcion) {

                    case 1:
                        añadirCiudad(ciudades);
                        break;

                    case 2:
                        mostrarCiudades(ciudades);
                        break;

                    case 3:
                        sedesSobreMedia(ciudades);
                        break;

                    case 4:
                        String nombre = pedirString("Nombre de la sede:");
                        System.out.println(buscarSede(ciudades, nombre));
                        break;

                    case 5:
                        añadirSede(ciudades);
                        break;

                    case 6:
                        mostrarSedesOrdenadas(ciudades);
                        break;

                    case 7:
                        System.out.println("Saliendo...");
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

    public static void añadirCiudad(ArrayList<Ciudades> ciudades) {

        String nombreCiudad = pedirString("Nombre ciudad:");
        Ciudades nueva = new Ciudades();
        nueva.setNombre(nombreCiudad);

        String continuar;

        do {
            String nombreSede = pedirString("Nombre sede:");
            double ingresos = pedirDouble("Ingresos:");

            nueva.getSede().add(new Sedes(nombreSede, ingresos));

            continuar = pedirString("Quieres otra sede? (s/n)");

        } while (continuar.equalsIgnoreCase("s"));

        ciudades.add(nueva);
    }

    public static void mostrarCiudades(ArrayList<Ciudades> ciudades) {
        for (Ciudades c : ciudades) {
            System.out.println(c);
        }
    }

    public static void sedesSobreMedia(ArrayList<Ciudades> ciudades) {

        double suma = 0;
        int contador = 0;

        for (Ciudades ciudad : ciudades) {
            for (Sedes s : ciudad.getSede()) {
                suma += s.getIngresos();
                contador++;
            }
        }

        double media = suma / contador;

        System.out.println("Media: " + media);

        for (Ciudades ciudad : ciudades) {
            for (Sedes sede : ciudad.getSede()) {
                if (sede.getIngresos() > media) {
                    System.out.println(sede.getNombre());
                }
            }
        }
    }

    public static boolean buscarSede(ArrayList<Ciudades> ciudades, String nombre) {

        int i = 0;

        while (i < ciudades.size()) {

            Ciudades c = ciudades.get(i);
            Iterator<Sedes> it = c.getSede().iterator();

            while (it.hasNext()) {
                Sedes s = it.next();

                if (s.getNombre().equalsIgnoreCase(nombre)) {
                    return true;
                }
            }

            i++;
        }

        return false;
    }


public static void añadirSede(ArrayList<Ciudades> ciudades) {

    String nombreCiudad = pedirString("Ciudad:");

    for (Ciudades ciudad : ciudades) {
        if (ciudad.getNombre().equalsIgnoreCase(nombreCiudad)) {

            String nombreSede = pedirString("Nombre sede:");
            double ingresos = pedirDouble("Ingresos:");

            ciudad.getSede().add(new Sedes(nombreSede, ingresos));
            return;
        }
    }

    System.out.println("Ciudad no encontrada");
}

 public void mostrarSedesOrdenadas(ArrayList<Ciudades> ciudades) {
        ArrayList<Sedes> ordenadas = new ArrayList<>();
      ordenadas.sort((ciudad1,ciudad2) -> Double.compare(ciudad1.getIngresos(), ciudad2.getIngresos()));
        System.out.println("\n--- Ordenadas de mayor a menor ---");
        for (Sedes sede : ordenadas) {
            System.out.println(sede);
        }
    }

}
