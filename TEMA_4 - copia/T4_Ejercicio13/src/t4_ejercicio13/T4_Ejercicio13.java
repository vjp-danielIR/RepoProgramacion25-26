/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio13;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class T4_Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero = pedirNumero(); //llamo al metodo para pedir por pantalla y lo guardo en numero
            mostrarNumeros(numero);     //llamo a otro metodo para darle todos los numeros de entre el 2 hasta el que me dio
    }

    // Método para pedir el número al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);//pedir por pantalla
        int num;//guardo en num
        do { //bucle por si acaso me da 1 o en negativo
            System.out.print("Dame un numero "); //mostrar por pantalla
            num = entrada.nextInt(); //lo guardo
            if (!mayorQue(num)) { //comparo llamando al metodo mayorQue para la comparacion 
                System.out.println("el número debe ser mayor que 1."); //si el numero es negativo o 1 le saldra esto
            }
        } while (!mayorQue(num));
        return num;// en caso de todo correcto devuelvo el numero
    }

    // Método booleano para comprobar que el número es mayor que 1
    public static boolean mayorQue(int num) {
        return num > 1; //comparaicon si el numero entregado es mayor que 1
    }

    // Método para mostrar los números entre 1 y x
    public static void mostrarNumeros(int num) {
        System.out.println("Números entre 1 y " + num + ":");//muestro que se van a mostrar los numeros desde 1 a x
        for (int i = 1; i <= num; i++) { //hago un bucle para pasar por todos los numeros
            System.out.print(i + " "); //y los voy imprimiendo
        }
    }
}