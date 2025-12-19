/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio11;
import java.util.Scanner;
/**
 *
 * @author Daniel Iglesias
 */
public class T4_Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero = pedirNumero();//pido numero mediante un metodo
        double raiz = calcularRaiz(numero);//calculo la raiz en otro metodo
        Resultado(numero, raiz);
    }

    // Método para pedir el número al usuario
    public static double pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        double numero;
        do {//hago un bucle en el que pida el numero y lo comparo para saber si es negativo si el numero es 
            //menor que 0 se mostrara el mensaje
            System.out.print("Introduce un número: ");
            numero = entrada.nextDouble();
            if (numero < 0) {
                System.out.println("el número no puede ser negativo.");
            }
        } while (numero < 0);
        //si no lo es devolvera el numero
        return numero;
    }

    // Método para calcular la raíz cuadrada
    public static double calcularRaiz(double numero) {//calculo la raiz
        return Math.sqrt(numero);
    }

    // Método para mostrar el resultado
    public static void Resultado(double numero, double raiz) {//imprimo por pantalla la raiz del numero
        System.out.println("La raíz cuadrada de " + numero + " es " + raiz);
    }
}