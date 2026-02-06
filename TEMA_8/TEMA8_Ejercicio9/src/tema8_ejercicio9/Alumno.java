/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio9;

/**
 *
 * @author danie
 */
public class Alumno {
     private String nombre;
    private Asignatura[] asignaturas;

    // constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.asignaturas = new Asignatura[4];
    }

    // constructor parametrizado
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[4];
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + asignaturas + '}';
    }
    
}
