/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8_tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio8_tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos por pantalla y lo guardamos en cantidad
         Scanner entrada = new Scanner(System.in);
          System.out.print("Por favor, indique una cantidad de dinero: ");
        int cantidad = entrada.nextInt();
        //hacemos otra variable para guardar el resto de las divisiones
         int resto = cantidad;
            //primera division
        int billetes50 = resto / 50;
        resto %= 50;
            //segunda division y volvemos a guardar en resto
        int billetes20 = resto / 20;
        resto %= 20;
            //otercera division
        int billetes10 = resto / 10;
        resto %= 10;
            //cuarta division
        int billetes5 = resto / 5;
        resto %= 5;
            //quinta division 
        int monedas2 = resto / 2;
        resto %= 2;
            //pues ya lo que quede 
        int monedas1 = resto;

        System.out.println("\n" + cantidad + " euros se descomponen en:");

        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        } else if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        } else if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        } else if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        } else if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        } else if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
    }
    
}
