/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio6;

import java.util.*; //importamos todas las clases

/**
 *
 * @author daniel
 */
public class TEMA10_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> ventas = new ArrayList<>();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int opcion = 0;

        do {

            try {
                System.out.println(" 1. Introducir las ventas de coches de cada uno de los 12 meses del año.");
                System.out.println("");
                System.out.println("2. Mostrar las ventas introducidas en el punto anterior. ");
                System.out.println("");
                System.out.println("3. Mostrar las ventas introducidas al revés.");
                System.out.println("");
                System.out.println("4. Que muestre la suma total de ventas del año.");
                System.out.println("");
                System.out.println("5. Que muestre las ventas totales de los meses cuyo nombre contenga la letra a");
                System.out.println("");
                System.out.println("6. Que muestre el nombre del mes (o meses) con más ventas.");
                System.out.println("");
                System.out.println("7. Salir del programa");
                System.out.println("");

                opcion = pedirOpcion();

                switch (opcion) {
                    case 1 ->
                        introducirVentas(ventas, meses);
                    case 2 ->
                        mostrarVentas(ventas, meses);
                    case 3 ->
                        mostrarVentasAlReves(ventas, meses);
                    case 4 ->
                        sumaTotalAño(ventas, meses);
                    case 5 ->
                        ventasTotalMesesA(ventas, meses);
                    case 6 ->
                        mesMasVentas(ventas, meses);
                    case 7 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("los valores son entre 1 y 7, valor no valido");

                }
            } catch (InputMismatchException e) {
                System.out.println("valor no apto");
            }

        } while (opcion != 7);
    }
    //Metodo para pedirle una opcion al usuario sobre el menu
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una opcion");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        return opcion;
    }
    //Metodo para introducir las ventas de los cohces 
    public static void introducirVentas(ArrayList<Integer> ventas, String[] meses) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < meses.length; i++) {
            System.out.println("Dime las ventas del mes " + meses[i] + ":");
            int venta = entrada.nextInt();

            ventas.add(venta);
        }
       
    }
    //Metodo que muestra las ventas anterior mente introducidas
    public static void mostrarVentas(ArrayList<Integer> ventas, String[] meses) {
        if(ventas.isEmpty()){
            System.out.println("Aun no se han introducido datos de ventas");
        
        }else{
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println("Las ventas del mes: " + meses[i] + " fueron: " + ventas.get(i));

        }
        }
    }
    //Metodo que muestra todas las ventas al reves es decir desde DICIEMBRE HASTA ENERO
    public static void mostrarVentasAlReves(ArrayList<Integer> ventas, String[] meses) {
        for (int i = ventas.size() - 1; i >= 0; i--) {
            System.out.println("Mes: " + meses[i] + " - Ventas: " + ventas.get(i));
        }
    }
    //Metodo que suma las ventas de todo el año 
    public static void sumaTotalAño(ArrayList<Integer> ventas, String[] meses) {
        int sumaTotal = 0;
        for (int i = 0; i < ventas.size(); i++) {
            sumaTotal += ventas.get(i);
        }
        System.out.println("");
        System.out.println(" TOTAL DE VENTAS DEL AÑO ");
        System.out.println("Total de las ventas: " + sumaTotal + "€");
        System.out.println("");
    }
    
    //metodo que muestra las ventas de todos los meses que contengan una a en su nombre
    public static void ventasTotalMesesA(ArrayList<Integer> ventas, String[] meses) {
        int sumaTotal = 0;
        System.out.println(" VENTAS DE MESES CON LA LETRA A ");

        for (int i = 0; i < meses.length; i++) {
            //toLoweCase es para hacerlo minusculas y contains es para comprobar si hay una a 
            if (meses[i].toLowerCase().contains("a")) {
                System.out.println(meses[i] + ": " + ventas.get(i) + " €");
                sumaTotal += ventas.get(i);
            }
        }

        System.out.println("Total de ventas en meses con 'a': " + sumaTotal);
        System.out.println();
    }

    //Metodo que comprueba cual es el mes con mas ventas
    public static void mesMasVentas(ArrayList<Integer> ventas, String[] meses) {
        int maxVentas = 0;
        String mes = "";
        System.out.println(" MES CON MÁS VENTAS");

        // Mostrar todos los meses que tienen el máximo
        for (int i = 0; i < ventas.size(); i++) {
            if (maxVentas <= ventas.get(i)) {
                maxVentas = ventas.get(i);
                mes = meses[i];
            }
        }
        System.out.println("la venta mas grande fue del mes: " + mes + " y fue con: " + maxVentas);

    }
}
