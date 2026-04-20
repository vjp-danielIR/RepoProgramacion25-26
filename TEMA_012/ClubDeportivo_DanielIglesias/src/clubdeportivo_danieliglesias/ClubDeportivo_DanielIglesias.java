/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubdeportivo_danieliglesias;

import java.util.*;

/**
 *
 * @author Daniel_Iglesias
 */
public class ClubDeportivo_DanielIglesias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Set<Equipos> equipo = new HashSet<>();
        List<Deportes> deporte = new ArrayList<>();

        int opcion = 0;
        do {
            System.out.println("===========MENU DE CLUB DEPORTIVO ===========");
            System.out.println("---------------------------------------------");
            System.out.println("1. Añadir Deporte");
            System.out.println("----------------------------------------------");
            System.out.println("2. Mostrar Deportes y Equipos");
            System.out.println("----------------------------------------------");
            System.out.println("3. Buscar Equipo en Deportes");
            System.out.println("------------------------------------------------");
            System.out.println("4. Mostrar Mapas de Equipos");
            System.out.println("----------------------------------------------");
            System.out.println("5. Mostrar todos los equipos de todos los deportes de mayor a menor trofeos");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("6. Salir del programa...");
            try {

                opcion = pedirInt("¿Que opcion desea?");
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido eliga entre el 1 y 5");
            }

            switch (opcion) {
                case 1 ->
                    añadirDeporte(deporte, equipo);
                case 2 ->
                    mostrarDeportesEquipos(deporte, equipo);
                case 3 ->
                    buscarEquipoDeporte(deporte, equipo);
                case 4 ->
                    mostrarEquipos(equipo, deporte);
                case 5 ->
                    mostrarMayorMenor(equipo, deporte);
                case 6 ->
                    System.out.println("Hasta pronto....");

            }

        } while (opcion != 6);
    }

    //metodo para añadir un deporte y un equipo con codigo nombre y numero de trofeos
    public static void añadirDeporte(List<Deportes> deporte, Set<Equipos> equipo) {

        String nombreDeporte = pedirString("¿Como se llama el deporte a introducir?");

        System.out.println("");

        String nombreEquipo = pedirString("¿Como se llama el equipo a introducir?");

        System.out.println("");

        int codigoEquipo = pedirInt("¿Cual es el codigo del equipo?");

        System.out.println("");

        int trofeos = pedirInt("Numero de trofeos del equipo?");

        System.out.println("");

        Deportes nuevo = new Deportes();
        Equipos nue = new Equipos();

        nuevo.setNombre(nombreDeporte);
        deporte.add(nuevo);

        nue.setCodigoEquipo(codigoEquipo);
        nue.setNombre(nombreEquipo);
        nue.setNumeroTrofeos(trofeos);
    }

    //metodo para buscar un equipo por nombre 
    public static void buscarEquipoDeporte(List<Deportes> deporte, Set<Equipos> equipo) {

        boolean encontrado = false;
        Iterator<Deportes> it = deporte.iterator();
        for (Equipos e : equipo) {
            e.getNombre();
        }

        String nombreBu = pedirString("Dime el nombre del equipo que buscas: ");
        while (!encontrado) {
            for (Equipos e : equipo) {

                if (nombreBu.equalsIgnoreCase(e.getNombre())) {
                    System.out.println(it);
                    System.out.println(e);
                }
            }
            it.hasNext();

        }
        if (encontrado) {
            System.out.println("equipo no encontrado");
        }
    }
//metodo para mostrar todos los deportes y equipos

    public static void mostrarEquipos(Set<Equipos> equipo, List<Deportes> deporte) {
        for (Deportes d : deporte) {
            System.out.println(d);

        }
        for (Equipos e : equipo) {
            System.out.println(e);
        }

    }
//metodo para meter en un mapa los equipos que tengan mas de 3 trofeos

    public static void mostrarDeportesEquipos(List<Deportes> deporte, Set<Equipos> equipo) {
        Map<Integer, String> mapa = new HashMap<>();
        for (Equipos e : equipo) {

            if (e.getNumeroTrofeos() > 3) {
                mapa.put(e.getCodigoEquipo(), e.getNombre());
            }

        }

        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

    //no se escribirlo no me acuerdo de como se escribe en el ocmpare to
    public static void mostrarMayorMenor(Set<Equipos> equipo, List<Deportes> deporte) {

    }

    //metodos para pedir datos tipo texto y numero 
    private static int pedirInt(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextInt();
    }

    private static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.next();
    }

}
