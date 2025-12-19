/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio5;

/**
 *
 * @author alumno
 * 
 * 
 */
public class Mamifero {
    //atributos privador
    private int edad;
    private String color;
    private String sexo;
    
    
    //constructores
    //por defecto
    public Mamifero(){
    edad=0;
    color="";
    sexo="";
    
    }
    //parametrizado
    public Mamifero(int edad, String color, String sexo){
    this.edad=edad;
    this.color=color;
    this.sexo=sexo;       
    }
    //getter(obtener) y setter(establecer)
    
    public int getEdad(){
    return this.edad;
    }
    public void setEdad(int edad){
    this.edad=edad;
    }
    
    public String getColor(){
    return this.color;
    }
    public void setColor(String color){
    this.color=color;
    }
    
    public String getSexo(){
    return this.sexo;
    }
   public void setSexo(String sexo){
   this.sexo=sexo;
   }
   //mostrar todo sobre le padre
    @Override
   public String toString(){
   return " El mamifero tiene una edad de: " + this.edad + " ademas es de color: " + this.color + "y es del sexo: " + this.sexo; 
   }
    
    
    
    
}
