/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio8;
import java.util.Scanner; //importamos la clase para poder guardar lo que nos de el usuario
/**
 *
 * @author daniel
 */
public class T1234Ejercicio8 {

    /**
     * @param args the command line arguments
     * 
     *  Crea un método que pida al usuario un número y pásaselo por parámetro a otro método que imprima su tabla de multiplicar.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//creamos el Scanner
        System.out.println("Dime el numero del que quieres saber la tabla de multiplicar: " ); // le pedimos al usuario el numero   
        int numero = entrada.nextInt();//guardamos el numero en numero y limpiamos el buffer con ()
       
       tablaMultiplicar(numero); //le pasamos el numeor al metodo
                
        
        
        
    }
    public static void tablaMultiplicar(int numero){ //para poder utilizarse en el main tiene que ser un metodo estatico es decir que pertenece a la clase
    for(int i=0; i<=10; i++){ //mientras i sea menos o igual a 10 se suamara 1 a i
        System.out.println(numero * i);//imprimimos por pantalla las multiplicaciones
    }
    }
    
}
