/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int a = 3, b = 6, c;
c = a/ b;

System.out.println("El valor de c es: " + c);  // imprimira un 0 por que 6 entre 3 es 0
c = a % b;
System.out.println("El valor de c es: " + c );// imprime 3 por que entre 6 y 3 la diferencia es de 3
a++;
System.out.println("El valor de a es: " + a); //imprime4 por que a es 3 y el a++ es paraa sumarle un valor
++a;
System.out.println("El valor de a es: " + a); //imprime 5 por que le esta sumando otro valor
c = ++a + b++;
System.out.println("El valor de a es: " + a); //imprime 6 por que esta imprimendo a y le ha subido otro valor
System.out.println("El valor de b es: " + b); //imprime 7 por que a imprimido b que era 6 y le a subido un valor 
System.out.println("El valor de c es: " + c); //imprime 12 es la suma de 7 +6 que se guarda en c
c = ++a + ++b;
System.out.println("El valor de a es: " + a); // imprime 7 a le sumo el valor antes y como era 6 al subirle el valor otra vez aun que se guarde en c a a se le sigue sumando una
System.out.println("El valor de b es: " + b);  //imprime 8 por que b valia 6 y se le sumo antes una y ahora otra
System.out.println("El valor de c es: " + c); //imprime 15 es el resultado de 7+8 que se guardaba en c 
    }
    
}
