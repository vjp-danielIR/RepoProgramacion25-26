/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio5_facil;

/**
 *
 * @author daniel
 */
public class T1234Ejercicio5_facil {

    /**
     * @param args the command line arguments
     * 
     *  Crea un método que reciba un número entero por parámetro y devuelva true si el número es múltiplo de 5.
     */
    public static void main(String[] args) {
        //variables
        int num1= 2;
        System.out.println(" el numero" + num1  + " ¿es multiplo de 5?: " + multiplos(num1)); //imprimimos si es true o flase si es multiplo de 5
    }
    //metodo que devuelve true o false si un numero es multiplo de 5
    public static boolean multiplos(int num1){
        boolean resultado = num1 % 5 == 0; // % es apra ver si el resto es igual a 0
        return resultado;
    }
}
