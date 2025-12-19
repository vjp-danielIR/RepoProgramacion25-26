/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ejercicio6;

/**
 *
 * @author danie
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("=== PRUEBAS DIRECTAS ===\n");
        //creo un libro y una persona
        Libro libro = new Libro("El Quijote", "Cervantes", "Novela");
        Persona persona = new Persona("Juan", "Garcia", "Juanito");
        
        //empiezo con libro mostrando los metodos 
        System.out.println("--- Libro ---");
        System.out.println("Concatenar: " + libro.concatenarTodo()); //este imprime los "atributos" con un # en medio
        System.out.println("Iniciales: " + libro.obtenerIniciales()); //este usaba charAt(0) para imprimir las iniciales 
        libro.contarVocales(); //este usaba el .lengh
        System.out.println("Mas larga: " + libro.obtenerCadenaMasLarga()); // este guardaba un atributo es una variable y iba comparando y si la otra era mas larga la variable cambia 
        System.out.println("Buscar 'Novela': " + libro.buscarCadena("Novela")); //este compara si novela es lo mismo que novela si despues de buscar cadena pongo serie seria false
        
        System.out.println("");
         
        //y lo mismo con persona lo unico que cambia son los atributos
        System.out.println("--- Persona ---");
        System.out.println("Concatenar: " + persona.concatenarTodo());
        System.out.println("Iniciales: " + persona.obtenerIniciales());
        persona.contarVocales();
        System.out.println("Mas larga: " + persona.obtenerCadenaMasLarga());
        System.out.println("Buscar 'Juan': " + persona.buscarCadena("Juan"));
        
        System.out.println("\n=== PRUEBAS CON POLIMORFISMO ===\n");
        
        //segun lo que entiendo en el polimorfismo lo unico que cambia en la sintasis es que llamo al padre 
        //o en este caso a la interfaz y luego le digo que quiero crear 
        Transformable libro2 = new Libro("Cien anos de soledad", "Garcia Marquez", "Realismo magico");
        Transformable persona2 = new Persona("Maria", "Rodriguez", "Mari");
        
        System.out.println("--- Libro con polimorfismo ---");
        System.out.println("Concatenar: " + libro2.concatenarTodo());
        System.out.println("Iniciales: " + libro2.obtenerIniciales());
        libro2.contarVocales();
        System.out.println("Mas larga: " + libro2.obtenerCadenaMasLarga());
        
        System.out.println("\n--- Persona con polimorfismo ---");
        System.out.println("Concatenar: " + persona2.concatenarTodo());
        System.out.println("Iniciales: " + persona2.obtenerIniciales());
        persona2.contarVocales();
        System.out.println("Mas larga: " + persona2.obtenerCadenaMasLarga());
    }
}