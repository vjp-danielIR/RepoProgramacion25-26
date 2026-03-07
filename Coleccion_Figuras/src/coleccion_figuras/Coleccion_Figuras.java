package coleccion_figuras;

import java.util.*;

/**
 * @author Daniel Iglesias Ramos
 */
public class Coleccion_Figuras {

    // Muestra el menu y gestiona las opciones del usuario
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Figuras[][] figura = new Figuras[3][3];
        int opcion = 0;

        do {
            System.out.println("Menu");
            System.out.println("1. Rellenar la vitrina de figuras");
            System.out.println("2. Mostrar todas las figuras de una coleccion");
            System.out.println("3. Mostrar la figura mas valiosa");
            System.out.println("4. Salir del programa");
            System.out.println("Que opcion quieres?");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1 -> rellenarMatriz(figura, entrada);
                    case 2 -> mostrarColeccion(figura, entrada);
                    case 3 -> mostrarMasValiosa(figura);
                    case 4 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opcion no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 4);
    }

    // Rellena la matriz 3x3 creando un objeto Figuras en cada posicion
    public static void rellenarMatriz(Figuras[][] figuras, Scanner entrada) {
        for (int i = 0; i < figuras.length; i++) {
            for (int j = 0; j < figuras[i].length; j++) {
                System.out.println("Figura [" + (i + 1) + "][" + (j + 1) + "]");
                figuras[i][j] = new Figuras(pedirNombre(entrada), pedirValor(entrada), pedirColeccion(entrada));
            }
        }
    }

    // Pide y devuelve el nombre de la figura
    public static String pedirNombre(Scanner entrada) {
        System.out.println("Como se llama la figura?");
        return entrada.nextLine();
    }

    // Pide y devuelve el valor de la figura, valida que no sea negativo
    public static double pedirValor(Scanner entrada) {
        double valor = 0;
        boolean valido = false;
        while (!valido) {
            System.out.println("Cual es su valor?");
            try {
                valor = Double.parseDouble(entrada.nextLine());
                if (valor < 0) {
                    System.out.println("El valor no puede ser negativo.");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Introduce un numero valido.");
            }
        }
        return valor;
    }

    // Pide y devuelve la coleccion de la figura
    public static String pedirColeccion(Scanner entrada) {
        System.out.println("De que coleccion es la figura?");
        return entrada.nextLine();
    }

    // Muestra todas las figuras que pertenecen a una coleccion concreta
    public static void mostrarColeccion(Figuras[][] figuras, Scanner entrada) {
        System.out.println("De que coleccion quieres ver las figuras?");
        String coleccion = entrada.nextLine();
        boolean encontrada = false;

        for (int i = 0; i < figuras.length; i++) {
            for (int j = 0; j < figuras[i].length; j++) {
                if (figuras[i][j] != null && figuras[i][j].getColeccion().equalsIgnoreCase(coleccion)) {
                    System.out.println("Nombre: " + figuras[i][j].getNombrePerso()
                            + "  Valor: " + figuras[i][j].getValor()
                            + "  Coleccion: " + figuras[i][j].getColeccion()
                            + "  Posicion: [" + (i + 1) + "][" + (j + 1) + "]");
                    encontrada = true;
                }
            }
        }
        if (!encontrada) {
            System.out.println("No se encontro ninguna figura de esa coleccion.");
        }
    }

    // Busca y muestra la figura con el valor mas alto de la vitrina
    public static void mostrarMasValiosa(Figuras[][] figuras) {
        Figuras figuraMasValiosa = null;
        int[] posicion = new int[2];

        for (int i = 0; i < figuras.length; i++) {
            for (int j = 0; j < figuras[i].length; j++) {
                if (figuras[i][j] != null && (figuraMasValiosa == null || figuras[i][j].getValor() > figuraMasValiosa.getValor())) {
                    figuraMasValiosa = figuras[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }

        if (figuraMasValiosa == null) {
            System.out.println("No hay figuras en la vitrina.");
        } else {
            System.out.println("La figura mas valiosa es:");
            System.out.println("Nombre: " + figuraMasValiosa.getNombrePerso()
                    + "  Valor: " + figuraMasValiosa.getValor()
                    + "  Coleccion: " + figuraMasValiosa.getColeccion()
                    + "  Posicion: [" + (posicion[0] + 1) + "][" + (posicion[1] + 1) + "]");
        }
    }
}