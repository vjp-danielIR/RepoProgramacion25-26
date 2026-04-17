/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10_ejercicio14;

import java.util.Arrays;

/**
 *
 * @author danie
 */
public class Alumno {
    private String nombreAlumno;
    private Asignatura[] asignaturas; // Array de 3 posiciones

    // Constructor por defecto
    public Alumno() {
        this.nombreAlumno = "";
        this.asignaturas = new Asignatura[3];
    }

    // Constructor parametrizado
    public Alumno(String nombreAlumno, Asignatura[] asignaturas) {
        this.nombreAlumno = nombreAlumno;
        this.asignaturas = asignaturas;
    }

    // Getters y Setters
    public String getNombreAlumno() { return nombreAlumno; }
    public void setNombreAlumno(String nombreAlumno) { this.nombreAlumno = nombreAlumno; }

    public Asignatura[] getAsignaturas() { return asignaturas; }
    public void setAsignaturas(Asignatura[] asignaturas) { this.asignaturas = asignaturas; }

    // Método para calcular media (auxiliar para la opción 3)
    public float obtenerMedia() {
        float suma = 0;
        for (Asignatura a : asignaturas) {
            suma += a.getNotaAsignatura();
        }
        return suma / asignaturas.length;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombreAlumno + " | Notas: " + Arrays.toString(asignaturas);
    }
}