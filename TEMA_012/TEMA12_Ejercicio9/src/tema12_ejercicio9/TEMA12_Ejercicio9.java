/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema12_ejercicio9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Daniel_Iglesias
 */
public class TEMA12_Ejercicio9 {

    /**
     */
    public final static String saludo = "saludo.txt";

    public static void main(String[] args) throws FileNotFoundException, IOException{

        String saludoReves = "saludoReves.txt";

        FileReader fr = new FileReader(saludo);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(saludoReves);
        PrintWriter pw = new PrintWriter(fw);

        String linea;

        while ((linea = br.readLine()) != null) {

            String reversa = "";

            for (int i = linea.length() - 1; i >= 0; i--) {
                reversa += linea.charAt(i);
            }

            pw.println(reversa);
        }
    }}