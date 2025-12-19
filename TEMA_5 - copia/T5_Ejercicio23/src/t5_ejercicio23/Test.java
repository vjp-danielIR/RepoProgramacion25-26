/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio23;

/**
 *
 * @author danie
 */
public class Test {
 public static void main(String[] args) {
         
        // Creamos un taxi 
        Taxi taxi1 = new Taxi("1234ABC", "Toyota mk5", 120, "LIC-001");
        
        // Creamos un autobús 
        Autobus autobus1 = new Autobus("5678DEF", "Nissan clase1", 180, 55);
        
        // Creamos un segundo taxi usando el constructor por defecto
        Taxi taxi2 = new Taxi();
        
        // Le asignamos valores usando los setters
        taxi2.setMatricula("9012GHI");
        taxi2.setModelo("Seat León");
        taxi2.setPotenciaCV(110);
        taxi2.setNumeroLicencia("LIC-002");
        
        // Creamos un segundo autobús por defecto
        Autobus autobus2 = new Autobus();
        
        // Y le asignamos valores usando los setters
        autobus2.setMatricula("3456JKL");
        autobus2.setModelo("Bmw M3");
        autobus2.setPotenciaCV(350);
        autobus2.setNumeroPlazas(60);
        
        // Mostramos la información de todos los vehículos
        System.out.println("Informacion de los vehiculos");
           //del taxi
        System.out.println( taxi1.toString());
        
            //del autobus
        System.out.println(autobus1.toString());
            //del seguno taxi
        
        System.out.println(taxi2.toString());
        
        //del segundo autobus
        System.out.println(autobus2.toString());
    }
}