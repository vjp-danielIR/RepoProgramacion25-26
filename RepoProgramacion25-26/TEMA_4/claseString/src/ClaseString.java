/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 * No relacionado con el resto
 * @author alumno
 */
public class ClaseString {
    public static void main(String[] args) {
        //declarar una variable de tipo String
        String nombre;
        String nombre1;
        //inicializar la variable
        nombre = "Manolo";
        nombre1= "manolo";
        
        //declarar e inicializar una variable de tipo String
        //String apellido = "Arsanaliev";
        
        //pedir una cadena al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantos trofeos tienes en Clash Royale?");
        String trofeos = entrada.nextLine();//este solo capta la primera palabra ej nombre y apellido solo lee el nombre y nextLine lo lee toodo 
        
         System.out.println("Tienes " + trofeos);
    
         //COMPROBAR DOS VARIABLES (.EQUALS() E .EQUALiGNOREcASE()
         if (nombre.equals(nombre1)){
             System.out.println("Son iguales");
         }else {
              System.out.println("Son distintos");
         }
         
         if (nombre.equalsIgnoreCase(nombre1)){
             System.out.println("Son iguales");
         } else {
             System.out.println("Son distintos");
         }
         
         
    }}
