/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio16;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private int nota;
    
    // Constructores
    public Alumno(){
    this.nombre= "";
    this.nota=0; 
    }
    
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNota() {
        return nota;
    }
   
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    // Método para obtener la calificación
    public String obtenerCalificacion() {
        if (nota >= 0 && nota <= 4) {
        return "Suspenso";
    } else if (nota >= 5 && nota <= 6) {
        return "Bien";
    } else if (nota >= 7 && nota <= 8) {
        return "Notable";
    } else {
        return "Sobresaliente";
    }
}
    // el to String para devolver la informacion
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Nota: " + this.nota + " Calificacion: " + this.obtenerCalificacion();
        
    }
}