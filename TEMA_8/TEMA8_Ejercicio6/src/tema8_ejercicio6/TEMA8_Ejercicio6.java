/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema8_ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA8_Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Preguntamos cuantos empleados quiere crear
        System.out.print("Cuantos empleados desea registrar? ");
        int numEmpleados = entrada.nextInt();

        // Creamos el array de empleados
        Empleado[] empleados = new Empleado[numEmpleados];

        inicializarArray(empleados);
        crearEmpleado(empleados);
        mostrarSueldos(empleados);
    }
    // Metodo para pedir los datos de los empleados

    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();

    }

    public static int pedirNum() {
        Scanner entrada = new Scanner(System.in);

        return entrada.nextInt();
    }

    public static void pedirTarifa(Empleado empleados[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Tarifa por hora del empleado: ");
        empleados[0].setTarifaPorHora(entrada.nextFloat());
    }

    public static void inicializarArray(Empleado empleados[]) {
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = new Empleado();
        }
    }

    //crear empleado
    public static void crearEmpleado(Empleado empleados[]) {
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("---- EMPLEADO " + (i+1) + " ----");
            System.out.println("Dime el nombre del empleado: ");
            empleados[i].setNombre(pedirString());

            System.out.println("Dime cuantas horas trabajo el empleado");
            empleados[i].setHorasTrabajadas(pedirNum());

            System.out.println("Dime a cuanto es la tarifa del trabajador");
            empleados[i].setTarifaPorHora(pedirNum());
        }
    }

    // Metodo para mostrar los sueldos de todos los empleados
    public static void mostrarSueldos(Empleado empleados[]) {
        for(int i=0; i<empleados.length; i++){
            System.out.println("El empleado " + empleados[i] + " ha trabajado:" + empleados[i].getHorasTrabajadas() + " horas" +
                    " a una tarifa de: " + empleados[i].getTarifaPorHora() + " entonces este mes a ganado: " + (empleados[i].getHorasTrabajadas() *empleados[i].getTarifaPorHora() ));
        }
}
}
