/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16_tema3;

/**
 * numeros impares entre el 20 y el 160
 * @author Daniel Iglesias
 */
public class Ejercicio16_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Contador de números impares
        int contador = 0; 
        
        System.out.print("Los números impares existentes entre el número 20 y el 160 son: ");
        
        // Bucle desde 21 hasta 159 (los impares en ese rango)
        for (int i = 21; i < 160; i += 2) {
            System.out.println(i);
            
            // Comprobar si i es mayor que 160
            if (i < 160) {
                System.out.print("Los números impares existentes entre el número 20 y el 160 son: ");
            }
            
            //Contamos los números impares
            contador++; 
        }
        // Salto de línea y cantidad total
        System.out.println("La cantidad de números impares impresos han sido: " + contador);
    }
}