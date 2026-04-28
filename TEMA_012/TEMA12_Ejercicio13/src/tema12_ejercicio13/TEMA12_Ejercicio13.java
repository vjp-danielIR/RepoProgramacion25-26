/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio13;

import java.util.*;
import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio13 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Becario> lista = new ArrayList<>();

        pedirBecarios(lista);

        guardarEnFichero(lista);

        System.out.println("Datos guardados correctamente en DatosBeca.txt");
    }
    
    
    //pedir datos del becario
    public static void pedirBecarios(List<Becario> lista) {

        String seguir;

        do {
            Becario b = crearBecario();
            lista.add(b);

            seguir = pedirString("¿Desea seguir metiendo más personas? (s/n)");

        } while (seguir.equalsIgnoreCase("s"));
    }

   //crear becario
    public static Becario crearBecario() {

        String nombre = pedirString("Nombre y apellido:");
        String sexo = pedirString("Sexo (H/M):");
        int edad = pedirInt("Edad (20-60):");
        int suspensos = pedirInt("Número de suspensos (0-4):");
        String residencia = pedirString("Residencia familiar (si/no):");
        double ingresos = pedirDouble("Ingresos anuales:");

        return new Becario(nombre, sexo, edad, suspensos, residencia, ingresos);
    }

   //guardar ene l fichero
    public static void guardarEnFichero(List<Becario> lista) {

        try {
            FileWriter fw = new FileWriter("DatosBeca.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            for (Becario b : lista) {
                pw.println(b);
            }

            pw.close();

        } catch (IOException e) {
            System.out.println("Error al escribir el fichero");
        }
    }

    //pedir datos
    public static String pedirString(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }

    
    public static int pedirInt(String mensaje) {
        System.out.println(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    
    public static double pedirDouble(String mensaje) {
        System.out.println(mensaje);
        return Double.parseDouble(sc.nextLine());
    }
}
