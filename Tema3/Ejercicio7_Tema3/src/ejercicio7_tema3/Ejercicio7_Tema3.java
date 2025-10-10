/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7_tema3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio7_Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 7 correspondiente al día de la semana: ");
        int diasemana = entrada.nextInt();

        boolean laborable;

        // Fragmento que NO se puede modificar:
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                break;
            case 6:
            case 7:
                laborable = false;
                break;
            default:
                laborable = false;
                break;
        }
    }
    
}
