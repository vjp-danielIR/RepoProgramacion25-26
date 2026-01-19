/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio16;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio16 {

    /**
     * @param args the command line arguments
  
     * Sabiendo que tenemos una clase de 6 alumnos (Pepe, Juan, Ana,
       Marta, Pedro y María), con 4 asignaturas cada uno (Lengua, Mates, Historia y
       Física), realiza un programa que le dé al usuario las siguientes opciones:
      1. Rellenar las notas de los alumnos.
      2. Mostrar las notas introducidas en el punto anterior.
      3. Que nos diga que alumno es el mejor de la clase. (nota media más alta) . (Necesitarás
        utilizar otro array unidimensional con los nombres de los alumos)
      4. Que nos diga el alumno con más suspensos.
      5. Que nos diga cual es la asignatura más difícil. (nota media más baja) . (Necesitarás utilizar
        otro array unidimensional con los nombres de las asignaturas)
      6. Salir del programa.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       String[] alumnos={"Pepe","Juan","Ana","Marta","Pedro","Maria"};
        String[] asignatura={"Lengua","Mates","Historia","Fisica"};
        int[][] notas= new int[6][4];
        int opcion=0;
        
         do {
            System.out.println("----MENU----");
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar las notas introducidas en el punto anterior.");
            System.out.println("3.  Que nos diga que alumno es el mejor de la clase. (nota media más alta) . (Necesitarás\n" +
"utilizar otro array unidimensional con los nombres de los alumos)");
            System.out.println("4. Que nos diga el alumno con más suspensos.");
            System.out.println("5. Que nos diga cual es la asignatura más difícil. (nota media más baja) . (Necesitarás utilizar\n" +
"otro array unidimensional con los nombres de las asignaturas)");
             System.out.println("6. Salir del programa");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    // Rellenar las notas de los alumnos
                    for(int i=0; i<alumnos.length; i++){
                        for(int j=0; j<asignatura.length;j++){
                        System.out.println("la nota de " + asignatura[j] + " de " + alumnos[i] + " es de:" );
                        notas[i][j]= entrada.nextInt();
                    }}
                    break;

                    
                case 2:
                    // Mostrar las notas introducidas en el punto anterior.
                   
                  break;
      
                case 3:
                    // Temperatura media del mes
                
                    break;

                case 4:
                    // Día o días más calurosos
                   
                    break;

                    
                case 5:
                    System.out.println("Saliendo del programa...");
                    
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 5);

    }
    
}
