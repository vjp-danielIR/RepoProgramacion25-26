<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio8;

/**
 *
 * @author danie
 */
public class Producto {
      //Atributos
    private String nombre;
    private double precio;
    private int stock;
    
    //Constructor por defecto
    public Producto() {
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
    }
    
    //Constructor parametrizado
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getStock() {
        return stock;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //toString
    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio + " euros, Stock: " + stock + " unidades";
    }
}

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio8;

/**
 *
 * @author danie
 */
public class Producto {
      //Atributos
    private String nombre;
    private double precio;
    private int stock;
    
    //Constructor por defecto
    public Producto() {
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
    }
    
    //Constructor parametrizado
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getStock() {
        return stock;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //toString
    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio + " euros, Stock: " + stock + " unidades";
    }
}

>>>>>>> 96425095514d1e1a14a0c2a98e7025ed552ff8e9
