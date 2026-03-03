/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10_ejercicio13;

/**
 *
 * @author alumno
 */
public class Ventas {
    //atributos
    private String nombreMes;
    private double ventasCochesMes;
    
    //constructor por defecto
    public Ventas() {
        nombreMes = "";
        ventasCochesMes = 0.0;
    }
     //constructor parametrizado
    public Ventas(String nombreMes, double ventasCochesMes) {
        this.nombreMes = nombreMes;
        this.ventasCochesMes = ventasCochesMes;
    }
    
    //getter y setters
    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public double getVentasCochesMes() {
        return ventasCochesMes;
    }

    public void setVentasCochesMes(double ventasCochesMes) {
        this.ventasCochesMes = ventasCochesMes;
    }
    
    //toString para mostrar objetos
    @Override
    public String toString() {
        return "Ventas{" + "nombreMes=" + nombreMes + ", ventasCochesMes=" + ventasCochesMes + '}';
    }

}
