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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Becario> lista = new ArrayList<>();

        try {
            FileWriter fw = new FileWriter("DatosBeca.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pedirBecarios(lista, pw);

        } catch (IOException ex) {
            Logger.getLogger(TEMA12_Ejercicio13.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // metodo principal de entrada de datos
    public static void pedirBecarios(List<Becario> lista, PrintWriter pw) {

        while (pedirSeguir().equalsIgnoreCase("s")) {

            Becario b = crearBecario();

            lista.add(b);
            pw.println(b);
        }
    }

    // crea un objeto becario
    public static Becario crearBecario() {

        String nombre = pedirString("nombre y apellido: ");
        String sexo = pedirString("sexo h/m: ");
        int edad = Integer.parseInt(pedirString("edad: "));
        int suspensos = Integer.parseInt(pedirString("numero de suspensos: "));
        String residencia = pedirString("residencia familiar si/no: ");
        double ingresos = Double.parseDouble(pedirString("ingresos anuales: "));

        return new Becario(nombre, sexo, edad, suspensos, residencia, ingresos);
    }

    // pedir texto
    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextLine();
    }

    // preguntar si continuar
    public static String pedirSeguir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("desea seguir metiendo mas personas? s/n");
        return entrada.nextLine();
    }
}
