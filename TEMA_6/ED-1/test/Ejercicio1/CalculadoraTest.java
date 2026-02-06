/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ED_Ejercicio1.Calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ED_Ejercicio1.Calculadora;

/**
 *
 * @author alumno
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
         Calculadora calc = new Calculadora();

        int resultado;
        resultado = calc.suma(2, 3);

        assertEquals(5, resultado, "2+3 debería ser 5");
       
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
    }

    /**
     * Test of toString method, of class Calculadora.
     */
    @Test
    public void testToString() {
    }
    
}
