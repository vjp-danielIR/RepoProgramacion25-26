/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio19;

/**
 *
 * @author danie
 */
public class Test {
 private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;
    
  
        //constructor
     public Test(Empleado emp1, Empleado emp2, Empleado emp3) {
        this.empleado1 = emp1;
        this.empleado2 = emp2;
        this.empleado3 = emp3;
    }
    
     //GETTER Y SETTER
    public Empleado getEmpleado1() {
        return empleado1;
    }
    
    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }
    
    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleado getEmpleado3() {
        return empleado3;
    }
    
    public void setEmpleado3(Empleado empleado3) {
        this.empleado3 = empleado3;
    }
    
    // Metodo que muestra toda la información de un empleado con su sueldo calculado ademas de la tarifa y horas trabajadas
    public void mostrarSueldoEmpleado(Empleado empleado) {
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Horas trabajadas: " + empleado.getHorasTrabajadas() + " horas");
        System.out.println("Tarifa por hora: " + empleado.getTarifaPorHora() + " €");
        System.out.println("Sueldo bruto: " + empleado.calcularSueldoBruto() + " €");
    }
    
    // Este es el método principal que calcula y muestra los sueldos de los 3 empleados
    public void determinarSueldos() {
        System.out.println("Calculo de sueldos");
        mostrarSueldoEmpleado(empleado1);
        mostrarSueldoEmpleado(empleado2);
        mostrarSueldoEmpleado(empleado3);
    }
}