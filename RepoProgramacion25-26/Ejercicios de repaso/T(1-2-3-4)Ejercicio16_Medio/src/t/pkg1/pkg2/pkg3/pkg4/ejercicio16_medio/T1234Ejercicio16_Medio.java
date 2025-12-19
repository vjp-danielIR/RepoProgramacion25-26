/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio16_medio;
 import java.util.Scanner; //importamos el paquete
/**
 *
 * @author daniel
 */
public class T1234Ejercicio16_Medio {

    /**
     * @param args the command line arguments
     * 
     * Pide un número y muestra todos sus divisores.
     */
    public static void main(String[] args) {
        // creamos scanner
        Scanner entrada= new Scanner(System.in);
        //pedimos por pantalla
        System.out.println("Dime un numero: ");
        int num = entrada.nextInt(); //lo guardamos en num
        
        for(int i=0; i<=100; i++){ //mientras que i sea menor o igual a 100 (por poner un limite) se sumara una 
        if(i % num == 0){
            System.out.println("el numero" + i + " es divisible entre " + num); //si la division entre i y num es igual a 0 se imprimira el mensaje de que si es divisible
        }
        }
        
    }
    
}
