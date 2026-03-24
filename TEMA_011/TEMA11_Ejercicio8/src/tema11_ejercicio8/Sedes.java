/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11_ejercicio8;

/**
 *
 * @author Daniel_Iglesias
 */
public class Sedes {
    //atributos
    private String nombre;
    private double ingresos;

    //constructor por defecto
    public Sedes() {
        this.nombre = "";
        this.ingresos = 0.0;
    }
    //constructor parametrizado
    public Sedes(String nombre, double ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }

    //getters y setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    //metodo que muestra objeto
    @Override
    public String toString() {
        return "Sedes{" + "nombre=" + nombre + ", ingresos=" + ingresos + '}';
    }


    
    
}
