/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola_correos;
import java.util.Scanner;
/**
 *
 * @author alumno
 */

public class Cola_Correos {
final static char LETRA_DNI ='A';
    /**
     * @param args the command line arguments
     */
   
   
    public static void main(String[] args, ) {
     static final char incioMesa = 'A';
    static final char finalMesa = 'F';
    static int numEnvio = 0;
    static int numRecogida = 0;
        
        
    }
    public static void mostrarMenu(){
    //menu
    int opcion;
    int numEnvio = 0;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Elige una opcion:");
        System.out.println("1.Enviar paquete/carta");
         opcion = entrada.nextInt();
        System.out.println("2. Recoger paquete/carta");
         opcion = entrada.nextInt();
        System.out.println("3. Salir del programa");
         opcion = entrada.nextInt();  
          switch (opcion) {
                    case 1:
                        numEnvio++;
                        int numAleatorio = (char) (Math.random() * (finalMesa + 1 - inicioMesa) + inicioMesa);
                        System.out.println("Su número de envío es: " + numEnvio);
                        System.out.println("Diríjase a la mesa: " + mesaEnvio);
                        break;

                    case 2:
                        numRecogida++;
                        char mesaRecogida = (char) (inicioMesa + random.nextInt(finalMesa - inicioMesa + 1));
                        System.out.println("Su número de recogida es: " + numRecogida);
                        System.out.println("Diríjase a la mesa: " + mesaRecogida);
                        break;

                    case 3:
                        System.out.println("Saliendo del programa... ¡Hasta pronto!");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                       
    
    public static int pedirOpcion(){
    //pedir
    }
          
          
    public static char generaraLetraAleatoria(char letra){
    //generar letra
        return 0;
    //generar letra
    
    }
    public static void incrementarNumeroEnvio(){
    
    }
    public static void incrementarNumeroRecogida(){
    
    }
    
    public static void generarNumeroEsparaEnvio(){
    
    }

        public static int generarNumeroEsperaRecogida(){
        
        return 0;
        
        }



}



