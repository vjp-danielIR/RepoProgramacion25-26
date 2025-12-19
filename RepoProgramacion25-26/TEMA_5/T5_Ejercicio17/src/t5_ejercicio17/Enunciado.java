/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio17;

/**
 *
 * @author danie
 */
public class Enunciado {
    private String pregunta;
    private String respuesta;
    
    // Constructores
    public Enunciado(){
    this.pregunta="";
    this.respuesta="";
    }
    
    public Enunciado(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    // Getters y Setters
    public String getPregunta() {
        return pregunta;
    }
    
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public String getRespuesta() {
        return respuesta;
    }
  
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
