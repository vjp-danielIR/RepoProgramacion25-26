/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio4_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Ahora, introduzca un segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Por último, introduzca un tercer número: ");
        int num3 = entrada.nextInt();

        int mayor;

        // Determinar el mayor de los tres números
        if (num1 <= num2 && num1 <= num3) {
            mayor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El número mayor de los introducidos es el " + mayor);
    }
}