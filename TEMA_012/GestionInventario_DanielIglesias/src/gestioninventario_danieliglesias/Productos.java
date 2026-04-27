/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioninventario_danieliglesias;

/**
 *
 * @author Daniel_Iglesias
 */
public class Productos {
    
    //atributos
    private String nombre;
    private int cantidad;
    private double precio;
    
    //constructores por defecto y parametrizado
     public Productos() {
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0;
    }

    public Productos(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //metodo to string para mostrar los objetos
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
    
    
}
