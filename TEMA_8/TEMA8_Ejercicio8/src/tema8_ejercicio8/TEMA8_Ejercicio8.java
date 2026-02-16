/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema8_ejercicio8;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class TEMA8_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menu de administracion - devuelve el array de productos
        Producto[] productos = menuAdministracion();

        //Menu de ventas - devuelve el total de la compra
        double totalCompra = menuVentas(productos);

        //Despedida
        System.out.println();
        System.out.println("El total de su compra asciende a " + (int) totalCompra + " Euros");
        System.out.println("Muchas gracias. Vuelva cuando quiera.");
    }

    //Metodo que muestra el menu de administracion y crea los productos
    //Devuelve un array con todos los productos creados
    public static Producto[] menuAdministracion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Acceso al menu de Administracion:");
        System.out.print("Cuantos productos desea dar de alta? ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        //crear array de productos
        Producto[] productos = new Producto[cantidad];

        //pedir datos de cada producto
        for (int i = 0; i < cantidad; i++) {
            System.out.println();
            System.out.println("- PRODUCTO " + (i + 1) + " -");

            System.out.print("Introduzca el nombre del producto: ");
            String nombre = entrada.nextLine();

            System.out.print("Introduzca el precio del producto: ");
            double precio = entrada.nextDouble();

            System.out.print("Introduzca el stock del producto: ");
            int stock = entrada.nextInt();
            entrada.nextLine();

            //crear producto y guardarlo en el array
            productos[i] = new Producto(nombre, precio, stock);

            System.out.println("- PRODUCTO " + (i + 1) + " ALMACENADO CON EXITO -");
        }

        System.out.println();

        //devolver el array de productos
        return productos;
    }

    //Metodo que gestiona el menu de ventas
    //Devuelve el importe total de todas las compras realizadas
    public static double menuVentas(Producto[] productos) {
        Scanner entrada = new Scanner(System.in);
        boolean seguirComprando = true;
        double totalCompra = 0;

        while (seguirComprando) {
            System.out.println("Acceso al menu de Ventas:");

            //mostrar todos los productos disponibles
            mostrarProductos(productos);

            //elegir producto
            int opcion = entrada.nextInt();

            //validar opcion
            if (opcion < 1 || opcion > productos.length) {
                System.out.println("Opcion no valida");
                continue;
            }

            //preguntar cuantas unidades desea
            int unidades = preguntarUnidades(productos, opcion - 1);

            //procesar compra y acumular el total
            totalCompra += procesarCompra(productos, opcion - 1, unidades);

            //preguntar si desea seguir comprando
            seguirComprando = preguntarSeguirComprando();
        }

        //devolver el total de la compra
        return totalCompra;
    }

    //Metodo que muestra todos los productos disponibles con su informacion
    public static void mostrarProductos(Producto[] productos) {
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Pulse " + (i + 1) + " para comprar "
                    + productos[i].getNombre() + " cuyo precio es de "
                    + (int) productos[i].getPrecio() + " euros y el stock es de "
                    + productos[i].getStock() + " unidades.");
        }
    }

    //Metodo que pregunta al usuario cuantas unidades desea comprar
    //Devuelve la cantidad de unidades solicitadas
    public static int preguntarUnidades(Producto[] productos, int indiceProducto) {
        Scanner entrada = new Scanner(System.in);
        Producto producto = productos[indiceProducto];

        System.out.println();
        System.out.println("Ha elegido comprar " + producto.getNombre());
        System.out.print("Cuantas unidades desea? ");
        int unidades = entrada.nextInt();

        return unidades;
    }

    //Metodo que procesa la compra verificando el stock y actualizandolo
    //Devuelve el importe de la compra o 0 si no hay suficiente stock
    public static double procesarCompra(Producto[] productos, int indiceProducto, int unidades) {
        Producto producto = productos[indiceProducto];

        //verificar si hay suficiente stock
        if (unidades > producto.getStock()) {
            System.out.println("Lo sentimos, solo tenemos disponibles "
                    + producto.getStock() + " unidades");
            return 0;
        } else {
            //actualizar stock
            actualizarStock(productos, indiceProducto, unidades);

            //calcular importe
            double importe = producto.getPrecio() * unidades;

            System.out.println("Venta Realizada con exito");

            //devolver el importe de esta compra
            return importe;
        }
    }

    //Metodo que actualiza el stock de un producto despues de una venta
    public static void actualizarStock(Producto[] productos, int indiceProducto, int unidadesCompradas) {
        Producto producto = productos[indiceProducto];
        int nuevoStock = producto.getStock() - unidadesCompradas;
        producto.setStock(nuevoStock);
    }

    //Metodo que pregunta al usuario si desea comprar otro producto
    //Devuelve true si desea seguir comprando o false si desea salir
    public static boolean preguntarSeguirComprando() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Desea comprar otro producto? ");
        String respuesta = entrada.next();
        entrada.nextLine();

        System.out.println();

        if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }
    }
}
