/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio1;
/**
 *
 * @author alumno
 */
public class Asignaturas {
    private String nombre;
    private float nota;
    
    //constructores
    //por defecto
    public Asignaturas() {
        this.nombre = "";
        this.nota = 0;
    }
    
    //parametrizado
    public Asignaturas(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //getter y setter obtener y establecer
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
    
    //to string para mostrar el objeto
    @Override
    public String toString() {
        return "En " + this.nombre + " tiene una nota de " + this.nota;
    }
}