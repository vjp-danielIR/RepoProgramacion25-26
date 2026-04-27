package prueba;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Prueba {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();

        cargarFichero(lista);
        mostrarLista(lista);

        buscarPersonaFichero();
        borrarPersona(lista);
        modificarPersona(lista);
    }

    // ---------------- PEDIR DATOS ----------------
    public static String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    // ---------------- MOSTRAR ----------------
    public static void mostrarLista(ArrayList<Persona> lista) {
        for (Persona p : lista) {
            System.out.println(p);
        }
    }

    // ---------------- BUSCAR EN FICHERO ----------------
    public static void buscarPersonaFichero() {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            String buscar = pedirTexto("Nombre a buscar: ");
            boolean encontrado = false;

            fr = new FileReader("agenda.txt");
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] p = linea.split(",");

                if (p[0].equalsIgnoreCase(buscar)) {
                    System.out.println("Encontrado: " + linea);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No encontrado");
            }

        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar");
            }
        }
    }

    // ---------------- CARGAR ----------------
    public static void cargarFichero(ArrayList<Persona> lista) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("agenda.txt");
            br = new BufferedReader(fr);

            lista.clear();

            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.trim().isEmpty()) continue;

                String[] p = linea.split(",");

                lista.add(new Persona(
                        p[0],
                        Integer.parseInt(p[1]),
                        p[2]
                ));
            }

            System.out.println("Fichero cargado en memoria");

        } catch (IOException e) {
            System.out.println("Error al cargar");
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar");
            }
        }
    }

    // ---------------- BORRAR ----------------
    public static void borrarPersona(ArrayList<Persona> lista) {

        String nombre = pedirTexto("Nombre a borrar: ");
        boolean eliminado = false;

        Iterator<Persona> it = lista.iterator();

        while (it.hasNext()) {
            Persona p = it.next();

            if (p.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                eliminado = true;
            }
        }

        if (eliminado) {
            System.out.println("Persona eliminada");
        } else {
            System.out.println("No encontrada");
        }
    }

    // ---------------- MODIFICAR ----------------
    public static void modificarPersona(ArrayList<Persona> lista) {

        String nombre = pedirTexto("Nombre a modificar: ");
        boolean encontrado = false;

        for (Persona p : lista) {

            if (p.getNombre().equalsIgnoreCase(nombre)) {

                p.setNombre(pedirTexto("Nuevo nombre: "));
                p.setEdad(pedirEntero("Nueva edad: "));
                p.setTelefono(pedirTexto("Nuevo teléfono: "));

                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Persona modificada");
        } else {
            System.out.println("No encontrada");
        }
    }
}