/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio16;

import java.util.*;

/**
 *
 * @author alumno
 */
public class TEMA10_Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Producto> lista = new ArrayList<>();

        int opcion = 0;
        do {
            try {
                System.out.println("\n--- MENU PRINCIPAL ---");
                System.out.println("1. Menu de Administracion");
                System.out.println("2. Menu de Compra");
                System.out.println("3. Salir");
                opcion = pedirOpcion();
            } catch (InputMismatchException e) {
                System.out.println("valor no apto");
            }

            switch (opcion) {
                case 1 ->
                    menuAdministracion(lista);
                case 2 ->
                    menuCompra(lista);
                case 3 ->
                    System.out.println("Hasta luego.");
                default ->
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);
    }

    //metodo apra mostrar el menu de administracion
    public static void menuAdministracion(ArrayList<Producto> lista) {
        int opcion = 0;
        do {
            System.out.println("\n--- MENU DE ADMINISTRACION ---");
            System.out.println("1. Introducir producto");
            System.out.println("2. Visualizar lista de productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Volver al menu principal");
            try {
                opcion = pedirOpcion();
            } catch (InputMismatchException e) {
                System.out.println("valor no apto");
            }
            switch (opcion) {
                case 1 ->
                    introducirProducto(lista);
                case 2 ->
                    mostrarProductos(lista);
                case 3 ->
                    eliminarProducto(lista);
                case 4 ->
                    System.out.println("Volviendo al menu principal...");
                default ->
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);
    }

    //metodo que pide los datos de nombre precio y stock de los productos
    public static void introducirProducto(ArrayList<Producto> lista) {
        String nombre = pedirNombre();
        float precio = pedirPrecio();
        int stock = pedirStock();

        lista.add(new Producto(nombre, precio, stock));
        System.out.println("Producto añadido correctamente.");
    }

    //metodo para ver todos los productos
    public static void mostrarProductos(ArrayList<Producto> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("====== LISTA DE PRODUCTOS ======");
            for (int i = 0; i < lista.size(); i++) {
                Producto p = lista.get(i);
                System.out.println((i + 1) + ". Nombre: " + p.getNombre() + " | Precio: " + p.getPrecio() + " | Stock: " + p.getStock());
            }
        }
    }

    //metodo oara eliminar producto 
    public static void eliminarProducto(ArrayList<Producto> lista) {
        String nombre = pedirNombreEliminar();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(i);
                System.out.println("Producto eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontro el producto.");
    }

    //falta por realizar metodo que muestra el menu de compra
    public static void menuCompra(ArrayList<Producto> lista) {
        int opcion = 0;
        do {
            System.out.println("\n--- MENU DE ADMINISTRACION ---");
            System.out.println("1. Comprar Productos");
            System.out.println("2. Volver al Menu Principal");
            try {
                opcion = pedirOpcion();
            } catch (InputMismatchException e) {
                System.out.println("valor no apto");
            }

            switch (opcion) {
                case 1 ->
                    comprarProductos(lista);
                case 2 ->
                    System.out.println("Volviendo al menu principal...");
                default ->
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 2);

    }

    //metodo que pide una opcion de lo menus
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Elige una opcion: ");
        int opcion = entrada.nextInt();
        return opcion;
    }

    //metodo que pide el nombre del producto
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del producto: ");
        String nombre = entrada.nextLine();
        return nombre;
    }

    //metodo que pide el precio del producto
    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio: ");
        float precio = entrada.nextFloat();
        return precio;
    }

    //metodo que pide el stock que hay
    public static int pedirStock() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Stock: ");
        return Integer.parseInt(sc.nextLine());
    }

    ///metodo que pide un nombre para eliminarl
    /// @return o
     public static String pedirNombreEliminar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del producto a eliminar: ");
        String nombreEliminar = entrada.nextLine();
        return nombreEliminar;
    }

    public static void comprarProductos(ArrayList<Producto> lista) {
        Scanner entrada = new Scanner(System.in);
        mostrarProductos(lista);
        String productos = pedirProducto();
        int unidades = pedirUnidades();
        System.out.println("¿Desea seguir comprando??");
        String respuesta = entrada.next();

        while (respuesta.equalsIgnoreCase("si")) {
            mostrarProductos(lista);
             productos = pedirProducto();
             unidades = pedirUnidades();
            
        }
    }

    public static String pedirProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que productos desea?");
        String productos = entrada.next();
        return productos;
    }

    public static int pedirUnidades() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuantas unidades desea?");
        int unidades = entrada.nextInt();
        return unidades;
    }
}
