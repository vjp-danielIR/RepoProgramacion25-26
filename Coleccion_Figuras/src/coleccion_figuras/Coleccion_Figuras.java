/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coleccion_figuras;

import java.util.*;  //para perdir al usuario y el arrayList

/**
 *
 * @author Daniel Iglesias Ramos
 */
public class Coleccion_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // Matriz
        String[][] figuras = new String[9][3];
        int opcion = 0;

        do {
            System.out.println("==================");
            System.out.println("-------Menu-------");
            System.out.println("____________________");
            System.out.println("1. Rellenar la vitrina de figuras");
            System.out.println("___________________________________");
            System.out.println("2. Mostrar todas las figuras de una coleccion");
            System.out.println("______________________________________________");
            System.out.println("3. Mostrar la figura mas valiosa");
            System.out.println("__________________________________");
            System.out.println("4. Salir del programa");
            System.out.println("________________________");
            System.out.println("Que opcion quieres?");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1 ->
                        rellenarMatriz(figuras);

                    case 2 ->
                        mostrarColeccion(figuras);
                    case 3 ->
                        mostrarMasValiosa(figuras);
                    case 4 ->
                        System.out.println("Saliendo...");
                    default ->
                        System.out.println("Opcion no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido");
                entrada.nextLine(); // limpiar la anterior entrada
                opcion = 0;
            }
        } while (opcion != 4);
    }

    // rellenar el vector con nombre y valor de cada figura
    public static void rellenarMatriz(String[][] figuras) {
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("--- Figura " + (i + 1) + " ---");
            figuras[i][0] = pedirNombre();
            figuras[i][1] = String.valueOf(pedirValor());  //cambiar el tipo de double a string
            figuras[i][2] = pedirColeccion();
          
        }
    }

    // pedir el nombre de la figura
    public static String pedirNombre() {
        Scanner figura = new Scanner(System.in);
        System.out.println("Como se llama la figura?");
        return figura.nextLine();
    }

    // pedir el valor de la figura
    public static double pedirValor() {
        Scanner precio = new Scanner(System.in);
        System.out.println("Cual es su valor?");

        return precio.nextDouble();

    }
    // pedir la coleccion de donde es la figura

    public static String pedirColeccion() {
        Scanner figura = new Scanner(System.in);
        System.out.println("De que coleccion es la figura?");
        return figura.nextLine();
    }

    // mostrar todas las figuras de una coleccion determinada 
    public static void mostrarColeccion(String[][] figuras) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("De que coleccion quieres ver las figuras?");
        String coleccion = entrada.nextLine();
        boolean encontrada = false;

        for (int i = 0; i < figuras.length; i++) {
            //si la figura x posicion no es nul y ignorando mayusculas es igual imprimira nombre valor coleccion y la posicion en la uqe la encontro 
            if (figuras[i][0] != null && figuras[i][2].equalsIgnoreCase(coleccion)) {
                System.out.println("Nombre: " + figuras[i][0] + "  Valor: " + figuras[i][1] + " Coleccion: " + figuras[i][2] + " Posicion en la vitrina: " + (i + 1));
                encontrada = true;
            }
        }
        System.out.println("No se encontro otra igual");
    }

    // mostrar la figura mas valiosa
    public static void mostrarMasValiosa(String[][] figuras) {
        String figuraMasValiosa = "";
        double valorMax = 0;

        for (int i = 0; i < figuras.length; i++) {
            //si figura posicion x no es null se convertira en double y si es mayor que 0 el valor max cambiara al nuevo valor y justito despues se guardara la posicion 
            //de la figura mas valiosa por entonces
            if (figuras[i][0] != null) {
                double valor = Double.parseDouble(figuras[i][1]); //que conste que me lo recomendo el ide yo puse el valueOf
                if (valor > valorMax) {
                    valorMax = valor;
                    figuraMasValiosa = figuras[i][0];
                }
            }
            System.out.println("Nombre: " + figuras[i][0] + "  Valor: " + figuras[i][1] + " Coleccion: " + figuras[i][2] + " Posicion en la vitrina: " + (i + 1));

        }
        
            System.out.println("No hay figuras en la vitrina");
        }
    }

