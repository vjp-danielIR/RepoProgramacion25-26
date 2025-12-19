/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio18_medio;
import java.util.Scanner; //importamos paquete
/**
 *
 * @author daniel
 */
public class T1234Ejercicio18_Medio {

    /**
     * 
     * 
     *  Crea una constante que guarde una contraseña alfanumérica. Luego, crea un método que pida una contraseña al usuario y compruebe si
     * coincide con la guardada en la constante. Si coincide, el método devuelve true y si no, devuelve false.
     */
    
        public static final int contaseña= 741852; //constante tipo static para que la pueda usar el metodo 
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in); //creamos el scanner
        System.out.println("Dime la contraseña"); //pedimos por pantalla
        int contra=entrada.nextInt(); //lo guardamos
      
        
        seguridad(contra); //respuesta del usuario se la paso al metodo
        
    }
    public static boolean seguridad(int contra){ //metodo que recibe por parametros
        if(contaseña == contra){ //si la contraseña es igual a la respuesta del usuario 
          
            return true; //devuelve true
        }else{ //si no 
          
            return false; //devuelve false 
        }
      
    }
}
