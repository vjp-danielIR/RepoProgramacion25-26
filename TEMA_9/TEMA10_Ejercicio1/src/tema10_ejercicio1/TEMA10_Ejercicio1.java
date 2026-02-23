/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio1;

import java.util.*; //asi nos ahorramos el escribir para importar el Scanner y el ArrrayList

/**
 *
 * @author alumno
 */
public class TEMA10_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //esta es el array list cada objeto persona que se crea esta dentro de aqui 
        ArrayList<Persona> personas = new ArrayList<>();
        //aqui le preguntaremos al usuario el nombre de la persona
        rellenarNombres(personas);
        //aqui mostraremos el nombre de las personas creadas
        mostrarLista(personas);
    }

    //este metodo es para preguntarle al usuario si quiere añadir a una persona y le pregunta el nombre enc asao de que si
    public static void rellenarNombres(ArrayList<Persona> personas) {
        Scanner entrada = new Scanner(System.in);
        String resp;
        //si el usuario quiere añadir a alguien
        do {
            System.out.println("¿Quieres añadir una persona? (s/n): ");
            resp = entrada.nextLine();

            if (resp.equalsIgnoreCase("s")) { //en caso de la respuesta sea s ignorando que sea mayuscula
                System.out.println("Dime el nombre de la persona: "); //le preguntaremos el nombre
                String nombre = entrada.nextLine(); // lo guardaremos
                personas.add(new Persona(nombre)); //y creaermos una nueva persona con ese nombre
            }
            //mientras el usuario ponga que s no saldremos del bucle
        } while (resp.equalsIgnoreCase("s"));
    }

    //Metodo que muestra los nombres de las personas creadas 
    public static void mostrarLista(ArrayList<Persona> personas) {
        System.out.println("\n===== LISTA DE PERSONAS =====");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i).getNombre());
        }
    }
}
