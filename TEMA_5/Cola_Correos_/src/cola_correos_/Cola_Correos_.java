/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *//**
 *
 * @author alumno
 */
package cola_correos_;
import java.util.Scanner;

public class Cola_Correos_ {

    /**
     * @param args the command line arguments
     */
    final char INICIOMESA= 'A';
    final char FINALMESA = 'F';
    final int NUMEROENVIO = 1;
    final int NUMERORECOGIDA = 1;
    public static void main(String[] args) {
    
     mostrarMenu();
    }
  
    public static void mostrarMenu(){
    //menu
        System.out.println("===== MENÚ  =====");
        System.out.println("1. Enviar");
        System.out.println("2. Recoger");
        System.out.println("3. Salir");
        pedirOpcion();
    }
    
    
    public static int pedirOpcion(){
        
        
     Scanner entrada=new Scanner (System.in);
        System.out.println("dime una opcion");
      int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    generarNumeroEsperaEnvio();
                    break;
                case 2:
                    generarNumeroEsperaRecogida();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no valida");
                    }
                return opcion;
                }
             
    public static char generaraLetraAleatoria(){
    //generar letra
         final char INICIOMESA= 'A';
    final char FINALMESA = 'F';
    char letraAleatoria = (char) (Math.random() * (FINALMESA - INICIOMESA + 1) + INICIOMESA);
    return letraAleatoria;
    }


    public static int  incrementarNumeroEnvio(){
    int NUMEROENVIO = 0;
    NUMEROENVIO++;  
    return NUMEROENVIO;
    }

    public static int incrementarNumeroRecogida(){
    int NUMERORECOGIDA= 0;
    NUMERORECOGIDA++;
    return NUMERORECOGIDA;
       }
    
    public static int generarNumeroEsperaEnvio(){
    int NUMEROENVIO;
         NUMEROENVIO = incrementarNumeroEnvio();
    System.out.println("Su numero de envío es: E-" + NUMEROENVIO);
        System.out.println("Vaya a la mesa: " + generaraLetraAleatoria());
       return  NUMEROENVIO;
            }
    
        public static int generarNumeroEsperaRecogida(){
            int NUMERORECOGIDA;
         NUMERORECOGIDA = incrementarNumeroRecogida();
            
         System.out.println("Su número de recogida es: R-" + NUMERORECOGIDA);
        System.out.println("Diríjase a la mesa: " + generaraLetraAleatoria());
       return NUMERORECOGIDA;
}}