
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
 import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner asgnatura1 = new Scanner (System.in);
        System.out.println( "Dime que nota tienes en Programación = " );
         float materia1 = asgnatura1.nextFloat();
         
        Scanner asgnatura2 = new Scanner (System.in);
        System.out.println( "Dime que nota tienes en Lenguajes de marcas = " );
            float materia2 = asgnatura2.nextFloat();
        
        Scanner asgnatura3 = new Scanner (System.in);
        System.out.println( "Dime que nota tienes en Bases de Datos = " );
        float materia3 = asgnatura3.nextFloat();
       
        Scanner asgnatura4 = new Scanner (System.in);
        System.out.println( "Dime que nota tienes en Entorno de Desarrollo = " );
        float materia4 = asgnatura4.nextFloat();
        
        Scanner asgnatura5 = new Scanner (System.in);
        System.out.println( "Dime que nota tienes en Sistemas Informaticos = " );
         float materia5 = asgnatura5.nextFloat();
        
        Scanner asgnatura6 = new Scanner (System.in);
        System.out.println( "Dime que nota tienes en Formacion y Orientacion Laboral = " );
        float materia6 = asgnatura6.nextFloat();
       
        
         float notaMedia = (materia1 + materia2 + materia3 + materia4 + materia5 + materia6) / 6;
        
         System.out.println( "Tu nota media es = " + notaMedia);
    }
    
}
