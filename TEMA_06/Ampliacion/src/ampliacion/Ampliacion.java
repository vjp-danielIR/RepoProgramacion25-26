/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ampliacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ampliacion {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("===== MENÚ =====");
                System.out.println("1. Registro");
                System.out.println("2. Donar Dinero");
                System.out.println("3. Donar Productos");
                System.out.println("4. Salir");
                System.out.print("Elige una opción: ");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 -> pedirEmail();
                    case 2 -> ;
                    case 3 -> ;
                    case 4 -> ;
                    default -> System.out.println("Opción no válida. Elige entre 1 y 4.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Valor no valido introduce un numeor del 1 al 4");
                entrada.next(); // limpiar entrada incorrecta
            }

        } while (opcion != 4);
    }
    
    public static void pedirEmail(){
        String correcto = "dir@vjp.es";
        int contraseña = 741852;
        int intentos=0;
      
        System.out.println("-----Bienbenido al Registro------");
     
        do{
        Scanner email = new Scanner(System.in);
        System.out.println("");
      
        System.out.println("Dime tu email:");
        correcto = email.nextLine();
       intentos++;
        while(intentos>5) 
            }}
        }
}