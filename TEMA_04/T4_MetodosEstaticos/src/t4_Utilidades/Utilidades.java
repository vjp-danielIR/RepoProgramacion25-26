/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4_Utilidades;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Utilidades {
    //este metodo sirve para pedir un numero y en caso de que me de una letra le salga error 
      public static int pedirNumero() {
        int num = 0;
        
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escribe un número: ");
            num = entrada.nextInt();                        
        } catch(InputMismatchException e) {
            System.out.println("Has introducido un valor no válido");
            System.out.println(e);
        }
        
        return num;
    }   //este metodo devuelve una letra aleatoria entre la a y la z
        public static char letraAleatoria(char a, char b) {
           //declaramos las variables y las inicializamos con el rango de letras dado
           int inicio =  a;
            int fin =  b;
                                //fin + 1 - inicio por que si se hicera natural contaria 1 letra de menos y luego se vuelve 
                                //a sumar por que lo restamos par que quedara correcto usamos el int por el codigo ASSCI
    int numAleatorio = (int) (Math.random() * (fin + 1 - inicio) + inicio);
    //devolvemos el numero en forma de caracter
 
    return (char) numAleatorio;
           
  }
   }