/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9_ejercicio3;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA9_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena de caracteres: ");
        String cadena = entrada.nextLine();

        char[] caracteres = cadena.toCharArray();

        for (char c : caracteres) {
            System.out.println(c);
        }
    }
}
