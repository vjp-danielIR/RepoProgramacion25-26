/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10_ejercicio1;

/**
 *
 * @author alumno
 */
public class Persona {
      private String nombre;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
    }

    // Constructor con parámetros
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //to string
    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "'}";
    }
}
