/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio25;

/**
 *
 * @author alumno
 */
public class Servidor extends Ordenador {
      private int tamMonitor;      // Tamaño del monitor
    private String modeloTeclado; // Modelo del teclado
    private String modeloRaton;   // Modelo del ratón
    

    public Servidor() {
        super();
        tamMonitor =0;
        modeloTeclado ="";
        modeloRaton="";
    }
    public Servidor(int memoriaRam,int tamMonitor, String modeloTeclado, String modeloRaton) {
        this.tamMonitor = tamMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
        super(memoriaRam);
    }

     public void setTamMonitor(int tamMonitor) {
        this.tamMonitor = tamMonitor;
    }
    
     public int getTamMonitor() {
        return tamMonitor;
    }
    
    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }
    
     public String getModeloTeclado() {
        return modeloTeclado;
    }
    
     public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }

     public String getModeloRaton() {
        return modeloRaton;
    }

    @Override
    public String toString() {
        return "El servidor tiene un monitor del cual su tamaño es: " + this.tamMonitor+ 
        " tambien tiene un teclado del modelo: " + this.modeloTeclado+ " y un raton del modelo: " + this.modeloRaton;
    }
}
