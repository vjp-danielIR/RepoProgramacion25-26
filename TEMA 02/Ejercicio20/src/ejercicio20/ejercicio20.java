/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;
        int suma;

        System.out.print("\t Escriba el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.print("\t Escriba el segundo entero: ");
        numero2 = entrada.nextFloat();

        suma = (int)(numero1 + numero2);

        System.out.println("La suma es: " + suma);
    }
}
