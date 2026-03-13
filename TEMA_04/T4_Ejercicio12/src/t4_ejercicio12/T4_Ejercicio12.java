/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio12;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class T4_Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarResultado();
    }

    // Método para pedir la contraseña
    public static int pedirContra() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        int contra = entrada.nextInt();
          return contra;
    }

    // Método booleano que comprueba si es correcta
    public static boolean comprobarContraseña(int contra) {
       int contraseña = 258963;
        if ( contra != contraseña){
        return true;
        }else {
            return false;
        }
        
    }

    // Método que gestiona los intentos y muestra el resultado final
    public static void mostrarResultado() {
        int intentos = 0;
        boolean acceso = false;

        while (intentos < 3 && !acceso) {
            int contra = pedirContra();
            if (comprobarContraseña(contra)) {
                acceso = true;
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (3 - intentos));
            }
        }

        if (acceso) {
            System.out.println("🎉 ¡Enhorabuena! Acceso concedido.");
        } else {
            System.out.println("Acceso denegado has superado el número de intentos.");
        }
    }
}
