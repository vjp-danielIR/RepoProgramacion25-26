/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio13_medio;
import java.util.Scanner; //importamos el paquete necesario
/**
 *
 * @author daniel
 */
public class T1234Ejercicio13_Medio {

    /**
     * @param args the command line arguments
     * 
     * 
     *  Pide números al usuario y muéstralos por pantalla hasta que el usuario introduzca un número negativo
     */
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in); //creamos un scanner
       int num; //creamos la variable
        do { //bucle para mostrar hasta que de un negativo
            System.out.println("Dime un número:"); //pido numero
            num = entrada.nextInt(); //lo guardo

            if (num >= 0) { //si num es mayor o igual a 0
                System.out.println("Número introducido: " + num); //le imprimire le numero 
            }

        } while (num >= 0); // Repite mientras el número sea positivo o cero
    }}