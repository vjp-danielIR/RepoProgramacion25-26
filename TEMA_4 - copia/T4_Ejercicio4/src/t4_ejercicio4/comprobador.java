/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_ejercicio4;

/**
 *
 * @author daniel
 */
public class comprobador {
     public static int menor(int a, int b, int c) {
        int menor = a;//comparo cual es el menor de todos ellos
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        } //devuelvo el numero mas pequeño
        return menor;
    }
}