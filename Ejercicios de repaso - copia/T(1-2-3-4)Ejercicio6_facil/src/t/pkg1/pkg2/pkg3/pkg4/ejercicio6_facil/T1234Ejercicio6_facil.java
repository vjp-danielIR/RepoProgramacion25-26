/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio6_facil;

/**
 *
 * @author daniel
 */
public class T1234Ejercicio6_facil {

    /**
     * @param args the command line arguments
     * 
     * Crea un método que reciba dos números enteros por parámetro y devuelva true si el primer número es divisible por el segundo.
     */
    public static void main(String[] args) {
        //variable
        int num1 =3;
        int num2=6;
        
        //si divisible devuelve ture ira al primero al num1 si es divisible con num2
        //si devuelve false ira al else que no es divisible 
        if(divisible(num1,num2)){
            System.out.println(num1 + " es divisible por " + num2);
        } else {
             System.out.println(num1 + " no es divisible por " + num2);
        }
        
    }
    //metodo que devuelve true o false si num1 es divisible entre num2 
    public static boolean divisible(int num1, int num2){
        boolean resultado = num1 % num2 == 0;
        return resultado;
    }
}
