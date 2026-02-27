/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ordenarporseleccion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author alumno
 */

public class OrdenarPorSeleccionIT {

    //Test de caja negra
    /**
     * Test of ordenarporseleccion method, of class OrdenarPorSeleccion.
     *
     * haremos 3 pruebas 1 en la que este ordenada 2 desordenada por completo 3
     * ordenada pero al reves
     */
    //1 ordenada
    @Test
    public void testOrdenada() {
        int[] listaNumeros = {0,3,4,6,7};
        int[] esperado = {0,3,4,6,7};
        System.out.println("Ahora los numeros son 0,3,4,6,7");
        boolean result = OrdenarPorSeleccion_.ordenarporseleccion(listaNumeros);
        assertArrayEquals(esperado, listaNumeros);

    }
        //2 desordenada por completo
    @Test
    public void testDesordenada() {
        int[] listaNumeros = {3, 8, 2, 5, 0};
         int[] esperado = {0,2,3,5,8};
        boolean result = OrdenarPorSeleccion_.ordenarporseleccion(listaNumeros);
        assertArrayEquals(esperado, listaNumeros);

    }
        // 3 ordenada pero de mayor a menor
    @Test
    public void testOrdenadaAlReves() {
        int[] listaNumeros = {8, 4, 5, 3, 2, 1};
        int[] esperado={1,2,3,4,5,8};
        System.out.println("Ahora los numeros son 8,4,5,3,2,1");
        boolean result = OrdenarPorSeleccion_.ordenarporseleccion(listaNumeros);
        assertArrayEquals(esperado, listaNumeros);

    }
    
    
    //Test de Caja blanca caminos basicos
    //el primer camino es que todo este correcto 
      @Test
    public void testPrimerCamino() {
        int[] listaNumeros = {0,1,2,3,4,5};
        int[] esperado={0,1,2,3,4,5};
        System.out.println("Ahora los numeros son 8,4,5,3,2,1");
        boolean result = OrdenarPorSeleccion_.ordenarporseleccion(listaNumeros);
        assertArrayEquals(esperado, listaNumeros);

    }
       @Test
    public void testSegundoCamino() {
        int[] listaNumeros = {0,3,2,6,4,5};
        int[] esperado={0,2,3,4,5,6};
        boolean result = OrdenarPorSeleccion_.ordenarporseleccion(listaNumeros);
        assertArrayEquals(esperado, listaNumeros);

    }
    
        @Test
    public void testTercerCamino() {
        int[] listaNumeros = {9,6,4,2,8,7};
        int[] esperado={2,4,6,7,8,9};
        boolean result = OrdenarPorSeleccion_.ordenarporseleccion(listaNumeros);
        assertArrayEquals(esperado, listaNumeros);

    }

}

