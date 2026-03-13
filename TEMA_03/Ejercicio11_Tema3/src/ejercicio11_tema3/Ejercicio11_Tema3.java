/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11_tema3;

/**
 *  Imprimir Hola en bucle 
 * @author Daniel Iglesias
 */
public class Ejercicio11_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Usamos un bucle for para repetir 6 veces
     // int loop = 1:
     // while (loop<=6){
       // System.out.println("hola " + loop);
        //loop++
               // } me gusto mas el de el 
               //mientras que el bucle for no cumpla hasya las 6 veces cada hola tendra unn "-" y si supera los 6 imprimira un " -" 
      for (int i = 1; i <= 6; i++) {
            // Mostramos "Hola" seguido del número
            System.out.print("Hola" + i);
            
            // Añadimos " - " entre los mensajes, excepto después del último
            if (i < 6) {
                System.out.print(" - ");
            } else {
                System.out.print(" -"); // Al final también hay un guion según el ejemplo
            }
        }
    }
}