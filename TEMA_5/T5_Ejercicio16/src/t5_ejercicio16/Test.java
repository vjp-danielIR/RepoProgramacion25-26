/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio16;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Test {
       public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        // Crear 3 alumnos y se lo pasamos al metodo crearAlumno
        Alumno alumno1 = crearAlumno(entrada);
        Alumno alumno2 = crearAlumno(entrada);
        Alumno alumno3 = crearAlumno(entrada);
        
        // Mostrar información de los 3 alumnos
        System.out.println(" RESULTADOS ");
        alumno1.toString();
        alumno2.toString();
        alumno3.toString();  
    }
    
    // Método para crear un alumno, 
    public static Alumno crearAlumno(Scanner entrada) {
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Introduce la nota (0-10): ");
        int nota = entrada.nextInt(); //aqui guardamos la nota
        entrada.nextLine(); // Limpiar buffer
        
        // Comprobar la nota
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10");
            System.out.print("Introduce la nota (0-10): ");
            nota = entrada.nextInt();
            entrada.nextLine();
        }
        
        System.out.println();
        return new Alumno(nombre, nota);
    }
}
