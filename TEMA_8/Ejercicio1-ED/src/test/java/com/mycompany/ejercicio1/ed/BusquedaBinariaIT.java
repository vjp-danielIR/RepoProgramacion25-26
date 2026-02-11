/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicio1.ed;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumno
 */
public class BusquedaBinariaIT {
    
    public BusquedaBinariaIT() {
    }

    /**
     * Test of busquedaBinaria method, of class BusquedaBinaria.
     */
    @org.junit.jupiter.api.Test
    public void testBusquedaBinaria() {
        
        
    }
   

    @Test
    void testNumeroMedio() {
        busqueda = new BusquedaBinaria();
        int resultado = busqueda.busquedaBinaria(5);
        assertEquals(4, resultado);
    }

    @Test
    void testPrimerNumero() {
        busqueda = new BusquedaBinaria();
        int resultado = busqueda.busquedaBinaria(1);
        assertEquals(0, resultado);
    }

    @Test
    void testUltimoNumero() {
        busqueda = new BusquedaBinaria();
        int resultado = busqueda.busquedaBinaria(10);
        assertEquals(9, resultado);
    }

    @Test
    void testNumeroNoExiste() {
        Busqueda = new BusquedaBinaria();
        int resultado = Busqueda.busquedaBinaria(20);
        assertEquals(-1, resultado);
    }

    @Test
    void testNumeroNegativo() {
        busqueda = new BusquedaBinaria();
        int resultado = busqueda.busquedaBinaria(-5);
        assertEquals(-1, resultado);
    }
}
