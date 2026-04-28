/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema12_ejercicio21;

import java.util.Objects;

/**
 *
 * @author Daniel_Iglesias
 */
public class Asignatura {
    //atributos
    private String nombre;
    private double nota;

   //constructor por defecto
    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    //constructor parametrizado
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    
    //getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //metodo que muestra objeto
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }


    
}
