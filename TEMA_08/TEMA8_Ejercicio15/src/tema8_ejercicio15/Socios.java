/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio15;

/**
 *
 * @author alumno
 */
public class Socios {

    //atributos
    private String nombre;
    private double precioAbonado;

    //cconstructor por defecto y parametrizado
    public Socios() {
        this.nombre = "";
        this.precioAbonado = 0.0;
    }

    public Socios(String nombre, double precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }

    //Getter y Setters
    public String getNombre(String nextLine) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioAbonado(int i) {
        return precioAbonado;
    }

    public void setPrecioAbonado(double precioAbonado) {
        this.precioAbonado = precioAbonado;
    }
    

   //to string
    @Override
    public String toString() {
        return "Socios{" + "nombre=" + nombre + ", precioAbonado=" + precioAbonado + '}';
    }

}
