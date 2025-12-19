/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio27_intermedio;

/**
 *
 * @author alumno
 */
public class T1234Ejercicio27_Intermedio {

    /**
     * @param args the command line arguments
     * 
     *  Genera aleatorios hasta que salga un múltiplo de 10; muestra cuántos generó.
     */
    public static void main(String[] args) {
       int numAleatorio;
                               
     for(int i = 0; i<=200; i++){
      numAleatorio = (int) (Math.random() * (200 + 1 - 2) + 2); //he pueso 200 por poner un tope y 2por poner un inicio 
      if(10 % numAleatorio ==0){
          System.out.println(numAleatorio + " es multiplo de 10" );
          break;
      }else {
          System.out.println(numAleatorio + " no es multiplo de 10");
      }
     }
    }
    
}
