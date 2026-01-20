/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio3;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int[] vector=new int[longitud()];
            numAleatorio(vector);
            mostrarVector(vector);

    }
    //metodo para pedir por pantalla la longitud del array 
    public static int longitud(){
    Scanner entrada=new Scanner(System.in);
    int longitud=0;
    do{
        System.out.println("Introduce la longitud del vector:");
        try{
        longitud=entrada.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("valor no valido");
        }
        
        if(longitud<1){
            System.out.println("la longitud del vector tiene que ser mayor que cero");
        }
    }while(longitud<1);
            return longitud;
    }
    //metodo para poner numeros aleatorios del 1 al 7
    public static void numAleatorio(int vector[]){

        for(int i=0; i<vector.length;i++){
        vector[i]=(int) (Math.random() * (7-1) +1);
        }
    }
    //metodo para mostrar todas las partes del array
    public static void mostrarVector(int vector[]){
    int i;
        System.out.println("VECTOR");
        for(i=0; i<vector.length;i++){
            System.out.println("el valor guardado para la posicion" + i + " es: " + vector[i]);
    }
    }
}
