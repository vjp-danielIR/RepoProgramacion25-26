/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11_ejercicio9;

import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author Daniel_Iglesias
 */
public class Sorteos {

    // Atributos
    private LocalDate fecha;
    private int[] numerosGanadores = new int[4];

    // constructor por defecto
    
    public Sorteos() {
        this.fecha = LocalDate.EPOCH;
        this.numerosGanadores = new int[4];
                for (int i = 0; i < numerosGanadores.length; i++) {
            this.numerosGanadores[i] = (int) (Math.random() * 99 + 1);
        }
    }

    // constructor parametrizado
    public Sorteos(LocalDate fecha, int[] numerosGanadores) {
        this.fecha = fecha;
        this.numerosGanadores = numerosGanadores;
    }

    

    // Getters y Setters 
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha=fecha;
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
