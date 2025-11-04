/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio14;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author danie
 */
public class T4_Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamamos al metodo para pedir un numero y lo guardamos en la variable num
        int num = pedirNumero();
        //se la pasamos a otro metodo la variable num para darle los multiplos al usuario
        mostrarMultiplos(num);
    }

    public static int pedirNumero() {
        //metodo para pedir por pantalla asegurandonos de que sea el numero mayor a 0 pidiendolo las veces que sean necesarias
        Scanner entrada = new Scanner(System.in);
        int num = 0;// variable donde guardaremos el numero del usuario
        boolean valido = false; //comprobacion de si el numero es 0 

        do {
            try {
                System.out.print("Dime un numero");
                num = entrada.nextInt(); //guardamos lo que el usuario entrego
                
                if (esValido(num)) {//llamamos al metodo que comprobara si el numero es 0 o superior
                    valido = true; //si se cumple y es mayor pues devolvemos el numero
                } else { //en caso de que sea falso el saldra el error
                    System.out.println("el número debe ser mayor que 0."); 
                }
                   //en caso de que haya entregado una letra capturamos la excepcion y imprimira por pantalla el error 
                   //volviendo a empezar
                   
            } catch (InputMismatchException e) {
                System.out.println("No se pueden letras solo numeros");
                entrada.nextLine(); 
            }
        } while (!valido);

        return num;
    }

    
    public static boolean esValido(int num) {
        //comparacion de si numero del usuario es superior a 0
        return num > 0;
    }

    // Metodo para imprimir los multiplos
    public static void mostrarMultiplos(int num) {
        System.out.println("Múltiplos de 3 entre 1 y " + num);
        //si i es menor o igual a num se sigue sumando 1 a i 
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {//si el resto de la division de i y 3 es igual a 0 se mostrara por pantalla
                System.out.print(i + " ");
            }
        }
    }
}