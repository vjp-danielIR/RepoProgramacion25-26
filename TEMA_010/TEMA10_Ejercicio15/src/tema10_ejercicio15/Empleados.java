/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10_ejercicio15;

/**
 *
 * @author danie
 */
public class Empleados {
    private String nombreEmpleado;
    private int sueldo;

    // Constructor por defecto
    public Empleados() {
        this.nombreEmpleado = "";
        this.sueldo = 0;
    }

    // Constructor parametrizado
    public Empleados(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    // Getters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    // Setters
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    // toString
    @Override
    public String toString() {
        return nombreEmpleado + " - " + sueldo;
    }
}