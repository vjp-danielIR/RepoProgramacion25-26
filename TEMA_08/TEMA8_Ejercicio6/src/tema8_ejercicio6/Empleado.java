/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio6;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private float tarifaPorHora;
    
    // Constructor por defecto
    public Empleado() {
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaPorHora = 0;
    }
    
    // Constructor con parametros
    public Empleado(String nombre, int horasTrabajadas, float tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public float getTarifaPorHora() {
        return tarifaPorHora;
    }
    
    public void setTarifaPorHora(float tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    //to stringn para mostrar el objeto
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaPorHora=" + tarifaPorHora + '}';
    }
    
    
}
