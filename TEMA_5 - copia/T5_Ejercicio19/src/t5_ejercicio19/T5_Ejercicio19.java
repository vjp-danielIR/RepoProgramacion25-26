/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ejercicio19;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T5_Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
       
        // Creamos el primer empleado y le pedimos sus datos
        System.out.println("Empleado 1");
        Empleado empleado1 = new Empleado(entrada);
        
        System.out.println("Empleado 2");
        Empleado empleado2 = new Empleado(entrada);
        
        System.out.println("Empleado 3");
        Empleado empleado3 = new Empleado(entrada);
        
       //Le pasamos los 3 empleados al objeto test para que nos muestre toda la infomracion
        Test test = new Test(empleado1, empleado2, empleado3);
        
        // Calculamos y mostramos los sueldos de todos
        test.determinarSueldos();
       
    }
}