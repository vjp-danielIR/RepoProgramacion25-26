/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio13;

import java.util.*;

/**
 *
 * @author alumno
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
                    case 1 -> introducirVentas(ventas,meses);
                    case 2 -> mostrarVentas(ventas, meses);
                    case 3 -> mostrarSumaTotal(ventas, meses);
                    case 4 -> mostrarVentasMesesA(ventas, meses);
                    case 5 -> mesMasVentas(ventas, meses);
                    case 6 -> System.out.println("Saliendo del programa....");
                    default ->
                        System.out.println("los valores son entre 1 y 6, valor no valido");
                }
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número.");

            }

        } while (opcion != 6);
    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("Dime una opcion del menú");
        int opcion = entrada.nextInt();
        return opcion;
    }

    public static void introducirVentas(ArrayList<Ventas> ventas, String[] meses) {
      for (int i = 0; i < meses.length; i++) {
          Scanner entrada = new Scanner(System.in);

       
            System.out.println("Dime las ventas del mes " + meses[i] + ":");
            int venta = entrada.nextInt();
             ventas.add(new Ventas(meses[i], venta));
            
        }
        
    }
          
    public static void mostrarVentas(ArrayList<Ventas> ventas, String[] meses) {
     
        for (Ventas venta : ventas) {
            System.out.println(venta.getNombreMes() + ": " + venta.getVentasCochesMes());
        }
}

    public static void mostrarSumaTotal(ArrayList<Ventas> ventas, String[] meses) {
    
    
    
    }

    private static void mostrarVentasMesesA(ArrayList<Ventas> ventas, String[] meses) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void mesMasVentas(ArrayList<Ventas> ventas, String[] meses) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
