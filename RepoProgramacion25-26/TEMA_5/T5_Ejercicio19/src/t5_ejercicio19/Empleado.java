/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio19;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Empleado {
     private String nombre;
    private int horasTrabajadas;
    private double tarifaPorHora;
    
    // Constructor sin parámetros por si queremos crear un empleado vacío
    public Empleado() {
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaPorHora = 0;
    }
    
    // Constructor que le pide la información al usuario directamente
    public Empleado(Scanner entrada) {
        System.out.print("Introduce el nombre del empleado: ");
        this.nombre = entrada.nextLine();
        
        System.out.print("Introduce las horas trabajadas: ");
        this.horasTrabajadas = entrada.nextInt();
        
        System.out.print("Introduce la tarifa por hora: ");
        this.tarifaPorHora = entrada.nextDouble();
       
        // Limpiamos el buffer del scanner
        entrada.nextLine(); 
        System.out.println();
    }
    
    // Constructor con todos los datos por si queremos crear el empleado de golpe
    public Empleado(String nombre, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    
    public String getNombre() {
        return nombre;
    }
    
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
 
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
   
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
    
    
    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
    
    // Este método calcula el sueldo según las horas trabajadas
    public double calcularSueldoBruto() {
        double sueldoBruto = 0;
        
        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaPorHora;
        } else {
            double sueldoNormal = 40 * tarifaPorHora;
            
            // Las horas extra se pagan mas asi que puse del 100% de su salario un 50% de mas el 1.5 es de 150%
            int horasExtra = horasTrabajadas - 40;
            double sueldoExtra = horasExtra * (tarifaPorHora * 1.5);
           
            sueldoBruto = sueldoNormal + sueldoExtra;
        }
        
        return sueldoBruto;
    }
}