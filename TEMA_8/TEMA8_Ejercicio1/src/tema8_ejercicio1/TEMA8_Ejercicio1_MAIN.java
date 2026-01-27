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
        //creamos el array de objetos
        Asignaturas[] notas = new Asignaturas[6];
        //a cada posicion le damos una asignatura y su nota
        notas[0] = new Asignaturas("Programación", 0);
        notas[1] = new Asignaturas("Lenguajes de Marcas", 0);
        notas[2] = new Asignaturas("Bases de Datos", 0);
        notas[3] = new Asignaturas("Entornos de Desarrollo", 0);
        notas[4] = new Asignaturas("Sistemas Informáticos", 0);
        notas[5] = new Asignaturas("Formación y Orientación Laboral", 0);

    }
    //metodo para pedir la nota y ponerla establecida
    public static void pedirNota(Asignaturas[] notas) {
        Scanner entrada = new Scanner(System.in);
        for (Asignaturas nota : notas) {
            System.out.print("Por favor, introduzca la nota de " + nota.getNombre() + ": ");
            nota.setNota entrada.nextFloat();
        }

    }
    public static float notaMedia(Asignaturas[] notas){
    float suma = 0;

    for (int i = 0; i < notas.length; i++) {
        suma += notas[i].getNota();
    }

    return suma / notas.length;
}
    }
 
