/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio5;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class TEMA12_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;

        do {
            try {
                System.out.println("\n=== MENU AGENDA ===");
                System.out.println("1. Anadir contacto");
                System.out.println("2. Mostrar agenda");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                
                opcion = pedirInt("Que opcion desea?");
                
                switch (opcion) {
                    case 1 ->
                    {
                        try {
                            anadirContacto();
                        } catch (IOException ex) {
                            Logger.getLogger(TEMA12_Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    case 2 ->
                        mostrarAgenda();
                    case 3 ->
                        System.out.println("Hasta pronto");
                    default ->
                        System.out.println("Opcion no valida");
                }
            } catch (IOException ex) {
                Logger.getLogger(TEMA12_Ejercicio5.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (opcion != 3);

    }

    // Metodo para pedir Strring
    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        return entrada.next();
    }

    // Metodo para pedir int
    public static int pedirInt(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = entrada.nextInt();
        return valor;
    }

    //metodo para pedir datos de contacto
    public static void anadirContacto() throws IOException {
        String nombre = pedirString("Nombre del contacto: ");
        int edad = pedirInt("Edad del contacto: ");
        String telefono = pedirString("Numero de telefono del contacto: ");

        if (edad <= 0) {
            System.out.println("la edad no puede ser menor que 0");
        }

        try (
                FileWriter fw = new FileWriter("agenda.txt")
                ) 
        {
            fw.write(nombre + " - " + edad + " años - " + telefono);
        }

        System.out.println("Contacto anadido correctamente");
    }

    //meotdo para mostrar todos los datos de la agenda
    public static void mostrarAgenda() throws IOException {
        File archivo = new File("agenda.txt");
        if (!archivo.exists()) {
            System.out.println("La agenda aun esta vacia");

        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("lista de la agenda: ");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }
}
