/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio2;

/**
 *
 * @author alumno
 * hereda de Persona y tiene el atributo
grupo
 */
public class Alumno extends Persona {
     //atributo propio
    private int grupo;
    
    //constructoreps
    public Alumno(){
    super();
    this.grupo=0;
    }
    //parametrizadpo
    public Alumno(String nombre, int grupo){
   super(nombre);
   this.grupo=grupo;
   
    }
    //geter y settepr
    public int getGrupo(){
    return this.grupo;
            
            }
    
    //metodo saludaPr
    @Override
    public void Saludar(){
        System.out.println("hola mi nombre es" + super.getNombre() + " y soy el grupo:" + this.grupo);
    }




}