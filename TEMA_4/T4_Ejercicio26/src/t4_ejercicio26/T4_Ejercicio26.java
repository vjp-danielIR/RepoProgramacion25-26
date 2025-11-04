/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class T4_Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //metodo que pide por pantalla 
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el numero: ");
        num = entrada.nextInt();
        if(esPrimo(num)){//se lo paso al metodo esPrimo para comprobar si es primo
            System.out.println("Es primo");//si el metodo me devuelve un true se imprimira esto
        }else{
            System.out.println("No es primo");//si es false se imprime esto
    }}
    
    public static boolean esPrimo(int num){
        //metodo que comprueba si es primo
        //inicializamos las variables
    int i = 2;
        boolean encontrado = false, primo = false;
        //compruebo
    while( i < num && !encontrado){
    if (num % i == 0){//si es primo entrara aqui
        encontrado = true;
        } else{// si no lo es sumara 1 a la i
        i++;
    }//si las dos sentencias se cumplen entrara aqui
    if(encontrado == false){
    primo = true;
    }
    } return primo;
    }}