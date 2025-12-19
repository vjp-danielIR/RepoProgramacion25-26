/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio21_medio;
import java.util.Scanner;
import java.util.InputMismatchException; //importamos los paquetes necesarios
/**
 *
 * @author alumno
 */
public class T1234Ejercicio21_Medio {

    /**
     * @param args the command line arguments
     * 
     *  Crea un menú completo (do-while + try-catch + switch-case) que muestre:
     * opcion 1
     * opcion 2
     * salir
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int opcion= 0;
      
         do {
            System.out.println("====== MENU ======");
            System.out.println("1. Opcion 1");
             System.out.println("____________");
            System.out.println("2. Opcion 2");
             System.out.println("____________");
            System.out.println("3. Salir");
            System.out.println("___________________");
             System.out.println("");
            System.out.print("Dime una opcion: ");

            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Elegiste la primera opcion");
                        break;
                    case 2:
                        System.out.println("Elegiste la segunda opcion");
                        break;
                    case 3:
                        System.out.println("Elegiste salir del programa");
                        break;
                    default:
                        System.out.println("Opcion no valida. Intenta de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Valor introducido no valido solo se pueden ingresar numeros");
                entrada.nextLine(); // Limpiar buffer
            }
        } while (opcion != 3);
    }

    }
