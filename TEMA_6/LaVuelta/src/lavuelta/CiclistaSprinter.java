/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavuelta;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable {
    //atributos propios
    private float aceleracion;
    
    //constructores
    //por defecto
    public CiclistaSprinter(){
    super();
    aceleracion=0;
    }
    
    //parametrizado
    public CiclistaSprinter(String nombre, int energia, boolean estaEscapado, float kmMeta, int numeroBidones,float velocidad,
        int nivelHidratacion, float aceleracion){
        super(nombre, energia, estaEscapado, kmMeta, numeroBidones, velocidad, nivelHidratacion );
        this.aceleracion=aceleracion;
    }
    
    //get y set de aceleracion
    public float getAceleracion(){
    return this.aceleracion;
    }
    public void setAceleracion(float aceleracion){
    this.aceleracion=aceleracion;
    }
    
    //metodos heredados
    //metodo para comer si esta a mas de 10km de la meta
    @Override
    public void comer() {
     if(getKmMeta() > 10){
         setEnergia(+25);
         System.out.println("El sprinter: " + getNombre() + " acaba de tomar un gel. Su energia ahora es de: "+ getEnergia());
      } else {
         System.out.println("No puedes comer a menos de 10km de la meta");
       }
     }

    //metodo heredado para aumentar hidratacion
    @Override
    public void beber() {
        if(getNumeroBidones()== 0){
         cogerBidones();
         setNivelHidratacion(+5);
         tirarBidon();
            System.out.println("El sprinter " + getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de: " + getNivelHidratacion() );
        } else {
            System.out.println("Aun te quedan bidones");
        }
    }

    //metodos implementados por la interfaz pedaleable
    /*
    @Override
    public void sprintar() {
    if(getKmMeta() <= 1 && getEnergia() => 50){
     setVelocidad(aceleracion);
     setEnergia(-50);
        System.out.println("El sprinter" + getNombre() + "esta esprintando a "+ getVelocidad() +" km/h");
    } else{
        System.out.println("Aun no puedes esprintar");
    }
    }
    */
    @Override
    public void atacar() {
        if(getEstaEscapado() == false){
        setEstaEscapado(true);
        setNivelHidratacion(-10);
            System.out.println("El sprinter" + getNombre() + "esta atacando");
        }
    }

    /*
    @Override
    public float recuperar(getKmMeta() {
    if(getKmMeta() > 5){
    setEnergia(+5);
    
        System.out.println("El sprinter"  + getNombre() + " esta recuperando");
    
    }
        return getEnergia();
    }
    */

   
}
