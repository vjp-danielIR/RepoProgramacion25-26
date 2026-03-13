/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio4;

/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] tabla=new int[4][3];
       
       for(int i=0; i < tabla.length; i++){
           tabla[i]=(int) (Math.random() * (100-1) + 100); 
       }
    }
    
}
