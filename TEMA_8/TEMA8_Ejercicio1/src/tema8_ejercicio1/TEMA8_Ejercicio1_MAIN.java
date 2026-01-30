/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema8_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */

public class TEMA8_Ejercicio1_MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       // Creamos las 6 asignaturas del ciclo DAW
        Asignaturas[] notas = new Asignaturas[6];
        
        notas[0] = new Asignaturas("Programacion", 0);
        notas[1] = new Asignaturas("Lenguajes de Marcas", 0);
        notas[2] = new Asignaturas("Bases de Datos", 0);
        notas[3] = new Asignaturas("Entornos de Desarrollo", 0);
        notas[4] = new Asignaturas("Sistemas Informaticos", 0);
        notas[5] = new Asignaturas("Formacion y Orientacion Laboral", 0);
        
        // Pedimos las notas al usuario
        pedirNotas(notas);
        
        // Calculamos y mostramos la nota media
        float media = calcularMedia(notas);
        System.out.println("\nTu nota media del curso es: " + media);
    }
    
    // Metodo para pedir las notas de cada asignatura
    public static void pedirNotas(Asignaturas[] notas) {
        Scanner entrada = new Scanner(System.in);
        
      for (Asignaturas asignatura : notas) {
        System.out.print("Introduzca la nota de " + asignatura.getNombre() + ": ");
        asignatura.setNota(entrada.nextFloat());
    }

    }
    
    // Metodo que calcula la nota media del curso
    public static float calcularMedia(Asignaturas[] notas) {
        float suma = 0;
        
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i].getNota();
        }
        
        return suma / notas.length;
    }
}

