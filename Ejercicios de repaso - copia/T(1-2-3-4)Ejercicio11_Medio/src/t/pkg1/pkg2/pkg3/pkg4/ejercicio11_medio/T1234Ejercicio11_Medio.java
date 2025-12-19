/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio11_medio;
import java.util.Scanner;
import java.util.InputMismatchException; //importamos los paquetes necesarios 
/**
 *
 * @author daniel
 */
public class T1234Ejercicio11_Medio {

    /**
     * @param args the command line arguments
     * 
     * Crea un método que pida al usuario un número entero controlando la excepción
     * de que el usuario introduzca un tipo de dato erróneo. Crea otro método que devuelva el mayor de los tres números.
     */
    public static void main(String[] args) {
        //variables
        int num1=0,num2=0,num3=0;
        boolean correcto=false;
       Scanner entrada= new Scanner(System.in); //creamos el scanner y como son del mismo tipo puedo usar solo este para los 3 numeros
       do {
            try {
                //pedimos por pantalla y lo vamos guardando 
                System.out.println("Dime un numero:");
                num1 = entrada.nextInt();
                System.out.println("Dime otro numero:");
                num2 = entrada.nextInt();
                System.out.println("Dime un ultimo numero:");
                num3 = entrada.nextInt();

                // si no hubo excepción el valor de correcto se pone en true para salir del bucle
                correcto = true;

            } catch (InputMismatchException e) {
                System.out.println("Valor no permitido tiene que ser un numero.");
                entrada.next(); // Limpiar el scanner para que no se quede en bucle
            }

        } while (!correcto); // El bucle sigue hasta que "correcto" sea true
        mayorQue(num1,num2,num3); //se lo paso al metodo estatico
    }
    public static void mayorQue(int num1,int num2,int num3){ //recibe por parametros los 3 numeros
        if(num1 > num3 && num1 > num2){ //si el numero uno es mayor se imprime  el comparador &&es que las 2 partes tienen que ser true
            System.out.println(num1); //lo imprimo 
        } else if(num2 > num1 && num2 > num3){ //si no es el 1 se viene al 2 si el 2 es el mayor se imprime
            System.out.println(num2);
        } else { //y si no es ninguno de esos dos directamente imprime el tercer numero
            System.out.println(num3);
        
        }
        
    }
}
