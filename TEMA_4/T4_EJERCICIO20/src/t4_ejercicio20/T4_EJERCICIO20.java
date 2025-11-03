/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4_ejercicio20;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class T4_EJERCICIO20 {
    //CONSTANTES QUE NO VAN A CAMBIAR
  public static final String RESPUESTA1 = "Madrid";
    public static final String RESPUESTA2 = "Colón";
    
    public static final String PREGUNTA1 = "¿Cuál es la capital de España?";
    public static final String PREGUNTA2 = "¿Quién descubrió América?";
    
    public static final int PUNTUACION = 5;
    
    //metodo que pide al usuario la respuesta de las preguntas 
    public static String pedirRespuesta(){
    Scanner entrada = new Scanner(System.in);
    String respuestaUsuario = entrada.nextLine();
    return respuestaUsuario;
    }
    
   
   //Metodoo que compara la respuesta del usuario con la respiuesta es corrrecta si esta bien devuelve un true y si no un false 
    public static boolean comparacion(String respuestaUsuario,String respuestaCorrecta){
   boolean correcto;
        if(respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)){
            correcto = true;
        }else {
       correcto = false; 
        }
      return correcto;
    }
    /**
     * 
     * @param args the command line arguments
     */
    //EL USUARIO VERA LAS PREGUNTAS Y LAS RESPONDERA SI ESTA BIEN SE LE SUMARAN 5 Y SI NO NADA
    public static void main(String[] args) {
    int puntuacionFinal = 0;
    String respuesta;
        System.out.println("Examen de cultura general");
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();

        if(comparacion(respuesta,RESPUESTA1)){
            System.out.println("Correcto");
            puntuacionFinal += PUNTUACION; 
        }else 
        System.out.println("No es correcto la respuesta era: " + RESPUESTA1);
                
         System.out.println(PREGUNTA2);
        respuesta = pedirRespuesta();

                 if(comparacion(respuesta,RESPUESTA2)){
            System.out.println("Correcto");
            puntuacionFinal += PUNTUACION; 
        }else 
        System.out.println("No es correcto la respuesta era: " + RESPUESTA2);
                 System.out.println("nota final: " + puntuacionFinal);
           
    }   
}