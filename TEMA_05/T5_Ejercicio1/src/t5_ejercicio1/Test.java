/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio1;

/**
 *
 * @author alumno
 */
public class Test {
     public void Test(){
    Coche miCoche = new Coche("Toyota", "Corolla", 0, "Rojo", false);
       Coche cochePadre = new Coche("Ford", "Focus", 0, "Azul", false);
       
       
         // Arrancar coches
        miCoche.arrancarCoche();   // motorEncendido = true, velocidad = 10
        cochePadre.arrancarCoche();

        // Acelerar 5 veces miCoche
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }

        // Frenar 2 veces miCoche
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        // Acelerar 3 veces cochePadre
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }

        // Apagar cochePadre
        cochePadre.apagarCoche();

        // Mostrar estado de los coches
        System.out.println("Estado de miCoche:");
        miCoche.obtenerEstado();

        System.out.println("\nEstado de cochePadre:");
        cochePadre.obtenerEstado();
    }
}