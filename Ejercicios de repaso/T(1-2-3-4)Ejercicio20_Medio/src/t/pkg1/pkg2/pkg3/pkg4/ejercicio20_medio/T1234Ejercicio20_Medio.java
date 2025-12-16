/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio20_medio;

/**
 *
 * @author daniel
 */
public class T1234Ejercicio20_Medio {

    /**
     * @param args the command line arguments
     * 
     * Crea un método que reciba por parámetro un número entero y devuelva true si el número es primo y false en caso contrario.
     */
    public static void main(String[] args) {
       int num=6; //variable
       
       esPrimo(num); //se la paso al metodo
    }
    public static boolean esPrimo(int num){ //metodo estatico que recibe por parametros
        // Los números menores o iguales a 1 no son primos 
    if (num <= 1) {
        return false;
    }
      
        for (int i = 2; i <= Math.sqrt(num); i++) { //usamos la propiedad de math para calcularlo 
      //  Si el número es divisible por 'i', no es primo
        if (num % i == 0) { //si el resto de la division da 0 no es primo
            return false; // No es primo
        }
    }
    //  Si no se encontraron divisores, es primo
    return true; // Es primo
}
    }