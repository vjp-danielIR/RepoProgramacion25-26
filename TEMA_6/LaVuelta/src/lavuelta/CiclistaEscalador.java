/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavuelta;

/**
 *
 * @author alumno
 */
public  class CiclistaEscalador extends Ciclista implements Pedaleable{
    //atributos propios
    private float potencia;
    private float fuerza;
    
    //cosntructores aun que sea heredado los constructores no se heredan
    //por defecto
    public CiclistaEscalador(){
    super();
    potencia=0;
    fuerza=0;
    }
    
    //parametrizado
    public CiclistaEscalador(String nombre, int energia, boolean estaEscapado, float kmMeta, int numeroBidones,float velocidad,
        int nivelHidratacion, float fuerza, float potencia){
        super(nombre, energia, estaEscapado, kmMeta, numeroBidones, velocidad, nivelHidratacion );
        this.fuerza=fuerza;
        this.potencia=potencia;       
    }
    
    //getter y setter solo de fuerza y potencia por que del resto si se heredan
    public float getFuerza(){
        return this.fuerza;
    }
    public void setFuerza(float fuerza){
        this.fuerza=fuerza;
    }
    public float getPotencia(){
        return this.potencia;
    }
    public void setPotencia(float potencia){
        this.potencia=potencia;
    }
   
    //metodo para comer si esta a mas de 20km de la meta
    //para sobre escribir los atributos de la clase heredada hay algunos de los que impedi la herencia
    @Override
    public void comer() {
        if(20 <= getKmMeta()){
            setEnergia(+30);
            System.out.println("El escalador" + getNombre() + " acaba de tomar un gel su energia ahora esta en: " + getEnergia());
        } else {
            System.out.println("no puedes comer a menos de 20km de la meta");
        }
    }
    //metodo heredado para aumentar el nivel de hidratacion
    @Override
    public void beber() {
        if(getNumeroBidones()== 0){
            cogerBidones();
            setNivelHidratacion(getNivelHidratacion()+10);
            tirarBidon();
            tirarBidon();
            System.out.println(" El escalador" + getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de: " + getNivelHidratacion());
        
        }
    }

    
    //Metodos implementados por la interfaz
    
    @Override
    public void sprintar() {
        if(getKmMeta() <= 0.3 && getEnergia() >= 20){
        setVelocidad(potencia/fuerza);
        setEnergia(getEnergia()-20);
        System.out.println("El escalador" + getNombre() + " esta esprintando a " + getVelocidad() + "km/h.");
    } else {
       System.out.println("Aun no puedes esprintar");     
       }
    }

    @Override
    public void atacar() {
     if(getEstaEscapado() == false){
        setEstaEscapado(true);
        setNivelHidratacion(getNivelHidratacion() -20);
         System.out.println("El escalador"  + getNombre() + "esta atacando");
    }
    }
    
    //metodo para recuperar energia por cada km que false antes de los 15 de la meta 
    @Override
    public float recuperar(float kmRecuperacion) {
     if(getKmMeta() > 15){
         getEnergia() ;
         System.out.println(getNombre() + " esta recuperando.");   
     }
        return getEnergia();
    } 
}
