/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11_ejercicio8;

import java.util.*;
/**
 *
 * @author Daniel_Iglesias
 */
public class Ciudades {
    private String nombre;
    private Set<Sedes> sede;

    
     public Ciudades() {
        this.nombre = "";
        this.sede = new HashSet<>();
    }
     
     
    public Ciudades(String nombre, Set<Sedes> sede) {
        this.nombre = nombre;
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sedes> getSede() {
        return sede;
    }

    public void setSede(Set<Sedes> sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Ciudades{" + "nombre=" + nombre + ", sede=" + sede + '}';
    }
    
    
}
