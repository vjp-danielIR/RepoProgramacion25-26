/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T4_MetodosEstaticos;

/**
 *
 * 
 * 
 * @author alumno
 */
public class Calculadora {

    /**
     * Método que devuelve la suma de dos números pasados por parámetros.
     *
     * @author alumno
     * @param num1
     * @param num2
     * @return 
     */
    
    //este metodo suma 2 numeros
    public static int Suma(int num1, int num2){
        int resultado= num1 + num2;
        return resultado;
    }

    //este metodo resta los 2 numeros
    public static int Resta(int num1, int num2){
         int resultado= num1 - num2;
        return resultado;
    }
    //este metodo multiplica dos numeros
         public static int Multiplicacion(int num1, int num2){
             int resultado= num1 * num2;
        return resultado;
      }     
         //este metodo divide 2 numeros
         public static int Division(int num1, int num2){
        int resultado= num1 / num2;
        return resultado;
     }
         //este metodo calcula la raiz cuadrada de un numero
          public static double RaizCuadrada(double num){
        double resultado = Math.sqrt(num);
        return resultado;
    }

   //este metodo sirve para elevar un número a una potencia.
    public static double Potencia(double base, double exponente){
        double resultado = Math.pow(base, exponente);
        return resultado;
    }

   //este metodo calcula el logaritmo de un número
    public static double logaritmo(double num){
        double resultado = Math.log(num);
        return resultado;
    }

    //escoge el numero mayor 
    public static double Maximo(double num1, double num2){
        double resultado = Math.max(num1, num2);
        return resultado;
    }

    //elige el numero mas pequeño
    public static double Minimo(double num1, double num2){
        double resultado = Math.min(num1, num2);
        return resultado;
    }

   //escoge un redondeo random 
    public static double RedondeoAlAlza(double num){
        double resultado = Math.ceil(num);
        return resultado;
    }

    //metodo para redondear hacia abajo
    public static double RedondeoABaja(double num){
        double resultado = Math.floor(num);
        return resultado;
    }
}