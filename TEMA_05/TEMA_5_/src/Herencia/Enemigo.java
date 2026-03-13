/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author alumno
 */
public class Enemigo extends Personaje{
    private String arma;
    
    public Enemigo(){
    super();
    this.arma= "";
    }
    
    public Enemigo(int vida,String arma){
        super(vida);
        this.arma=arma;
 
    }
        public String getArma(){
        return this.arma;
        }
        public void setArma(String arma){
        this.arma=arma;
        }
        
        public void crearSoldado(){
            System.out.println("Creando soldados");
        }
        
        
        @Override
        public String toString(){
        return "El enemigo tiene " + super.getVida() + " puntos de vida  y el arma es " + this.arma ;
        }
    
    
    
    
    
    
}
