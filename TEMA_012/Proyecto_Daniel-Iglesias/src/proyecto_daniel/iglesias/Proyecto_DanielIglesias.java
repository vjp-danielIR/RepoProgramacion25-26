/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_daniel.iglesias;

import java.io.*;

/**
 *
 * @author Daniel_Iglesias
 */
public class Proyecto_DanielIglesias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String datosEmpleados = "datos_empleados.txt";
            String sospechosos = "sospechosos_zona_cero.txt";
            String claves = "04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt";

            escribirFichero(datosEmpleados, sospechosos);

            leerFichero(claves);

        } catch (IOException io) {
            System.out.println("error");
        }
    }

    public static void escribirFichero(String datosEmpleados, String sospechosos) throws IOException {
        System.out.println("- ESCRIBIENDO FICHERO -");

        FileReader fr = new FileReader(datosEmpleados);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(sospechosos);
        PrintWriter pw = new PrintWriter(fw);

        String linea;

        while ((linea = br.readLine()) != null) {
            if (linea.contains("Zona Cero")) {
                pw.println(linea);
            }
        }

        mostrarNumeroSospechosos(sospechosos);
    }

    public static void leerFichero(String claves) throws IOException {
        System.out.println("- LEYENDO FICHERO -");
        int contador = 0;

        try (
                FileReader fr = new FileReader(claves); BufferedReader br = new BufferedReader(fr)) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (contador == 8) {
                    System.out.println(linea);
                } else {

                }
            }
        }
    }

    public static void mostrarNumeroSospechosos(String sospechosos) throws FileNotFoundException, IOException {
        String linea;
        FileReader fr = new FileReader(sospechosos);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(sospechosos);
        while ((linea = br.readLine()) != null) {
            if (linea.contains("Telefono")) {
                System.out.println(linea);
            }
        }
    }
}
