/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio6_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            System.out.println("dime la nota que sacastes= ");
            float nota = entrada.nextFloat();
            
            if (nota >= 0 && nota <= 4){
                System.out.println(" tu nota = " + nota + " es Suspensa ");
            } else if (nota <= 6){
                System.out.println(" Tu nota =" + nota + " esta bien");
            } else if (nota <= 8){
                System.out.println(" tu nota = " + nota + " es un Notable");
            } else if (nota  <= 10){
                System.out.println("tu nota = " + nota + "es un SOBRESALIENTER");
            } else {
                 System.out.println("la nota debe estar entre 0 y 10.");
        }
                
    }
        }
