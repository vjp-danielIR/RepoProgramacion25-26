/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio23_intermedio;
import java.util.Scanner;//importamos la clase necesaria
/**
 *
 * @author alumno
 */
public class T1234Ejercicio23_Intermedio {

    
    /**
     * @param args the command line arguments
     * 
     *  Pide un número mayor que 1; después imprime todos los números primos hasta ese límite.
     */
    public static void main(String[] args) {
        //scanner
           Scanner entrada = new Scanner(System.in);
           //variable
           int limite;
           boolean esPrimo;

        // Pedir un numero mayor que 1
        do {
            System.out.print("Introduce un numero: ");
            limite = entrada.nextInt();
        } while (limite <= 1);
        
        System.out.println("Numeros primos hasta " + limite + ":"); //voy mostrando cuales son los numeros primos 
        
        // Recorrer todos los números desde 2 hasta el límite
        for (int i = 2; i <= limite; i++) { //si i es menor o igual a numero del usuario se suma y sera primo
             esPrimo = true;  

            // Comprobar si i es primo con otra letra por que esta dentro de otro bucle que ya usa la i
            for (int b = 2; b <= Math.sqrt(i); b++) { //sqrt es para ver la raiz cuadrada de x numero
                if (i % b == 0) { //si i y b es igual a 0 no son primos
                    esPrimo = false;
                   
                }
            }

            if (esPrimo == true) {
                System.out.print("-"+i+"-");
            }
        }
    }
}
