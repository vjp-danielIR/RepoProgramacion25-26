/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio9_facil;

/**
 *
 * @author daniel
 */
public class T1234Ejercicio9_facil {

    /**
     * @param args the command line arguments
     * 
     * 
     *  Crea un método que reciba por parámetro un número entero y lo divida en cifras (por ejemplo, 1234 se convertirá en 1 - 2 - 3 - 4).
     */
    
    public static void main(String[] args) {
        //variables
        int num=273;
        cifras(num);
        
    }
    public static void cifras(int num){
        if (num < 10) {
        System.out.print(num);// si el numero es menor que 10 lo imprime directamente
        
        }else{ cifras(num / 10); //se dividira entre 10 hasta que salga 1 sola cifra se que se puede hacer con lengh y charAt pero no se la sintasys
         System.out.print(" - " + (num % 10)); //imprimimos un - cada resto de la division
       }
  }
}

