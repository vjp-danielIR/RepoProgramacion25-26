/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio15;

/**
 *
 * @author alumno
 */
public class Empleado {
     private String nombre;
    private int salario;
    private Direccion direccion;
    
    // Constructores
    public Empleado(){
    this.nombre="";
    this.salario=0;
   
    }
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getSalario() {
        return salario;
    }
    
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Empleado: " + nombre  +
               "Salario: " + salario + "€" +
               "Dirección: " + direccion;
    }
}