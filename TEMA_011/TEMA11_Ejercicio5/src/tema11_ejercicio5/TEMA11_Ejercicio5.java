/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema11_ejercicio5;

import java.util.*;

/**
 *
 * @author alumno
 */
public class TEMA11_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Vector con los meses
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // TreeMap ordenado por clave
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // LinkedHashMap mantiene orden de inserción
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        // Insertar del revés
        for (int i = 0; i < meses.length; i++) {
            int clave = 12 - i;
            String mes = meses[i];

            treeMap.put(clave, mes); //le digo que los parametros que le meto son el nunmero de mes y el mes 
            linkedMap.put(clave, mes);
        }
        // Mostrar TreeMap
        System.out.println("Contenido de HashSet:");
        for (int i = 0; i < treeMap.size(); i++) {
            System.out.println(i);
        }

        // Mostrar LinkedHashSet
        System.out.println("Contenido de LinkedHashSet:");
        for (int i = 0; i < linkedMap.size(); i++) {
            System.out.println(i);
        }

    }

}
