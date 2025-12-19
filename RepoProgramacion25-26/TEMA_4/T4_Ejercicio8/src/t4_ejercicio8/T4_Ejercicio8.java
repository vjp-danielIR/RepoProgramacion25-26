/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio8;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T4_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad;
        
       Scanner entrada = new Scanner (System.in);
        System.out.println("dime cuanto dinero tienes");
       cantidad = entrada.nextInt();
       dineroSeparado(cantidad);
    }
    
     public static void dineroSeparado(int cantidad){
    
     int resto;
     int billetes50;
      int billetes20;
       int billetes10;
        int billetes5;
         int monedas2; 
          int monedas1;
         
       
    resto = cantidad;
            //primera division
         billetes50 = resto / 50;
        resto %= 50;
            //segunda division y volvemos a guardar en resto
         billetes20 = resto / 20;
        resto %= 20;
            //otercera division
         billetes10 = resto / 10;
        resto %= 10;
            //cuarta division
         billetes5 = resto / 5;
        resto %= 5;
            //quinta division 
         monedas2 = resto / 2;
        resto %= 2;
            //pues ya lo que quede 
        monedas1 = resto;

        System.out.println(cantidad + " euros se descomponen en:");

        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }  if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }  if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }  if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }  if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        } if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
    }}