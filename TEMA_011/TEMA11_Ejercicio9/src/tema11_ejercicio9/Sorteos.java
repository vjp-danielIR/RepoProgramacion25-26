/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11_ejercicio9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.TreeMap;

/**
 *
 * @author Daniel_Iglesias
 */
public class Sorteos {

    // Atributos
    private TreeMap<Integer, LocalDate> fecha;
    private int[] numerosGanadores = new int[4];

    // constructor por defecto
    public Sorteos() {
        this.fecha = new TreeMap<>();
        this.numerosGanadores = generarNumeros();
    }

    // constructor parametrizado
    public Sorteos(LocalDate fecha, int[] numerosGanadores) {
        this.fecha = new TreeMap<>();
        this.numerosGanadores = numerosGanadores;
    }

    // metodo que genera 4 numeros aleatorios entre el 1 y 100
    private int[] generarNumeros() {
        int[] aux = new int[4]; // Creamos un array temporal
        for (int i = 0; i < aux.length; i++) {
            aux[i] = (int) (Math.random() * 100) + 1;
        }
        return aux;
    }

    // Getters y Setters 
    public TreeMap<Integer, LocalDate> getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha, Integer id) {
        this.fecha.put(id, fecha);
    }

    public int[] getNumerosGanadores() {
        return numerosGanadores;
    }

    public void setNumerosGanadores(int[] numerosGanadores) {
        this.numerosGanadores = numerosGanadores;
    }

    //metodo que muestra objeto
    @Override
    public String toString() {
        return "Sorteo [fecha=" + fecha + ", numerosGanadores=" + Arrays.toString(numerosGanadores) + "]";
    }
}
