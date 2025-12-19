/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio15;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {
        // Crear 3 direcciones
        Direccion direccion1 = new Direccion("Calle Mayor", 25, "3º A", "Madrid");
        Direccion direccion2 = new Direccion("Avenida Libertad", 10, "1º B", "Barcelona");
        Direccion direccion3 = new Direccion("Plaza España", 5, "2º C", "Sevilla");
        
        // Crear 3 empleados con las direcciones
        Empleado empleado1 = new Empleado("Juan Pérez", 30000, direccion1);
        Empleado empleado2 = new Empleado("María García", 35000, direccion2);
        Empleado empleado3 = new Empleado("Carlos López", 28000, direccion3);
        
        // Mostrar los datos de cada empleado
        mostrarEmpleado(empleado1);
        mostrarEmpleado(empleado2);
        mostrarEmpleado(empleado3);
    } 
// Método para mostrar datos de empleado
    public static void mostrarEmpleado(Empleado empleado) {
        System.out.println("");
        System.out.println(empleado);
        System.out.println("");
    }
}
