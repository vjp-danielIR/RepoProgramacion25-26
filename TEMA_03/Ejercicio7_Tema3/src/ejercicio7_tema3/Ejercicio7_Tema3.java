/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7_tema3;
import java.util.Scanner;
/**
 *COMPROBAR SI HOY SE TRABAJA
 * @author Daniel Iglesias
 */
public class Ejercicio7_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 7 correspondiente al día de la semana: ");
        int diasemana = entrada.nextInt();
            
        boolean laborable = false; // Inicializamos por defecto

    // Fragmento que NO se puede modificar
        switch (diasemana) {
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
            laborable = true;
        break; //salgo de la parte true
        case 6: 
        case 7: 
            laborable = false;
            break; //salgo de la parte false
                }
            // Comprobamos si el día es laborable o no
            if (laborable == true ) {
            System.out.println("Hay que trabajar");
              } else{
            System.out.println("NO HAY TRABAJO!!");
            }}}
