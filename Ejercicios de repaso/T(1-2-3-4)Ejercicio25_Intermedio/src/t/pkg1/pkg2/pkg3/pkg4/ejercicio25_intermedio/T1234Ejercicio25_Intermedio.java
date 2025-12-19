/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio25_intermedio;

/**
 *
 * @author alumno
 */
public class T1234Ejercicio25_Intermedio {

    /**
     * @param args the command line arguments
     * Muestra todos los números entre 100 y 200 que sean múltiplos de 3 y 7 a la vez
     */
    public static void main(String[] args) {
            //variables
            int num1= 3;
            int num2 = 7;
            
            //si i que es 100 no supera o es 200 se suma 1 y comparo on un operador and si las 2 son true se mostrara el mensaje
            for(int i=100; i<200; i++){
                if(i % num1 ==0 && i % num2 ==0){
                    System.out.println(i + " es multiplo de: " + num1 + " y "  +num2 + " a la vez" );
                }
            }
    }
}
