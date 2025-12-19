/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio2_facil;
import java.util.Scanner; //esto es para poder guardar el resultado que nos de el usuario
/**
 *
 * @author daniel
 */
public class T1234Ejercicio2_facil {

    /**
     * @param args the command line arguments
     * 
     * Crea un método que pida un número al usuario.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //esto es quiero crear un scanner de nombre entrada que sera donde se guarde el dato del usuario
        System.out.println("Dime un numero"); //le pedimos al usuario el numero
        int numero =entrada.nextInt(); //guardamos el numero en la variable numero 
        
        System.out.println(numero); //imprimimos por pantalla el numero que nos haya dado el usuario
    }
    
}
