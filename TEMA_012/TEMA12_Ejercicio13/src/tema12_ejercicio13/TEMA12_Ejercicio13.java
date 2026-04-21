/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio13;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        try {

            String nombre = pedirString("Nombre y apellido: ");
            String sexo = pedirString("Que genro eres H/M ");
            String edad = pedirString("Edad: ");
            String suspensos = pedirString("Numero de suspensos");
            String residencia = pedirString("Residencia familiar si/no");
            String ingresos = pedirString("Ingresos anuales");

          
            
            FileWriter fw = new FileWriter("DatosBeca.txt", true);

            PrintWriter pw = new PrintWriter(fw);

            pw.println(nombre + " - " + sexo + " - " + edad + " años - " + suspensos + " suspensos - Residencia: " + residencia + " - Ingresos: " + ingresos);

        } catch (IOException ex) {
            Logger.getLogger(TEMA12_Ejercicio13.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.next();

    }

}
