/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11_ejercicio11;

/**
 *
 * @author danie
 */
public class Alumno {

    private String dni;
    private int numExpediente;
    private double notaMedia;

    
     public Alumno() {
        this.dni = "";
        this.numExpediente = 0;
        this.notaMedia = 0.0;
    }
    public Alumno(String dni, int numExpediente, float notaMedia) {
        this.dni = dni;
        this.numExpediente = numExpediente;
        this.notaMedia = notaMedia;
    }

    public String getDni() {
        return dni;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    

    @Override
    public String toString() {
        return "Alumno [DNI=" + dni + ", Expediente=" + numExpediente + ", NotaMedia=" + notaMedia + "]";
    }
}
