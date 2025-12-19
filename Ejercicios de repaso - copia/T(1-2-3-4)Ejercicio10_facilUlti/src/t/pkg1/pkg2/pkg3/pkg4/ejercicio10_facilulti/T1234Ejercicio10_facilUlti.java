/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t.pkg1.pkg2.pkg3.pkg4.ejercicio10_facilulti;

/**
 *
 * @author daniel
 */
public class T1234Ejercicio10_facilUlti {

    /**
     * @param args the command line arguments
     * 
     *  Crea un método que reciba un número entero por parámetro y lo invierta (por ejemplo, 1234 será 4321).
     */
    public static void main(String[] args) {
        String num= "6789"; //variable
        reves(num); //se la pasamos al metodo
    }
    public static void reves(String num){ //se me ocurrio que si lo snumeros los hacia de tipo string si sabia como usar lenght y charAt fue por tirar un triple 
      for (int i = num.length() - 1; i >= 0; i--) { // i  es num.x  - 1 para empezar por el ultimo caracter si i es mayor o igual a 0 se resta 
        System.out.print(num.charAt(i)); //imprimimos  cada vez que reste 
    } //es decir si empezamos por atras en este caso hay 4 numeros pero empieza desde 0 y yo le he dicho que empieze por 3 va imprimiendo cada caracter y le resta uno 
        
    }
}
