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
        
        dato1 = 20; //asigno el valor 20 a la variable dato1
        dato2 = 10;
        
        //suma
        resultado = dato1 + dato2; //guardo la suma de las dos variables en la variable resultado
        System.out.println(dato1 + " + " + dato2 + " = " + resultado); /*el valor de println escribe por 
        pantalla tanto el valor de las variables asi como las cadenas que estan entre comilllas para 
        unir los 5 elementos se ha utilizado el operador + */
        
        //resta
        resultado = dato1 - dato2;
        System.out.println(dato1 + " - " + dato2 + " = " + resultado);
        
        //producto
        resultado = dato1 * dato2;
        System.out.println(dato1 + " * " + dato2 + " = " + resultado);
        
        //cociente
        resultado = dato1 / dato2;
        System.out.println(dato1 + " / " + dato2 + " = " + resultado);
    }
    
}
