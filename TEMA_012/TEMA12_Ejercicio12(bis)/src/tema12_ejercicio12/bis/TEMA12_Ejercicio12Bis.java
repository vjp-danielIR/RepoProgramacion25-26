/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio12.bis;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio12Bis {

    public final static String numeros = "masnumeros.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sumarFichero();
    }

    //metodo que suma 
    public static void sumarFichero() {
        //variables del metodo
        int sumaTotal = 0;
        int numLinea = 1;

        try (//creamos el archivo y para poder leerlo y escribir sobre el 
                FileReader fr = new FileReader(numeros); BufferedReader br = new BufferedReader(fr); FileWriter fw = new FileWriter(numeros); PrintWriter pw = new PrintWriter(fw);) {
            //leer la linea
            String linea = br.readLine();
            {

//mientras no sea nula la linea sigue el bucle
                while (linea != null) {

                    int sumaLinea = 0;
                    
                    for (int i = 0; i < numeros.length(); i++) {

                        if (numeros.isEmpty()) {
                            System.out.println("no hay lineas");
                        } else {
                            //convertimos la linea del tipo String a un int
                            int numero = Integer.parseInt(numeros);
                            sumaLinea += numero; //voy dumsnfo drhun lsd linas que haya

                            linea = br.readLine();
                        }
                    }
                    System.out.println("la suma total de las lineas es: " + sumaLinea);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(TEMA12_Ejercicio12Bis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
