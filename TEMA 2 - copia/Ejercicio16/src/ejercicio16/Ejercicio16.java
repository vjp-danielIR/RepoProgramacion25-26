/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero = 130;
        int bille50 = dinero/50;
        int billete10 = (dinero % 50) /10;
        System.out.println(" Tengo " + bille50 +"  billetes de 50 y " + billete10 + " billetes de 10 ");
    }
    
}
