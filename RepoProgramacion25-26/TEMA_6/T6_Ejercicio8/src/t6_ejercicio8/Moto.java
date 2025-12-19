/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio8;

/**
 *
 * @author alumno
 * 
  
 */
public class Moto extends Vehiculo{
    //atributo propio
    private boolean haciendoCaballito;
    
    //constructores
    public Moto(){
    super();
    haciendoCaballito=false;
    }
    
    
    public Moto(int velocidad, boolean haciendoCaballito){
    super(velocidad);
    this.haciendoCaballito=haciendoCaballito;
    }
    
    //no necesito get y set por que lo hereda de vehiculo lo unico que no se hereda son los constructores
    public void hacerCaballito(){
     if(haciendoCaballito== false){
           haciendoCaballito=true;
           System.out.println("La moto está haciendo un caballito. La velocidad aumenta");
           velocidad+=15;
       } else{
           System.out.println("La moto ya está haciendo un caballito");
       }
    }
    
    
    @Override
    public void mostrarMovimiento() {
       System.out.println("La moto esta circulando a:  " + super.getVelocidad() + " km/h");  
       
       
    }
    
    
    
    
    
}