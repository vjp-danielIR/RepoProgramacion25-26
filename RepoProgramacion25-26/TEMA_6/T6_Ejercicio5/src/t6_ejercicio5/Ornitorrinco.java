/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio5;

/**
 *
 * @author alumno
 */
public  class Ornitorrinco extends Mamifero implements Oviparo{
    //atributos 
    private int huevos;
    
    //Constructores
    //por defecto
    public Ornitorrinco(){
    super();
    this.huevos=0;
    }
    //parametrizado
    public Ornitorrinco(int huevos, int edad, String color,String sexo){
        super(edad,color, sexo);
        this.huevos=huevos;
        
    }
    
    //obteneer y establecer getter y setter
    public int getHuevos(){
    return this.huevos;
    }
    
    public void setHuevos(int huevos){
    this.huevos=huevos;
    }
    
        @Override
     public String obtenerMensajeOviparo(){
        return "El ornitorrinco es un mamíferoovíparo";
     }
     
        @Override
    public void ponerHuevos(){
            System.out.println("el ornitorrinco puso otro huevaso");
    huevos++;
    }
        @Override
    public void incubarHuevos(){
            System.out.println("un huevo eclosiono");
    huevos--;
    }
        @Override
    public void mostrarNumHuevos(){
        System.out.println(huevos);
    }


    
    @Override
    public String toString(){
    return " el Ornitorrinco tiene una edad de:" + super.getEdad() + " es de color: " + super.getColor() + " y es del sexo: " 
            + super.getSexo() + " y pone " + this.huevos + "huevos";
    }
}
