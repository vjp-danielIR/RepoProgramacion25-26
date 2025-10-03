/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartimetica.java;

public class CArtimeticaJava {

    /**
     * @author Dany
     * Operaciones aritmeticas
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1; //declaro, la variable entera dato1
        int dato2, resultado; // declaro a la vez, dos variables enteras; dato2 y resultado
        int dato3;
        
        dato1 = 56; //asigno el valor 20 a la variable dato1
        dato2 = 82;
        dato3 = 5;
        
        //suma
        resultado = dato1 + dato2 + dato3; //guardo la suma de las dos variables en la variable resultado
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado); /*el valor de println escribe por 
        pantalla tanto el valor de las variables asi como las cadenas que estan entre comilllas para 
        unir los 5 elementos se ha utilizado el operador + */
        
        //resta
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);
        
        //producto
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);
        
        //cociente
         resultado = dato1 / dato2 / dato3;
        System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resultado);
        
       }
}