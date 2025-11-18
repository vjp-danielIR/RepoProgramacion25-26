/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio2;

/**
 *
 * @author alumno
 */
public class Curso {

    // Atributos privados
    private String nombre;
    private int numeroHoras;

    // Atributo estático para contar cursos creados
    private static int numeroDeCursos = 0;

    // Constructor vacío
    public Curso() {
        this.nombre="";
        this.numeroHoras=0;
        numeroDeCursos++;  
    }

    // Constructor con parámetros
    public Curso(String nombre, int numeroHoras) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        numeroDeCursos++;
    }

    // ----- GETTERS Y SETTERS -----
    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerHoras() {
        return numeroHoras;
    }

    public void establecerHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    // Método para establecer ambos a la vez
    public void establecerNombreyHoras(String nombre, int numeroHoras) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
    }

    // ----- MÉTODOS ESTÁTICOS -----
    public static void sumarCursos() {
        numeroDeCursos++;
    }

    public static int verNumeroCursos() {
        return numeroDeCursos;
    }
}