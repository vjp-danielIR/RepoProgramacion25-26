/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio19_medio;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class T1234Ejercicio19_Medio {

    /**
     * 
     * 
     * Mejora el ejercicio anterior dando 3 intentos al usuario para escribir la contraseña correctamente. 
     * En cada intento, le mostrarás un mensaje de acierto o error y el número de intentos restantes.


     */
        public static final int contaseña= 741852; //constante tipo static para que la pueda usar el metodo 
    public static void main(String[] args) {
        //variables
         int intentos = 3; // número de intentos permitidos
        boolean acierto = false;

          Scanner entrada= new Scanner(System.in); //creamos el scanner
       
    
        while (intentos > 0) { //si intentos es mayor que 0 
            System.out.print("Dime la contraseña: "); //pido por pantalla 
             int contra = entrada.nextInt(); //lo guardo

            if (seguridad(contra)) { //compruebo si es la correcta
                System.out.println("Has acertado"); //si lo es vendra aqui
                acierto = true; //  y pondremos aciertos a true 
            } else { //si no 
                intentos--; // restamos un intento
                System.out.println("has fallado te quedan " + intentos + " intentos"); //mostraremos los intentos que le quedan
            }
        }

        if (!acierto) {
            System.out.println("se han acabado los intentos");
        }
    }
 
        public static boolean seguridad(int contra){ //metodo que recibe por parametros
            if(contaseña == contra){ //si la contraseña es igual a la respuesta del usuario 
          
                return true; //devuelve true
            }else{ //si no 
          
             return false; //devuelve false 
        }
      
}
}