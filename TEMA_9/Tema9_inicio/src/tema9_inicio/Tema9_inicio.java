/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9_inicio;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Tema9_inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Los String: INMUTABLES");

        String nombre = "Pepe";

        String nombreMayus = nombre.toUpperCase();
        System.out.println(" HasCode de nombreMayus= " + nombreMayus.hashCode());
        System.out.println(" HasCode de nombre=" + nombre.hashCode());

        System.out.println("METODOS DE LA CLASE STRIGN");

        //COMPARAR CADENAS
        System.out.println("cadena1.equals(cadena2)");
        System.out.println(nombre.equals(nombreMayus));
        System.out.println("cadena1.equalsIgnoreCase(cadena2)");
        System.out.println(nombre.equalsIgnoreCase(nombreMayus));

        /*compara candenas alfabeticamente
           si es mayor que 0 la primera cadena es mayor
                   si me da 0 son igual
                           si me dan positivo la 2 cadena es mayor*/
        System.out.println("cadena1.compareTo(cadena2)");
        System.out.println(nombre.compareTo(nombreMayus));

         System.out.println("cadena1.compareToIgnoreCase(cadena2)");
        System.out.println(nombre.compareToIgnoreCase(nombreMayus));
        
        //convertir cadena algo que no lo es
        System.out.println("String.valueOf(dato)");
        
       int num= 20;
        System.out.println(num + 2);
        System.out.println("edad como string = " + String.valueOf(num) + 2);
        
        //convertir cadena en un array
        System.out.println("cande.toCharArray()");
        System.out.println("");
        char[] arrayNombre = nombre.toCharArray();
        
        System.out.println(Arrays.toString(arrayNombre));
        
        //la longitud de una cadena
        System.out.println("cadena.length()");
        System.out.println(nombre.length());
        
        //concatenar 2 cadenas
        System.out.println("cadena.concat(cadena2)");
        System.out.println(nombre.concat(nombreMayus));
        
            
        //extraer una subcadena de la cadena original
        System.out.println("cadena.subString(desdeIncluido, hastaSinIncluir)");
        System.out.println(nombre.substring(0, 2));
        
        
        //obtener el caracter  del indice indicado
        System.out.println("cadena.charAt(indice)");
        System.out.println(nombre.charAt(0));
       
        //obtener el indice del caracter o subcadena que le pasemos
        System.out.println("cadena.indexOf(subcadena)");
        System.out.println("Indice de P: " + nombre.indexOf("P"));
        System.out.println("Indice de pe: " + nombre.indexOf("pe")); //me da el indice en el que empieza 
        //si no tiene la palabra salda negativo
        
        System.out.println("indice de 'e' a partir del indice 2");
        System.out.println(nombre.indexOf("e" , 2));
        
        System.out.println("");
        
        System.out.println("ultimo indice de 'e' ");
        System.out.println(nombre.lastIndexOf("e"));
        
        //comprobar si una cadena empieza o termina por una subcadena indicada
        System.out.println(" cadena.strarWith(subcadena) o cadena.endWith(subcadena)  ");
        System.out.println("nombre empieza por pe:"+ nombre.startsWith("pe"));
        
        
        //reemplaza todas las  concurrencias por otro
        System.out.println("cadena.replace(caracter1 'e', caracter2'u')");
        
        //remplazar una expresion regular 
        System.out.println("cadena.replaceAll(regEx, caracter2)");
        String numeroCuenta= "ES222034 3403480";
        System.out.println(numeroCuenta.replaceAll("\\d", "*"  ));
         System.out.println(numeroCuenta.replace("\\d", "*"  ));      
         
         
         System.out.println("");

         
         //convertir de mayusculas a minusculas
         System.out.println("cadena.toUpperCase y cadena.toLoweCase");
         System.out.println(nombre.toLowerCase());
         System.out.println(nombre.toUpperCase());
         
         
         //dividir un String por el patron que le pasemos por parametro
         System.out.println("cadena.split(patron)");
         String[] n = numeroCuenta.split("");
         System.out.println("Arrays.toString(n)");


    }

}
