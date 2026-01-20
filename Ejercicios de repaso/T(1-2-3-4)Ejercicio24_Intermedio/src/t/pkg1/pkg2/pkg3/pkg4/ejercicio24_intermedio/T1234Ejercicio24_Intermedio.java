/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio24_intermedio;
import java.util.Scanner; //IMPORTAMOS SCANNER
/**
 *
 * @author alumno
 */
public class T1234Ejercicio24_Intermedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
            //creamos scanner
        Scanner entrada = new Scanner(System.in);
        
            //variable
             int contador = 0; 
        // Pedir una cadena
        System.out.print("Introduce una frase: "); //pido por pantalla
        String cadena = entrada.nextLine(); //de tipo line para que coja toda la cadena 

        // Recorrer cada letra de la cadena
        for (int i = 0; i < cadena.length(); i++) { // mientras i sea menos que la cadena se sumara length es para saber cuantos caracteres hay
            char letra = Character.toLowerCase(cadena.charAt(i)); // pasar a minúscula toLowerCase si lo conocia pero no sabia como usarlo aqui si pedi ayuda

            // Comprobar si es vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') { //si es alguna de estas vocales el contador sumara 1
                contador++;
            }
        }

        System.out.println("Número de vocales: " + contador); //imprimo cuantas vocales tiene la frase introducida por el usuario
    }
}