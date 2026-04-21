/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio12;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio12 {
//creamos las constantes que seran los archivos
    public final static String PARES = "pares.txt";
    public final static String IMPARES = "impares.txt";
    public final static String RESULTADOS = "resultados.txt";

    public static void main(String[] args) {
        //control de excepciones
        try {
            System.out.println("- SUMANDO FICHEROS -");
            sumarFicheros();
            System.out.println(" Archivos  creado correctamente.");
        } catch (NumberFormatException e) {
            System.out.println("valor de linea no valido");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro archivo");
        } catch (IOException ex) {
            Logger.getLogger(TEMA12_Ejercicio12.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    
     //metodo para sumar los pares y impares de una linea 
     
    public static void sumarFicheros() throws IOException {

        try (
                //creamos para el salto de linea de los 2 archivos y el de para poder modificar el archivo resultado.txt
                BufferedReader brPares = new BufferedReader(new FileReader(PARES)); 
                BufferedReader brImpares = new BufferedReader(new FileReader(IMPARES)); 
                PrintWriter pwResult = new PrintWriter(new FileWriter(RESULTADOS))
                ) {
            //creamos lo que va a leer la linea
            String lineaPar = brPares.readLine();
            String lineaImpar = brImpares.readLine();

        
            //mientras ninguna de las lineas sea null seguira en el bucle
            while (lineaPar != null && lineaImpar != null) {
                //convertimos el tipo string de la linea a un int 
                int numPar = Integer.parseInt(lineaPar);
                int numImpar = Integer.parseInt(lineaImpar);
                int suma = numPar + numImpar; //y lo sumamos
                //y lo escribimos en el archivo de resultado
                pwResult.println(suma);
                System.out.println( numPar + " + " + numImpar + " = " + suma);

                //siguiente linea 
                lineaPar = brPares.readLine();
                lineaImpar = brImpares.readLine();
               
            }

            
        }
    }
}
