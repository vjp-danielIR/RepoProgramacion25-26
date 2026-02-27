/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenarporseleccion;

/**
 *
 * @author alumno
 */
public class OrdenarPorSeleccion_ {
    int[] listaNumeros= new int[5];
       public static boolean ordenarporseleccion(int[] listaNumeros) {
        int temporal;                                                  
        boolean listaOrdenada = false;                                   

        for (int i = 0; i < listaNumeros.length - 1; i++) {            
            for (int j = i + 1; j < listaNumeros.length; j++) {         
                if (listaNumeros[i] > listaNumeros[j]) {                
                    temporal = listaNumeros[i];                         
                    listaNumeros[i] = listaNumeros[j];                
                    listaNumeros[j] = temporal;                        

                    listaOrdenada = false;                         
                }

            }

        }
        return listaOrdenada;                                     

    } 
}
