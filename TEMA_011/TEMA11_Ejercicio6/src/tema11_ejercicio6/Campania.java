/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11_ejercicio6;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Campania {

    private String nombre;
    private Set<Donacion> donaciones;

    // Constructor por defecto
    public Campania() {
        this.nombre = "";
        this.donaciones = new HashSet<>();
    }

    // Constructor parametrizado
    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new HashSet<>();
    }

    //getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", donaciones=" + donaciones + '}';
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

    //Metodo que recorre el set en busca de un nombre coincidente al que el usuario nos dio
    //para mostrar su nombre y la cantidad donada
    public void mostrarDonacionesNombre(String nombre) {
        Iterator<Donacion> it = donaciones.iterator();
        boolean encontrado = false;

        while (it.hasNext()) {
            Donacion donacion = it.next();
            if (donacion.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(donacion);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay donaciones de " + nombre);
        }
    }

    //Metodo que muestra las donaciones realizadas
    public void mostrarNumeroDonaciones() {
        System.out.println("Número de donaciones: " + donaciones.size());
    }

    //Metodo que muestra la cantidad recaudada 
    public void mostrarTotalRecaudado() {
        double total = 0;
        for (Donacion donacion : donaciones) {
            total += donacion.getCantidad();
        }
        System.out.println("Total recaudado: " + total + "€");
    }

    // Metodo que ordena las donaciones de mayor a menor
    public void ordenarDonaciones() {
        ArrayList<Donacion> ordenadas = new ArrayList<>();
        for (Donacion donacion : donaciones) {
            boolean insertado = false;
            for (int i = 0; i < ordenadas.size(); i++) {
                if (donacion.getCantidad() > ordenadas.get(i).getCantidad()) {
                    ordenadas.add(i, donacion);
                    insertado = true;

                }
            }
            if (!insertado) {
                ordenadas.add(donacion);
            }
        }
        System.out.println("--- Ordenadas de mayor a menor ---");
        for (Donacion donacion : ordenadas) {
            System.out.println(donacion);
        }
    }
}
