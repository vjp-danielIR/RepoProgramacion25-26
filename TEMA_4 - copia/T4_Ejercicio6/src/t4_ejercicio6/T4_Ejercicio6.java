/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio6;
import java.util.Scanner;
/**
 *
 * @author daniel
 */
public class T4_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int resultado;//creo la variable resultado
        Scanner entrada = new Scanner (System.in);//guardo lo que el usuario me entregue
        System.out.println("Dime tu nota: ");//pido por pantalla
        int nota = entrada.nextInt();//lo guardo en la variable nota
         
        if (nota < 0 || nota > 10) {//comparo si el numero supera el limite de entre 0 y 10
            System.out.println("La nota debe estar entre 0 y 10.");//si es asi imprimo por pantalla
             }
         resultado = calificacion(nota);//llamo al metodo calificacion
         
    }
    
    
    public static int calificacion(int nota){//metodo
       //comparo la nota para entregarle el resultado
     if (nota >= 0 && nota <= 4) {
            System.out.println("Suspenso");
        } else if (nota <= 6) {
            System.out.println("Bien");
        } else if (nota <= 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        } //devuelvo resultado del numero
        return nota;
    }
}