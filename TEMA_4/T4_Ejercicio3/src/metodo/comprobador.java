/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

/**
 *
 * @author danie
 */
public class comprobador {
    //creo mi metodo indicando que son 3 varibables los que quiero que se usen
    public static int mayor(int a, int b, int c) {
        int mayor = a;//comparo los numeros para ver cual es el mayor
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }//devuelvo el numero mayor
        return mayor;
    }
}

