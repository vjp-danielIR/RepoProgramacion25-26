/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recrearcodigo.examen;

/**
 *
 * @author alumno
 */
public class RecrearCodigoExamen {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        //inicializamos las variables
        int numeroBuscado=7;
        boolean encontrado=false;
        int i=0;
        //bucle para buscar numero
        for ( i =1; i <=10; i++){
            //cada numero pasara por aqui para ver si el numero es igual a 7
        if(i ==numeroBuscado){
            //si lo es entrara aqui y el false de encontrado pasara a true
            encontrado= true;
            //y se imprimira el numero
            System.out.println("Numero encontrado: " + i);
     }
    }   //si se a superado el rango de 0 a 10 y el numero no se encuentra vendra aqui
        if(!encontrado){
            System.out.println("Numero no encontrado en el rango");
        }
    }
    
}
