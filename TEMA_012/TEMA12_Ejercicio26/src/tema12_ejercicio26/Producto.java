/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema12_ejercicio26;

import java.io.Serializable;

/**
 *
 * @author Daniel_Iglesias
 */
public class Producto implements Serializable {

    //atributos 
    private String nombre;
    private double precio;
    private int stock;

    //constructor por defecto
      public Producto() {
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
    }
      //constructor parametrizado
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //metodo que muestra el objeto
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
    
    
}
