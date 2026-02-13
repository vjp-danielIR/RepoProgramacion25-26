/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9_ejercicio7;

/**
 *
 * @author alumno
 */
public class TEMA9_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra= "Ayer perdi el tapacubos por no mirar";
    
        invertirPalabra(palabra);
    }
    
    /**
     *
     * @param palabra
     *  metodo que invierte la frase
     */
    public static void invertirPalabra(String palabra){
        // Dividimos la frase en palabras usando split
        String[] palabras;
        palabras = palabra.split(" ");
        
        // Recorremos el array desde el final hasta el inicio
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");
        }
    
    
    }
}

