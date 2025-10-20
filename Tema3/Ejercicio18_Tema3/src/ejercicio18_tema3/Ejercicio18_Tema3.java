/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18_tema3;
import java.util.Scanner;
/**
 * 3 Intentos para una contraseña 
 * @author Daniel Iglesias
 */
public class Ejercicio18_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int contraseñaCorrecta = 1234; // contraseña 
        int contraseña;
        int intentos = 0;

        do {
            //pido por pantalla la contraseña
            System.out.print("Introduce la contraseña: ");
            contraseña = entrada.nextInt();
            //sumo cada vez que lo intenta
            intentos++;
            
            // comparo contraseñas
            if (contraseña == contraseñaCorrecta) { 
                System.out.println("Contraseña correcta");
                 }
            //si supera las 3 veces salta error 
        } while (intentos < 3);
            //si la contraseña entregada es diferente a la contraseña correcta le salta error a los 3 intentos
        if (contraseña != contraseñaCorrecta) {
            System.out.println("Has superado los 3 intentos");
        } 
    }
    
}