/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23_t3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio23_T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        // Pedimos el número hasta que sea mayor que 1
        do {
            System.out.println("Dime un numero");
            num = entrada.nextInt();

            if (num <= 1) {
                System.out.println("Error tiene que ser mayorr que 1");
            }
        } while (num <= 1);

        // Imprimimos todos los números entre 1 y el número introducido
        System.out.println("Números entre 1 y " + num);
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}