/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio5;

import java.util.*; //importamos las clases necesarias

/**
 *
 * @author alumno
 */
public class TEMA10_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); //creo la lista de arrays
        rellenarNumeros(numeros); //lo relleno
        
        System.out.println("El array esta compuesto por estos numeros: ");
         mostrarNumeros(numeros); //muestro el array
         System.out.println("");
        System.out.println("el par mas grande es:" + calcularMayorPar(numeros)); //calculo el mayor par
        System.out.println("El impar mas pequeño es:" +calcularMenosImpar(numeros)); //y el menor impar
    }

    //metodo que rellenara la lista de arrays
    public static void rellenarNumeros(ArrayList<Integer> numeros) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Introduce números enteros positivos (un negativo para terminar):");
        do {
            System.out.print("Número: ");
            num = entrada.nextInt();
            if (num >= 0) {
                numeros.add(num);
            }
        } while (num >= 0);
    }

    //metodo que mostrara el arrayList 
    public static void mostrarNumeros(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));

        }
    }
    //mwtodo que calcula cual es el mayor numero par
    public static int calcularMayorPar(ArrayList<Integer> numeros) {
        int num=0;
        for (int i = 0; i < numeros.size(); i+=2) {
            if(num<numeros.get(i)){
            num= numeros.get(i);
            }
            
        }
        return num;
    }
    //metodo que calcula cual es el impar mas pequeño
    public static int calcularMenosImpar(ArrayList<Integer> numeros) {
     int num=4; 
        for (int i = 1; i < numeros.size(); i+=2) {
            if(num>=numeros.get(i)){
            num= numeros.get(i);
            }
            
        }
        return num;
    }
    }


