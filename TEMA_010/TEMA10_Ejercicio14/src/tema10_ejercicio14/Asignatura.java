
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10_ejercicio14;

/**
 *
 * @author danie
 */
public class Asignatura {
      private String nombreAsignatura;
    private float notaAsignatura;

    // Constructor por defecto
    public Asignatura() {
        this.nombreAsignatura = "";
        this.notaAsignatura = 0.0f;
    }

    // Constructor parametrizado
    public Asignatura(String nombreAsignatura, float notaAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaAsignatura = notaAsignatura;
    }

    // Getters y Setters
    public String getNombreAsignatura() { return nombreAsignatura; }
    public void setNombreAsignatura(String nombreAsignatura) { this.nombreAsignatura = nombreAsignatura; }

    public float getNotaAsignatura() { return notaAsignatura; }
    public void setNotaAsignatura(float notaAsignatura) { this.notaAsignatura = notaAsignatura; }

    @Override
    public String toString() {
        return nombreAsignatura + ": " + notaAsignatura;
    }
}