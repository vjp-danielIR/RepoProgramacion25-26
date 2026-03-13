/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio5;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador {
    //atributo de murcielago
    private double metrosAltura;
    
    //constructores
    //por defecto
    public Murcielago(){
    super();
      this.metrosAltura=0;
    }
    
    //parametrizado
    public Murcielago(double metrosAltura, int edad, String color,String sexo){
        super(edad,color, sexo);
        this.metrosAltura=metrosAltura;
        
    }
    
    //get y seter de la propia clase
    public double getMertrosAltura(){
    return this.metrosAltura;
    }
    
    public void setMetrosAltura(double metrosAltura){
    this.metrosAltura=metrosAltura;
    }
    
    //metodo para decir que el murcielago es un animal volador
    @Override
    public String obtenerMensajeVolador(){
    return "El murciélago es un animal volador";
    }
    //metodo para incrementar metros a la subida del murcielago
     @Override
    public void aumentarAlturaVuelo(){
        System.out.println("el murcielago subio de altura");
        metrosAltura+=5;
    }
    //metodo para restarle metros a la bajada del murcielago
     @Override
    public void bajarAlturaVuelo(){
        System.out.println("el murcielago bajo de altura");
        metrosAltura-=5;
    }
    //metodo para ver los metros a los que vuela el murcielago
     @Override
    public void mostrarAlturaVuelo(){
        System.out.println("el murcielago esta volando a " + metrosAltura);
    }
    //metodo para mostrar informacion del murcielago
    @Override
    public String toString(){
    return " el murcielago es del sexo:" + super.getSexo() + "es de color: " + super.getColor() + " tiene una edad aproximada de : " + super.getEdad()
      + " y vuuela aproximadamente unos: "  + this.metrosAltura + " metros de altura";
            }
}
