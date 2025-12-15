/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio7_facil;

import java.util.Scanner; //para guardar el dato del usuario
/**
 *
 * @author daniel
 */
public class T1234Ejercicio7_facil {

    /**
     * @param args the command line arguments
     * 
     * Crea un método que pida al usuario un caracter (char). Luego, crea otro método que imprima por pantalla si el caracter es una vocal o una consonante.
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in); 
        System.out.println("Dime una letra: ");//pedimos por pantalla
        char letra = entrada.next().charAt(0); // guardar solo el primer caracter (se que se podia hacer con el .lengh pero se me hacia muy largo el codigo y quise ver si habia una manera mas corta o rapida
        vocalOConsonante(letra); //le pasamos la variable
    }
    //metodo fuera de main y static para comprobar si es una bocal o consonante
    public static void vocalOConsonante(char c) {
        char letra = Character.toLowerCase(c); // para no diferenciar mayúsculas
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(c + " es una vocal.");
        } else {
            System.out.println(c + " es una consonante.");
        }
    }
}