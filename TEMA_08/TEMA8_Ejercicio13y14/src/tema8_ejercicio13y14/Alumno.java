/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio13y14;

/**
 *
 * @author alumno
 */
public class Alumno {
    // Atributos
    private String nombre;
    private int edad;
    private double notaMedia;
    
    // Constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0.0;
    }
    
    // Constructor parametrizado
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getNotaMedia() {
        return notaMedia;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + '}';
    }

}