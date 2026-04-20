/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubdeportivo_danieliglesias;

/**
 *
 * @author Daniel_Iglesias
 */
public class Deportes {

    //atributo
    private String nombre;

    //constructor por defecto
    public Deportes() {
        this.nombre = "";
    }
    //constructor parametrizado

    public Deportes(String nombre) {
        this.nombre = nombre;
    }

    //getter y setter
    public String getNombre(String nombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // mostrar objeto
    @Override
    public String toString() {
        return "Deportes{" + "nombre=" + nombre;
    }

}
