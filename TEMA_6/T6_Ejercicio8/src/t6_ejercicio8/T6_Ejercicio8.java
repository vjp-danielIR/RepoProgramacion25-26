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
     * 
     * 
     * procesarVehiculo
(Vehiculo vehiculo). Este método no devuelve nada y realiza lo siguiente:
• Muestra el movimiento del vehículo.
• Si el vehículo es un coche, enciende el aire y muestra el movimiento del coche.
• Si el vehículo es una moto, hace un caballito y muestra el movimiento de la moto.
• Posteriormente, instancia un Vehiculo de cada tipo (Coche y Moto) e invoca al método
procesarVehiculo pasándole ambos objetos.
* 
* 
* 
     */
    public static void main(String[] args) {
         
        Vehiculo coche = new Coche(80, false);
        Vehiculo moto = new Moto(60, false );

        System.out.println("Procesando coche ");
        procesarVehiculo(coche);

        System.out.println("Procesando moto");
        procesarVehiculo(moto);
        
    /**
     *
     * @param vehiculo
     */
    public void procesarVehiculo(Vehiculo vehiculo, Vehiculo Moto, Vehiculo Coche) {
        // Mostrar movimiento inicial pomorfismo 
        vehiculo.mostrarMovimiento();
        

        // Acciones específicas
        if (Coche == vehiculo) {
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            coche.mostrarMovimiento();

        } else if (vehiculo == Moto) {
            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            moto.mostrarMovimiento();
        }
    
}}