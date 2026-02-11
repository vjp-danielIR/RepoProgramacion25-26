/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio9;

/**
 *
 * @author danie
 */
public class Asignatura {
    //atributos
     private String nombre;
    private float nota;

    // constructor por defecto
    public Asignatura() {
        this.nombre = "";
        this.nota = 0.0f;
    }

    // constructor parametrizado
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    
    @Override
    public String toString() {
        return nombre + ": " + nota;
    }
}