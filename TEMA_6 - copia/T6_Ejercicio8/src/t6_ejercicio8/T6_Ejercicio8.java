/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ejercicio8;

/**
 *
 * @author alumno
 */

public class T6_Ejercicio8 {
    
     /**
     * @param args the command line arguments
     * 
     */
    
     public static void main(String[] args) {
         
         Vehiculo coche = new Coche(80, false);
        Vehiculo moto = new Moto(60, false);
        
        
        //EL RESULTADO CAMBIA SEGUN EL PRIMERO es decir si el primero es la moto se imprimira lo de la moto si el primero es el coche se imprimira procesar vehiculo en el de coche
         System.out.println("Procesando moto");
        procesarVehiculo(moto);
        System.out.println("Procesando coche");
        procesarVehiculo(coche);

        
    }

    public static void procesarVehiculo(Vehiculo vehiculo) {

        // Movimiento inicial (polimorfismo)
        vehiculo.mostrarMovimiento();

        // Comportamiento dependiendo del tipo de objeto
        if (vehiculo instanceof Coche) {
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            coche.mostrarMovimiento();

        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            moto.mostrarMovimiento();
        }
    }
}