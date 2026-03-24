/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11_ejercicio7;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Campania {

    private Set<Campania> campañas;
    private String nombre;
    private Set<Donacion> donaciones;

    // Constructor por defecto
    public Campania() {
        this.nombre = "";
        this.campañas = new HashSet<>();
        this.donaciones = new HashSet<>();
    }
//constructor parametrizado

    public Campania(String nombre) {
        this.nombre = nombre;
        this.campañas = new HashSet<>();
        this.donaciones = new HashSet<>();
    }

    //getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Campania> getCampanias() {
        return campañas;
    }

    public void setCampanias(Set<Campania> campanias) {
        this.campañas = campanias;
    }

    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", donaciones=" + donaciones;
    }

    //Metodo para añadir una donacion
    public void añadirDonacion(String nombre, double cantidad) {
        Donacion añadir = new Donacion(nombre, cantidad);
        donaciones.add(añadir);
        System.out.println("Donación añadida correctamente.");
    }

    //Metodo que muestra todas las donaciones
    public void mostrarDonaciones() {
        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones.");
        } else {
            for (Donacion don : donaciones) {
                System.out.println(don);
            }
        }
    }

    //Metodo que muestra la cantidad recaudada 
    public void mostrarTotalRecaudado() {
        double total = 0;
        for (Donacion donacion : donaciones) {
            total += donacion.getCantidad();
        }
        System.out.println("Total recaudado: " + total + "€");
    }

    //Metodo para añadir una campaña al set
    public void añadirCampania(String nombreCampania) {
        Campania nueva = new Campania(nombreCampania);
        campañas.add(nueva);
        System.out.println("Campaña añadida correctamente.");
    }

    //Metodo para mostrar la campaña que el usuario pida 
    public void mostrarCampaniaNombre(String nombreBuscado) {

        Iterator<Campania> it = campañas.iterator();
        boolean encontrado = false;

        while (it.hasNext()) {
            Campania campaña = it.next();

            if (campaña.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Campaña encontrada:");
                System.out.println("Nombre: " + campaña.getNombre());

                campaña.mostrarDonaciones();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe esa campaña.");
        }
    }
    //Metodo para mostrar todas las campañas
    public void mostrarCampanias() {
        for (Campania campaña : campañas) {
            System.out.println("Nombre: " + campaña.getNombre());
            campaña.mostrarDonaciones();
        }
    }

    //metodo para mostrar la mayor donacion
    public void mostrarMayorDonacion() {
        Donacion mayor;
        mayor = null;

        for (Donacion donacion : donaciones) {
            if (mayor == null || donacion.getCantidad() > mayor.getCantidad()) {
                mayor = donacion;
            }
        }

        System.out.println("Mayor donación:");
        System.out.println(mayor);
    }
}
