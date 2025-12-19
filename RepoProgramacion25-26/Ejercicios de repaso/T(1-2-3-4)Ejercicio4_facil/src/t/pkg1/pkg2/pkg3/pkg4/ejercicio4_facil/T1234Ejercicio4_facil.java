/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio4_facil;

/**
 *
 * @author daniel
 */
public class T1234Ejercicio4_facil {

    /**
     * @param args the command line arguments
     * 
     * Crea un método que reciba dos números enteros por parámetro y devuelva la suma de ellos. Luego, imprime el resultado por pantalla en el método main
     */
    public static void main(String[] args) {
       int num1 =3;
       int num2 = 8;//variables 
       
        System.out.println(" la suma es igual a: " + suma(num1, num2) ); //mostrar el resultado de la suma
        
    }
    
    /**
     *
     * @param num1
     * @param num2
     * @return
     * metodo para sumar 2 numeros
     */
    public static int suma(int num1, int num2){ //sse hace fuera del main
       int resultado= num1+ num2; //en la variable resultado sumo los dos numeros
       return resultado; //devuelvo el resultado de la suma
    }
    
}
