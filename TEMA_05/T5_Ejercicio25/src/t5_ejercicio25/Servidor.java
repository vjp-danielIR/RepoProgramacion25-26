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
    
    // atributos propios
    private int tamMonitor;
    private String modeloTeclado;
    private String modeloRaton;

    // constructor por defecto
    public Servidor() {
        super(); 
        tamMonitor = 0;
        modeloTeclado = "";
        modeloRaton = "";
    }

    // constructor con parámetros
    public Servidor(int memoriaRam, int capacidadDisco, String modeloProcesador, String modeloGrafica, int precio, int tamMonitor, 
            String modeloTeclado, String modeloRaton) {

        super(memoriaRam, capacidadDisco, modeloProcesador, modeloGrafica, precio);     
        this.tamMonitor = tamMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }

    // getters y setters
    public int getTamMonitor() {
        return tamMonitor;
    }

    public void setTamMonitor(int tamMonitor) {
        this.tamMonitor = tamMonitor;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public String getModeloRaton() {
        return modeloRaton;
    }

    public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " Monitor: " + tamMonitor +
                " Teclado: " + modeloTeclado +
                " Raton: " + modeloRaton;
    }
}