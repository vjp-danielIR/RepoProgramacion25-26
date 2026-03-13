/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio9;

import static t4_ejercicio9.pedirPantalla.pedirPantalla;

/**
 *
 * @author alumno
 */
public class T4_Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num1, num2, num3, menor;
        num1 =pedirPantalla();
        num2 =pedirPantalla();
        num3 =pedirPantalla();
        
        if (num1 <= num2 && num1 <= num3){
            menor = num1;     
        }else if (num2 <= num1 && num2 <= num3){
            menor = num2;
        }else{
           menor = num3;
    }
        System.out.println("El numeor mas pequeño es: " + menor);
    }
}