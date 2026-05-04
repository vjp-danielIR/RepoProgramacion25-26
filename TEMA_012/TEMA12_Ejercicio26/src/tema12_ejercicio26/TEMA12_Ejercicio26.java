/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio26;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        int opcion = 0;
        do {
            try {
                System.out.println("=====MENU=====");
                System.out.println("----------------");
                System.out.println("1. Introducir Bebidas");
                System.out.println("----------------------");
                System.out.println("2. Comprar Productos");
                System.out.println("----------------------");
                System.out.println("3. Salir del programa");

                opcion = (int) pedirInt("Que opcion desea?");

                switch (opcion) {
                    case 1 ->
                        introducirBebidas(productos);
                    case 2 ->
                        comprarProductos(productos);
                    case 3 ->
                        System.out.println("Saliento del programa...");
                    default ->
                        System.out.println("opcion no disponible");

                }
            } catch (InputMismatchException e) {
                System.out.println("valor no apto");
            } catch (IOException ex) {
                Logger.getLogger(TEMA12_Ejercicio26.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (opcion != 2);

    }
    //metodo que crea una asignatura y la mete en el arryList

    public static void introducirBebidas(List<Producto> productos) {

        boolean terminado = false;
        do {
            String nombre = pedirString("Nombre del producto: ");
            double precio = pedirDouble("Precio del producto:");
            int stock = (int) pedirInt("Unidades restantes del producto:");

            productos.add(new Producto(nombre, precio, stock));

        } while (pedirString("Desea seguir introduciendo productos? s/n").equalsIgnoreCase("s"));
    }

    //metodo que lee el documento asignaturas.od y hace la media en base a las notas
    public static void leerFichero() throws FileNotFoundException, IOException, ClassNotFoundException {

        System.out.println("");
        System.out.println("Leyendo fichero...");
        try (
                FileInputStream fis = new FileInputStream("productos.ob"); ObjectInputStream ois = new ObjectInputStream(fis)) {

        } catch (EOFException e) {
            System.out.println("Fin de lectura.");
        }
    }

    //metodos para pedir datos al usuario
    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.next();

    }

    public static double pedirDouble(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextDouble();
    }

    public static double pedirInt(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextInt();
    }

    public static void comprarProductos(List<Producto> productos) throws FileNotFoundException, IOException {
        boolean terminado = false;
        try (
                FileInputStream fis = new FileInputStream("productos.ob"); ObjectInputStream ois = new ObjectInputStream(fis)) {

            do {
                for (Producto p : productos) {
                    System.out.println(p.getNombre() + p.getPrecio() + p.getStock());
                }

            } while (!terminado);
        } catch (EOFException e) {
            System.out.println("Fin de lectura.");
        }

    }

}
