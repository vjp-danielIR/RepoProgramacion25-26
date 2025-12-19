/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_tema3;
import java.util.Scanner;
/**
 * CALCULAR SI TU NOTA SI ESTA APROBADO O SUSPENSO
 * @author Daniel Iglesias
 */
public class Ejercicio6_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            System.out.println("dime la nota que sacastes= ");
            // Leemos la nota con decimales
            float nota = entrada.nextFloat();

            // Validamos y clasificamos la nota con una estructura if-else encadenada
            if (nota >= 0 && nota <= 4){
                // Si la nota está entre 0 y 4  Suspensa
                System.out.println(" tu nota = " + nota + " es Suspensa ");
            } else if (nota <= 6){
                // Si la nota es mayor que 4 y hasta 6  Aprobado 
                System.out.println(" Tu nota =" + nota + " esta bien");
            } else if (nota <= 8){
                // Si la nota es mayor que 6 y hasta 8  Notable
                System.out.println(" tu nota = " + nota + " es un Notable");
            } else if (nota  <= 10){
                // Si la nota es mayor que 8 y hasta 10  Sobresaliente
                System.out.println("tu nota = " + nota + "es un SOBRESALIENTER");
            } else {
                 // Cualquier otra entrada fuera del rango 0-10 se considera inválida
                 System.out.println("la nota debe estar entre 0 y 10.");
        }
                
    }
        }
