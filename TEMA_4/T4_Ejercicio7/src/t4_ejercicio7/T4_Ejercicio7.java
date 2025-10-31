/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio7;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class T4_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num1, num2, num3, num4;
     
        Scanner entrada = new Scanner(System.in);
              System.out.print("Introduce un numero ");
            num1 = entrada.nextInt();
            
             System.out.print("Introduce un numero ");
            num2 = entrada.nextInt();
            
            System.out.print("Introduce un numero");
            num3 = entrada.nextInt();
            
             System.out.print("Introduce un numero ");
            num4 = entrada.nextInt();
     
               
    }
    
    public static int ordenarNum(int num1, int num2, int num3, int num4, int[] num){
       
        for (int i = 0; i < num.length - 1; i++) {
    for (int j = 0; j < num.length - 1 - i; j++) {
        if (num[j] > num[j + 1]) {
            int temp = num[j];
            num[j] = num[j + 1];
            num[j + 1] = temp;
        }
    }
}
        
        
        return 0;
    
    }
    }