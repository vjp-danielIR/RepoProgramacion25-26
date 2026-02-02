/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio12;

/**
 *
 * @author alumno
 */
public class Muebles {

    //variables
    private int precio;
    private String descripcion;

    //constructores
    //por defecto
    public Muebles() {
        this.precio = 0;
        this.descripcion = "";
    }

    //parametrizado
    public Muebles(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    //getter y setters
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //to string 
    @Override
    public String toString() {
        return "Muebles{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }

}
