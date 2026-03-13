/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ejercicio2;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("De forma normal");
        System.out.println("");
        
        Profesor prof1 = new Profesor("Ciencias", "Mateo");
        Alumno alum1 = new Alumno("Alex",2);
        prof1.Saludar();
        alum1.Saludar();
        
        System.out.println("");
        System.out.println(" ___________POLIIMORFISMO______________");
        Persona prof2= new Profesor("Filosofia", "Dorophin");
        Persona alum2 = new Alumno("Gabriel", 3);
        System.out.println(prof2);
        System.out.println(alum2);
    }
    
}
