/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio3;

/**
 *
 * @author alumno
 */
public class Rueda {
    private String material;
    private String pulgadas;
    
    
    //constructores
    public Rueda(){
    this.material="";
    this.pulgadas="";
    }
    //parametrizado
    public Rueda(String material, String pulgadas){
    this.material=material;
    this.pulgadas=pulgadas;
    
    }
    
    //getter y setter
    public String getMaterial(){
    return this.material;
    }
    public void setMaterial(String material){
    this.material=material;
    }
    public String getPulgada(){
    return this.pulgadas;
    }
    public void setPulgadas(String pulgadas){
    this.pulgadas=pulgadas;
    }
    
    @Override
    public String toString(){
    return "La rueda esta hecha de: " + this.material + " y tiene: " + this.pulgadas + " pulgadas";
    }
    }