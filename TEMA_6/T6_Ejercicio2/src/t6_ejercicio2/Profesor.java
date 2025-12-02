/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio2;

/**
 *
 * @author alumno
 * hereda de Persona y tiene el atributo
especialidad) 
 */
public class Profesor extends Persona{
    
    //atributo
    private String especialidad;
    //constructores
    public Profesor(){
    super();
    this.especialidad="";
    
    }
    //parametrizado
    public Profesor(String especialidad, String nombre){
    super(nombre);
    this.especialidad=especialidad;
    }
    
    //getter y setter solo de especialidad 
    public String getEspecialidad(){
    return this.especialidad;
    }
    public void setEspecialidad(String especialidad){
    this.especialidad=especialidad;
            }
    
    
    //metodo saludar
    @Override
    public void Saludar(){
        System.out.println("Hola soy el profesor: " + super.getNombre() + " y me especializo en: " + this.especialidad);
    }
    
}
