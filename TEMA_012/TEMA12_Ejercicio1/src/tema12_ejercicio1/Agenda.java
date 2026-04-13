/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema12_ejercicio1;

/**
 *
 * @author Daniel_Iglesias
 */
public class Agenda {

    private String nombre;
    private int edad;
    private int numeroMovil;
    
      public Agenda() {
        this.nombre = "";
        this.edad = 0;
        this.numeroMovil = 0;
    }

    public Agenda(String nombre, int edad, int numeroMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMovil = numeroMovil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", edad=" + edad + ", numeroMovil=" + numeroMovil + '}';
    }

}
