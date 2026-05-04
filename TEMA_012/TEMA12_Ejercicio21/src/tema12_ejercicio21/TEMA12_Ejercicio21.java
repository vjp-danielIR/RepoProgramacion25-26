/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio21;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Asignatura> lista = new ArrayList<>(); //lista de array de la clase asignaturas
        String[] nombresAsignaturas = { //nombre de las asignaturas
            "Programación",
            "Bases de Datos",
            "Sistemas Informáticos",
            "Entornos de Desarrollo",
            "Lenguajes de Marcas",
            "Formación y Orientación Laboral"
        };
        //constrol de excepciones
        try {
            crearAsignaturas(lista, nombresAsignaturas);
        } catch (InputMismatchException e) {
            System.out.println("valor no apto");
        }
        try {
            guardarEnFichero(lista);
        } catch (IOException ex) {
            Logger.getLogger(TEMA12_Ejercicio21.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            calcularMedia(lista);
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(TEMA12_Ejercicio21.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //metodo que crea una asignatura y la mete en el arryList
    public static void crearAsignaturas(List<Asignatura> lista, String[] nombreAsignaturas) {

        boolean terminado = false;
        do {

            for (String nombreAsignatura : nombreAsignaturas) {
                double nota = pedirDouble("Dime la nota de: " + nombreAsignatura);
                //comprobacion de que la nota sea entre 0 y 10
                if (nota > 10) {
                    System.out.println("la nota solo puede ser entre 0 y 10");
                } else if (nota < 0) {
                    System.out.println("la nota no puede ser negativa");
                } else {
                    lista.add(new Asignatura(nombreAsignatura, nota));
                    terminado = true;
                }
            }

        } while (!terminado);
    }

    //metodo que guarda los obojetos en un archivo 
    public static void guardarEnFichero(List<Asignatura> lista) throws FileNotFoundException, IOException {

        try (
                FileOutputStream fos = new FileOutputStream("asignaturas.ob"); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(lista);

        }
    }

    //metodo que lee el documento asignaturas.od y hace la media en base a las notas
    public static void calcularMedia(List<Asignatura> lista) throws FileNotFoundException, IOException, ClassNotFoundException {

        System.out.println("");
        System.out.println("Leyendo fichero");
        try (
                FileInputStream fis = new FileInputStream("asignaturas.ob"); ObjectInputStream ois = new ObjectInputStream(fis)) {

            double suma = 0;

            for (Asignatura a : lista) {
                suma += a.getNota();
            }

            double media = suma / lista.size();

            System.out.println("Media leída desde fichero: " + media);

        } catch (EOFException e) {
            System.out.println("Fin de lectura.");
        }
    }

    //metodos para pedir datos al usuario
    public static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.next();

    }

    public static double pedirDouble(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextDouble();
    }

}
