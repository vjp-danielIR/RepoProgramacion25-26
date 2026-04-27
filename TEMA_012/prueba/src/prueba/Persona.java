/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author Daniel_Iglesias
 */
public class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;
    private String telefono;

    // Constructor por defecto
    public Persona() {
    }

    // Constructor parametrizado
    public Persona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter y Setter de telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // toString
    @Override
    public String toString() {
        return nombre + "," + edad + "," + telefono;
    }

    // compareTo (orden por edad)
    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }
}