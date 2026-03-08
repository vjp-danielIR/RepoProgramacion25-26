/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9_ejercicio5;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class TEMA9_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] posiciones = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "séptimo"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String diaIntroducido = scanner.nextLine().trim();

        boolean encontrado = false;

        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(diaIntroducido)) {
                System.out.println("Es el " + posiciones[i] + " día de la semana.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El día introducido no es válido.");
        }
    }
}
