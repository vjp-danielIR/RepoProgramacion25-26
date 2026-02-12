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
       //no hay un indice 11 asi que el resultado debe ser negativo por defecto
        BusquedaBinaria busqueda = new BusquedaBinaria();
        int resultado = busqueda.busquedaBinaria(11);
        assertEquals(-1, resultado);
        
        //No hay negativos asi que el resultado tambien debe ser negativo
        resultado = busqueda.busquedaBinaria(-5);
        assertEquals(-1, resultado);
        
        //guarda la posicion 5 del array y el resultado debe ser 4 
          resultado = busqueda.busquedaBinaria(5);
        assertEquals(4, resultado);
        
         //No hay un indice 11 asi que lo mismo que el anterior debe dar el resultado negativo 
        resultado = busqueda.busquedaBinaria(11);
        assertEquals(-1, resultado);
        
    }
  
}
