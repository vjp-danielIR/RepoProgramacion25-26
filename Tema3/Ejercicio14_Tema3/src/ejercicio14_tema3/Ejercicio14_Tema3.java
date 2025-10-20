/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14_tema3;

/**
 *  mostrar  100 numeros pares
 * @author Daniel Iglesias 
 */
public class Ejercicio14_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //usarmos esta variable para ir sumando
           int numero = 2; 
       
           // Contador de pares
           int contador = 1;

           // Comprobar si el contador ya lleva los 100 numeros pares
           while (contador <= 100) {
              System.out.println(numero);

            // Pasamos al siguiente número par numero +=2 es que sume 2 
            numero +=2;
            contador++;
        }
    }
}
