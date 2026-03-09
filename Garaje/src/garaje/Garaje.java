/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garaje;

import java.util.*;

/**
 *
 * @author Daniel Iglesias Ramos
 */
public class Garaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //vector de objeto coche
        Coches[] coche = new Coches[9];
        int opcion = 0;
        //menu con control de expeciones
        do {
            try {
                System.out.println("======= MENU DEL GARAGE =======");
                System.out.println("_______________________________-");
                System.out.println("1. Aparcar ");
                System.out.println("__________________________________");
                System.out.println("2. Mostrar plazas libres");
                System.out.println("_______________________________--");
                System.out.println("3.Mostrar los datos de los coches aparcados");
                System.out.println("____________________________________________");
                System.out.println("4.Nombre de los titulares");
                System.out.println("________________________________________---");
                System.out.println("5. Buscar por matricula");
                System.out.println("________________________--");
                System.out.println(" 6. Estado de la plazas");
                System.out.println("___________________________-");
                System.out.println("7. salir.....");

                opcion = pedirOpcion();

                switch (opcion) {
                    case 1 ->
                        aparcar(coche);
                    case 2 ->
                        mostrarPlazasLibres(coche);
                    case 3 ->
                        mostrarDatos(coche);
                    case 4 ->
                        nombreTitulares(coche);

                    case 5 ->
                        buscarMatricula(coche);
                    case 6 ->
                        estadoPlazas(coche);
                    case 7 ->
                        System.out.println("====== Hasta Pronto =====");

                    default ->
                        System.out.println("Opcion no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion no valida o formato no valido elige entre el 1 y 6");
            }

        } while (opcion != 6);
    }

    //metodo que pide la opcion del menu 
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime ¿Que opcion quieres?");
        int opcion = entrada.nextInt();
        return opcion;
    }

    //metodo que pide matricula y titular del coche ademas de donde quiere aparcar si no esta disponible volvera al menu principal 
    //para poder darle a la opcion de mostrarPlazas para que pueda ver cuales estan libres
    public static void aparcar(Coches[] coche) {
        Scanner entrada = new Scanner(System.in);

        String matricula = pedirMatricula();
        String nomTitular = pedirTitular();

        System.out.println("dime un numero del 0 al 8 donde quiere aparcar");
        int posicion = entrada.nextInt();

        if (coche[posicion] == null) {
            System.out.println("el coche se aparcara en unos instantes");
            coche[posicion] = new Coches(matricula, nomTitular);

        } else {
            System.out.println("posicion no disponible");
        }
    }

    public static String pedirTitular() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Quien es el titular del vehiculo?");
        String opcion = entrada.next();
        return opcion;
    }

    //metodo que devuelve la posicion de las plazas libres
    public static void mostrarPlazasLibres(Coches[] coche) {
        for (int i = 0; i < coche.length; i++) {
            if (coche[i] == null) {
                System.out.println("el estacionamiento: " + i + "esta libre");
            }

        }

    }

    //Metodo que muestra todos los datos de los coches aparcados
    public static void mostrarDatos(Coches[] coche) {
        for (int i = 0; i < coche.length; i++) {
            if (coche[i] != null) {
                System.out.println("La plaza: " + i + " esta ocupada por: el coche:" + coche[i].getMatricula()
                        + " de: " + coche[i].getNomTitular());
            }

        }

    }

    //metodo que busca titulares que empiecen por x que el usuario le diga 
    public static void nombreTitulares(Coches[] coche) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el nombre el nombre titular");
        String nombre = entrada.next();

        for (int i = 0; i < coche.length; i++) {
            if (coche[i].getNomTitular().startsWith(nombre)) {
                System.out.println(coche[i].getNomTitular() + " # ");
            } else {
                System.out.println("Ningun nombre igual ni similar ");

            }

        }
    }
    //metodo para pedir matricula de la opcion 5

    public static String pedirMatricula() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime ¿Que matricula busca?");
        String opcion = entrada.next();
        return opcion;
    }

    //metodo que busca la matricula que el usuario le pide
    public static void buscarMatricula(Coches[] coche) {
        boolean encont = false;
        String matricula = pedirMatricula();
        int i = 0;
        while (encont != false) {
            if (coche[i].getMatricula().equalsIgnoreCase(matricula)) {
                encont = true;
                System.out.println("El coche con la matricula: " + coche[i].getMatricula() + " esta en la posicion: " + i);

            } else {
                encont = false;
                i++;
            }
            System.out.println("Matricula no encontrada");
        }

    }

    //metodo que muestra las plazas libres y ocupadas
    public static void estadoPlazas(Coches[] coche) {
        String[][] plazas = new String[3][3];

        for (int i = 0; i < plazas.length; i++) {
            for (int j = i + 1; j < plazas[0].length; j++) {
                String matricula = coche[i].getMatricula();
                String nomTitular = coche[i].getNomTitular();
                plazas[i][j] = matricula;
                plazas[i][j] = nomTitular;

                for (int k = 0; k < 9; k++) {

                    if (plazas[i][j] == null) {
                        plazas[i][j] = "L";

                    } else {
                        plazas[i][j] = "X";
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println(plazas[i][j]);

            }

        }
    }

}
