/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavuelta;

/**
 *
 * @author alumno
 */
public abstract class Ciclista {
    //atributos del objeto
    private String nombre;
    private int energia; 
    private boolean estaEscapado;
    private float kmMeta;
    private int numeroBidones;
    private float velocidad;
    int nivelHidratacion;
    
    //atributo estatico para contar cilicstas creados
    public static int aumentarNumeroCiclistas= 0;
        
     
    public int mostrarNumBiciclistas(){
        return aumentarNumeroCiclistas;
    }
    //constructores 
    //por defecto
    public Ciclista(){
    nombre="";
    energia=50;
    estaEscapado=false;
    kmMeta=120;
    numeroBidones=2;
    velocidad=0;
    nivelHidratacion=50;
    aumentarNumeroCiclistas++;
    }
    
    //constructor parametrizado es decir le pasamos los atributos por parametros
    public Ciclista(String nombre, int energia, boolean estaEscapado, float kmMeta, int numeroBidones, float velocidad, int nivelHidratacion){
    this.nombre=nombre; //this es para señalar el atributo o eso entiendo y aun que aqui no sea necesario me entero mejor si lo pongo 
    this.energia=energia;
    this.estaEscapado=estaEscapado;
    this.kmMeta=kmMeta;
    this.numeroBidones=numeroBidones;
    this.velocidad=velocidad;
    this.nivelHidratacion=nivelHidratacion;
    aumentarNumeroCiclistas++;
    }
    
    //getter y setter para obtener y esytablecer
    public String getNombre(){
    return  this.nombre;
    }
    public void setNombre(String nombre){
      this.nombre=nombre;
    }
    
    
    public int getEnergia(){
        return this.energia;
    }
    public void setEnergia(int energia){
     this.energia=energia;
    }
    
    
    public boolean getEstaEscapado(){
     return this.estaEscapado;
    }
    public void setEstaEscapado(boolean estaEscapado){
     this.estaEscapado=estaEscapado;
    }
    
    
    public float getKmMeta(){
        return this.kmMeta;
    }
    public void setKmMeta(float kmMeta){
        this.kmMeta=kmMeta;
    }
    
    
    public int getNumeroBidones(){
        return this.numeroBidones;
    }
    public void setNumeroBidones(int numeroBidones){
        this.numeroBidones=numeroBidones;
    }
    
    
    public float getVelocidad(){
        return this.velocidad;
    }
    public void setVelocidad(float velocidad){
        this.velocidad=velocidad;
    }
    
    
    public int getNivelHidratacion(){
        return this.nivelHidratacion;
    }
    public void setNivelHidratacion(int nivelHidratacion){
        this.nivelHidratacion=nivelHidratacion;
    }
    
    //to String
    @Override
    public String toString(){
        return "El biciclista se llama:" + nombre + " tiene " + energia + " de energia " + " ¿esta escapado?: " + estaEscapado + 
                " ademas esta a: " + kmMeta + " km de la meta " + " ademas tiene: " + numeroBidones + " va a una velocidad de: " + velocidad + " km/h " 
                + " y esta en: "+ nivelHidratacion + " nivel de hidratacion" + " hay " + mostrarNumBiciclistas() +" ciclistas";
    }
    
    //otros metodos 

    /**
     * metodo que deja  no deja coger bidones si estas a menos de 10 km
     */
    public final void cogerBidones(){
     if(kmMeta > 10){
     numeroBidones+=2;
     } else{
         System.out.println("No puedes coger bidones a menos de 10km de la meta");
     }
     
    }
    public final void tirarBidon(){
    numeroBidones--;
    }
 
    public abstract void comer();
    public abstract void beber();
    }


