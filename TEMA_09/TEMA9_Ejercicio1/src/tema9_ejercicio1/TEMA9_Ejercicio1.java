/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9_ejercicio1;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class TEMA9_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nom = "joseMiguel";

        //esto lo convierte en mayuscula
        String nomMayus = nom.toUpperCase();
        System.out.println(nomMayus);

        //hasCode convierte el texto en numeros por el codigo ASCII es decir cada letra tiene su numero
        System.out.println(nom.hashCode());

        //equals y equalsIgnoreCase compararn 2 cadenas la primera tiene en cuenta todo y la segunda ignora las mayusculas
        System.out.println(nom.equals(nomMayus));
        System.out.println("");
        System.out.println(nom.equalsIgnoreCase(nomMayus));

        //compareTo compara la longitud de las 2 cadenas si dan 0 es por que la primera cadena es mayor o son iguales si da positivo otra cadena es mayo
        System.out.println(nom.compareTo(nomMayus));
        //con IgnoreCase ignora la diferencia de mayusculas
        System.out.println(nom.compareToIgnoreCase(nomMayus));

        //valuesOf convierte cambia el tipo de dato a String
        int num = 44;
        System.out.println("edad como string = " + String.valueOf(num) + 8); //en caso de añadirle otra cosa despues se le añadira como String y no se le sumara al numero original

        System.out.println("");

        //convierte cadenas en Arrays
        String cadena = "esto es una cadena";
        char[] cadenaArray = cadena.toCharArray();

        System.out.println(Arrays.toString(cadenaArray));

        //mide la longitud de una cadna 
        System.out.println(nom.length());

        //concatena 2 cadenas
        System.out.println(nom.concat(nomMayus));

        //extrae una subcadena de la cadena original
        System.out.println(nom.substring(0, 2));

        //obtener el caracter  del indice indicado
        System.out.println(nom.charAt(0));

        System.out.println("");
        //obtener el indice del caracter o subcadena que le pasemos
       //si no tiene la palabra salda negativo
        System.out.println("Indice de P: " + nom.indexOf("J"));
        System.out.println("Indice de pe: " + nom.indexOf("guel")); //devuelve el indicde en  el que empieza esas palabras

       
        System.out.println("");

      
        //comprobar si una cadena empieza o termina por una subcadena indicada
        System.out.println("nombre empieza por pe:" + nom.startsWith("Jo"));
        
        //reemplaza todas las  concurrencias por otro
        //remplazar una expresion regular 
        System.out.println("cadena.replaceAll(regEx, caracter2)");
        String numeroCuenta = "ES12 1234 1234 12 1234567890";
        System.out.println(numeroCuenta.replaceAll("\\d", "*"));
         System.out.println(numeroCuenta.replace("\\d", "*"));

        System.out.println("");

        //convertir de mayusculas a minusculas
        System.out.println(nom.toLowerCase());
        System.out.println(nom.toUpperCase());

        //dividir un String por el patron que le pasemos por parametro
       
        String[] a = numeroCuenta.split("");
        System.out.println("Arrays.toString(n)");
    }

}
