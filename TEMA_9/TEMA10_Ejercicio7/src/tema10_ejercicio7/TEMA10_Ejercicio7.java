/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio7;

import java.util.*;

/**
 *
 * @author alumno
 */
public class TEMA10_Ejercicio7 {

    public final static int SEMANAS = 4;
    public final static int DIAS = 7;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();
        String[] diaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int opcion = 0;

        do {

            try {
                System.out.println("1. Rellenar temperaturas");
                System.out.println("");
                System.out.println("2. Mostrar temperaturas");
                System.out.println("");
                System.out.println("3. Mostrar temperatura media");
                System.out.println("");
                System.out.println("4. dias mas calurosos");
                System.out.println("");
                System.out.println("5. Salir");
                System.out.println("");

                opcion = pedirOpcion();

                switch (opcion) {
                    case 1 ->
                        rellenar(temperaturas);
                    case 2 ->
                        mostrarTemp(temperaturas, diaSemana);
                    case 3 ->
                        calcularMedia(temperaturas, diaSemana);
                    case 4 ->
                        temperaturaMaxima(temperaturas, diaSemana);
                    case 5 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("los valores son entre 1 y 5, valor no valido");
                }
            } catch (InputMismatchException e) {
                System.out.println("valor no apto");
            }

        } while (opcion != 3);

    }

    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una opcion");
        int opcion = entrada.nextInt();
        return opcion;
    }

    //metodo que rellena el arrayList de ARRAYLIST 
    public static void rellenar(ArrayList<ArrayList<Integer>> temperaturas) {
        if (temperaturas.isEmpty()) {
            System.out.println("ArrayList rellenadoo");
        } else {
        for (int i = 0; i < SEMANAS; i++) {
            //creo el arraylist
            ArrayList<Integer> dias = new ArrayList<>();
            //y le pongo 7 temperaturas aleatorias del 0 al 14
            for (int j = 0; j < DIAS; j++) {
                dias.add((int) (Math.random() * 15));

            }
            //cuando termine de iterar se la meto al arraylist de array list
            temperaturas.add(dias);
        }
        }
    }

    //Metodo que muestra las temperaturas del mes
    public static void mostrarTemp(ArrayList<ArrayList<Integer>> temperaturas, String[] diaSemana) {
        if (temperaturas.isEmpty()) {
            System.out.println("ArrayList no rellenado");
        } else {
            for (int i = 0; i < SEMANAS; i++) {
                System.out.println("Semana: " + (i + 1));
                for (int j = 0; j < DIAS; j++) {
                    System.out.println(diaSemana[j] + ": " + temperaturas.get(i).get(j) + "ºC");

                }
            }
        }
    }

    //metodo que muestra la temperatura media del mes                                                       
    public static void calcularMedia(ArrayList<ArrayList<Integer>> temperaturas, String[] diaSemana) {
        if (temperaturas.isEmpty()) {
           System.out.println("ArrayList no rellenado");
        } else {
            int media = 0;
            for (int i = 0; i < SEMANAS; i++) {

                for (int j = 0; j < DIAS; j++) {
                    media = temperaturas.get(i).get(j);

                }
            }
            media /= SEMANAS * DIAS;
            System.out.println("La temperatura media del mes fue de: " + media + "ºC");
        }
    }

    public static void temperaturaMaxima(ArrayList<ArrayList<Integer>> temperaturas, String[] diaSemana) {
        if (temperaturas.isEmpty()) {
            System.out.println("ArrayList no rellenado");
        } else {
            int max = 0, tempActual;
            for (int i = 0; i < SEMANAS; i++) {

                for (int j = 0; j < DIAS; j++) {
                    tempActual = temperaturas.get(i).get(j);
                    if (max < tempActual) {
                        max = tempActual;
                    }

                }
            }
            System.out.println("Los dias con mayor temperatura del mes fueron: ");
            for (int i = 0; i < SEMANAS; i++) {

                for (int j = 0; j < DIAS; j++) {
                    if (temperaturas.get(i).get(j) == max) {
                        System.out.println("El " + diaSemana[j] + "de la semana" + (i + 1) + " con " + max);
                    }
                }

            }
        }
    }

}
