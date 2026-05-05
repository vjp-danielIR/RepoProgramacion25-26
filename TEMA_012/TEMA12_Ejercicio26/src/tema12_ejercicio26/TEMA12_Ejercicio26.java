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
    private static final String FICHERO = "productos.ob";

    public static void main(String[] args) {
     List<Producto> productos = new ArrayList<>();
        File fichero = new File(FICHERO);
        
        int opcion = 0;
        do {
            try {
                System.out.println("\n=====MENU=====");
                System.out.println("1. Introducir Bebidas");
                System.out.println("2. Comprar Productos");
                System.out.println("3. Salir del programa");

                opcion = (int) pedirInt("¿Qué opción desea?");

                switch (opcion) {
                    case 1 ->
                        introducirBebidas(productos);
                    case 2 ->
                        comprarProductos(productos);
                    case 3 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("Opción no disponible.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Valor no válido, introduzca un número.");
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(TEMA12_Ejercicio26.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        } while (opcion != 3);
    }

    //metodo para introducir bebidas
    public static void introducirBebidas(List<Producto >productos) throws IOException, ClassNotFoundException {

        do {
            String nombre = pedirString("Nombre del producto: ");
            double precio = pedirDouble("Precio del producto (€): ");
            int stock = (int) pedirInt("Unidades en stock: ");

            productos.add(new Producto(nombre, precio, stock));
            System.out.println(" Producto añadido correctamente.");

        } while (pedirString("¿Desea introducir otro producto? (s/n)").equalsIgnoreCase("s"));

        // Guardamos la lista actualizada en el fichero
        guardarProductos(productos);
        System.out.println(" Productos guardados en el fichero.");
    }

    //metodo para que el usuario compre el producto
    public static void comprarProductos(List<Producto> productos) throws IOException, ClassNotFoundException {

        double totalCompra = 0.0;

        boolean seguirComprando = true;
        while (seguirComprando) {

            // Mostramos el listado de productos
            System.out.println("\n===== LISTADO DE BEBIDAS =====");
            for (int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i));
            }

            // El usuario elige producto
            int eleccion = (int) pedirInt("Elige el número de producto que deseas comprar:");

            if (eleccion < 1 || eleccion > productos.size()) {
                System.out.println("Número de producto no válido.");
                continue;
            }

            Producto productoElegido = productos.get(eleccion - 1);

            int unidades = (int) pedirInt("¿Cuántas unidades deseas de '"
                    + productoElegido.getNombre() + "'?");

            if (unidades <= 0) {
                System.out.println("La cantidad debe ser mayor que 0.");

            } else if (unidades > productoElegido.getStock()) {
                System.out.println("Error: no hay suficiente stock.");
                System.out.println("Unidades disponibles de '"
                        + productoElegido.getNombre() + "': "
                        + productoElegido.getStock());

            } else {
                double subtotal = productoElegido.getPrecio() * unidades;
                totalCompra += subtotal;
                productoElegido.setStock(productoElegido.getStock() - unidades);

                System.out.printf(" Añadido:",
                        unidades, productoElegido.getNombre(), subtotal);
            }

            String respuesta = pedirString("¿Desea comprar otro producto? (s/n)");
            seguirComprando = respuesta.equalsIgnoreCase("s");
        }

        // Mostramos el importe total
        System.out.printf(" IMPORTE TOTAL:", totalCompra);

        // lo guardmaos en el fichero con el stock actualizado
        guardarProductos(productos);
        System.out.println("Stock actualizado en el fichero");
    }

 

    //  metodo que guardar lista de productos en el fichero
    public static void guardarProductos(List<Producto> productos) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(FICHERO); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            for (Producto p : productos) {
                oos.writeObject(p);
            }
        }
    }

    //metodos para pedir datos
    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextLine();
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
}
