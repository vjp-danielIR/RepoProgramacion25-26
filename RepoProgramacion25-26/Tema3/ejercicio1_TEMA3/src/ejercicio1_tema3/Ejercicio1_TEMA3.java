/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_tema3;
// importamos la clase scanner para preguntar al usuairo
    import java.util.Scanner;
/**
 * COMPROBAR SI EL NUMERO ES POSITIVO O NO
 * @author Daniel Iglesias
 */
public class Ejercicio1_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos por pantalla y guardamos la variable en "entrada"
        Scanner entrada = new Scanner (System.in);
        System.out.println("Dime un numero superior o inferior a 0");
       int numero = entrada.nextInt();
       //si la variable numero es menor o igual a 0 positivo else (si  no) el numero es negativo
    if (numero >= 0) {
    System.out.println("Tu número: " + numero + " es positivo");
    } else {
    System.out.println("Tu número: " + numero + " es negativo");
    }
    }
    }
    