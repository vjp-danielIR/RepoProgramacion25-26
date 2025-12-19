/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ejercicio2;

/**
 *
 * @author alumno
 */
public class T5_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear dos cursos
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        // Establecer datos
        curso1.establecerNombreyHoras("Programación", 120);
        System.out.println("");
        curso2.establecerNombreyHoras("Bases de Datos", 90);

        // Mostrar información de los cursos
        System.out.println("Curso 1:");
        System.out.println("Nombre: " + curso1.obtenerNombre());
        System.out.println("");
        System.out.println("Horas: " + curso1.obtenerHoras());
        System.out.println("");
        System.out.println("Curso 2:");
        System.out.println("");
        System.out.println("Nombre: " + curso2.obtenerNombre());
        System.out.println("");
        System.out.println("Horas: " + curso2.obtenerHoras());

        // Mostrar número total de cursos creados
        System.out.println("Número total de cursos creados: " + Curso.verNumeroCursos());
    }
}
  