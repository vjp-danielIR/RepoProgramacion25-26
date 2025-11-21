/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio17;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Test {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Crear 4 preguntas
         Enunciado pregunta1 = new Enunciado();
        pregunta1.setPregunta("¿Cuál es la capital de España?");
        pregunta1.setRespuesta("Madrid");
        
        Enunciado pregunta2 = new Enunciado();
        pregunta2.setPregunta("¿Quién descubrió América?");
        pregunta2.setRespuesta("Cristóbal Colón");
        
        Enunciado pregunta3 = new Enunciado();
        pregunta3.setPregunta("¿Cuántos continentes hay en el mundo?");
        pregunta3.setRespuesta("5");
        
        Enunciado pregunta4 = new Enunciado();
        pregunta4.setPregunta("¿Cuál es el planeta más grande del sistema solar?");
        pregunta4.setRespuesta("Júpiter");
        
        int aciertos = 0;
        
        // Hacer las 4 preguntas
        aciertos += preguntarUsuario(pregunta1, entrada);
        aciertos += preguntarUsuario(pregunta2, entrada);
        aciertos += preguntarUsuario(pregunta3, entrada);
        aciertos += preguntarUsuario(pregunta4, entrada);
        
        // Mostrar nota
        calcularNota(aciertos);
    }
    
    // Método para preguntar al usuario
    public static int preguntarUsuario(Enunciado pregunta, Scanner entrada) {
        System.out.println(pregunta.getPregunta());
        System.out.print("Respuesta: ");
        String respuesta = entrada.nextLine();
        //comprobar si la respuesta es correcta
        if (respuesta.equalsIgnoreCase(pregunta.getRespuesta())) {
            System.out.println("Correcto!");
            return 1;
        } else {
            System.out.println("Incorrecto. La respuesta era: " + pregunta.getRespuesta());
            return 0;
        }
    }
    
    // Método para calcular y mostrar la nota
    public static void calcularNota(int aciertos) {
        double nota = aciertos * 2.5;
        System.out.println("RESULTADO");
        System.out.println("Aciertos: " + aciertos + "/4");
        System.out.println("Nota: " + nota);
    }
}
