/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio3_facil;

 import java.util.Scanner;
import java.util.InputMismatchException; //este es para que si el usuario mete un valor no valido le avisemos

/**
 *
 * @author daniel
 */
public class T1234Ejercicio3_facil {

    /**
     * @param args the command line arguments
     * 
     * Mejora el método anterior añadiendo el control de excepciones para controlar el caso de que el usuario introduzca un tipo de dato int
     */
    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in); //esto es quiero crear un scanner de nombre entrada que sera donde se guarde el dato del usuario
        int numero; //creamos la variable 
        
        boolean valido =false; //variable para confirmar que es un numero y no una letra
        
         do{ //usamos un bucle do while para que pueda volver a meter el numero y no se detenga el programa
             
       try{ //esto es para controlar las partes claves donde no puede fallar el programa
           
        System.out.println("Dime un numero"); //le pedimos al usuario el numero
        
         numero =entrada.nextInt(); //guardamos el numero en la variable numero 
        
         valido= true;
        
         System.out.println(numero); //imprimimos por pantalla el numero que nos haya dado el usuario
      
       } catch (InputMismatchException e) { //aqui es para que si mete una letra salte esta excepcion y vuelva a empezar el bucle
        
           System.out.println("Valor no valido no se pueden letras solo numeros");
           
           entrada.next(); // limpiar entrada incorrecta
            }
        
       } while(valido);
        
  }
}