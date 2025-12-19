/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30_t3;
import java.util.Scanner;
import  java.util.InputMismatchException;
/**
 * ejercicicio 30 
 * @author Daniel Iglesias
 */
public class Ejercicio30_T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = (int) (Math.random() * 100 + 1);
        int intentos = 140, numIntentos = 0;

        do {
            try {
                System.out.println("Acierta el numero entre el 1 y el 100: ");
                intentos = entrada.nextInt();
                numIntentos++;

                if (intentos != num) {
                    if (intentos < num) {
                        System.out.println("El número a adivinar es mayor.");
                    } else if (intentos > num) {
                        System.out.println("El número a adivinar es menor.");
                    }
                } else {
                    System.out.println("ENHORABUENA HAS ACERTADO");
                }

            } catch (InputMismatchException e) {
                System.out.println("VALOR NO VALIDO");
                entrada.nextLine(); 
                numIntentos++;
            }

        } while (intentos != num);
 if(intentos==num){
           System.out.println("ENORABUENA HAS ACERTADO");
       }
    
    }
}
     