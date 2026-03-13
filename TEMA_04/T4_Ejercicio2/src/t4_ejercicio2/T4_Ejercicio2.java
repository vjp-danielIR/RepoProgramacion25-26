/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio2;
import java.util.Scanner;
import operaciones.operacionSM;
import static operaciones.operacionSM.multiplicacion;
import static operaciones.operacionSM.suma;
/**
 *
 * @author alumno
 */
public class T4_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos por pantalla y lo guardamos
        int resultado;
       Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num1 = entrada.nextInt();
        System.out.println("Dime otro numero ");
        int num2 = entrada.nextInt();
        
        //comparamos si num1 es mayor que 10
        if(num1 > 10){
           resultado = operaciones.operacionSM.multiplicacion(num1, num2);//si es asi lo multiplicamos
            System.out.println(resultado);
        //si no lo es pues los sumamos
        } else {
        resultado = operaciones.operacionSM.suma(num1, num2);
            System.out.println(resultado);
        }
    }
    
}
