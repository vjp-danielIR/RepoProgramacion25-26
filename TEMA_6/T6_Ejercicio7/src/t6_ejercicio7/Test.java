/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ejercicio7;

/**
 *
 * @author danie
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("PRUEBA CON TELEVISOR");
        
        Televisor tv = new Televisor();
        System.out.println("");
        System.out.println(tv);
        tv.encender();
        System.out.println(tv);
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        System.out.println("Volumen actual: " + tv.getVolumen());
        tv.cambiarCanal(5);
        tv.bajarVolumen();
        tv.apagar();
        System.out.println(tv);
        
        System.out.println("");
        System.out.println("PRUEBA CON RADIO");
        
        Radio radio = new Radio();
        
        System.out.println(radio);
        radio.encender();
        System.out.println(radio);
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        System.out.println("Volumen actual: " + radio.getVolumen());
        radio.cambiarCanal(95.5f);
        radio.bajarVolumen();
        radio.apagar();
        System.out.println(radio);
    }
}
