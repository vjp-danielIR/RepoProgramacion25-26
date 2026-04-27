/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioninventario_danieliglesias;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel_Iglesias
 */
public class GestionInventario_DanielIglesias {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<Productos> producto = new ArrayList<>();
        int opcion = 0;
        do {
            try {
                System.out.println("============MENU DEL INVENTARIO=============");
                System.out.println("---------------------------------------------");

                System.out.println("1. rellenar inventario");
                System.out.println("---------------------------------------------");

                System.out.println("2. guardar datos en el fichero inventario.txt ");
                System.out.println("---------------------------------------------");

                System.out.println("3. mostrar inventario");
                System.out.println("---------------------------------------------");

                System.out.println("4. calcular total valor de cada producto");
                System.out.println("---------------------------------------------");

                System.out.println("5. salir del programa");
                System.out.println("---------------------------------------------");

                opcion = pedirInt("Que opcion desea?");
            } catch (InputMismatchException e) {
                System.out.println("dato no valido");
            }

            switch (opcion) {
                case 1:
                    rellenarInventario(producto);
                case 2: {
                    try {
                        guardarFichero(producto);
                    } catch (IOException ex) {
                        Logger.getLogger(GestionInventario_DanielIglesias.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                //      case 3:
                //        mostrarInventario(producto);
                case 4:
                    calcularTotal(producto);
                case 5:
                    System.out.println("saliento del programa");
                default:
                    System.out.println("opcion no disponible");
                    ;
            }
        } while (opcion != 5);

    }
    //metodo que crea un producto y luego se añade al arrayList

    public static void rellenarInventario(List<Productos> producto) {

        do {
            try {
                String nombre = pedirString("Nombre del producto:");

                int cantidad = pedirInt("Unidades disponibles:");
                double precio = pedirDouble("Precio del producto:");

                producto.add(new Productos(nombre, cantidad, precio));
            } catch (InputMismatchException e) {
                System.out.println("dato no valido");
            }

        } while (pedirString("Desea continuar? s/n").equalsIgnoreCase("s"));
    }

    //metodo para escribir en el archivo inventario 
    public static void guardarFichero(List<Productos> producto) throws IOException {

        FileWriter fw = new FileWriter("inventario.txt", true);
        PrintWriter pw = new PrintWriter(fw);

        for (Productos p : producto) {
            pw.print(p.getNombre() + "#" + p.getCantidad() + "#" + p.getPrecio());
        }

    }

    //metodo para calcular el valor de un producto es decir sumar el precio por las unidades
    public static void calcularTotal(List<Productos> producto) {
        double total = 0;
        for (Productos p : producto) {
            double precio = p.getCantidad() * p.getPrecio();
            total = precio + total;

        }
        System.out.println("Precio total de productos: " + total);
    }

    //metodos para pedir datos
    public static int pedirInt(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextInt();
    }

    //metodos para pedir datos
    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.next();
    }

    //metodos para pedir datos
    public static double pedirDouble(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextDouble();
    }

    //metodo para mostrar el inventario por producto cantidad y precio
    /*   public static void mostrarInventario(List<Productos> producto) {

       FileRead fr = new FileRead("inventario.txt");
        BufferedRead br = new BufferedRead(fr);

        String linea = br.read();
        String[] p = linea.split("#");

        for (linea = br.read(); linea != null;) {
            System.out.println("Producto: " + p[0] + " Cantidad: " + p[1] + " Precio: " + p[2]);

        }

    }*/
}
