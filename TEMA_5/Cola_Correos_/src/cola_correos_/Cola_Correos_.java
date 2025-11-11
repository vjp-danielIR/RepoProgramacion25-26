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
    //definimos las constantes aun que no se si estan bien segun yo habia que poner un static al lado del final pero me da error de compilacion
    final char INICIOMESA= 'A';
    final char FINALMESA = 'F';
    final int NUMEROENVIO = 1;
    final int NUMERORECOGIDA = 1;
    public static void main(String[] args) {
    //llamamos al metodo menu para mostarlo
     mostrarMenu();
    }
    //este metodo unicamente muesta el menu y llama a otro para que el usuario pueda elegir una opcion
    public static void mostrarMenu(){
    //menu
        System.out.println("===== MENÚ  =====");
        System.out.println("1. Enviar");
        System.out.println("2. Recoger");
        System.out.println("3. Salir");
        pedirOpcion();
    }
    
    //este metodo pide la opcion al usuario y segun lo que eliga hara una cosa
    public static int pedirOpcion(){
        
     Scanner entrada=new Scanner (System.in);
        System.out.println("dime una opcion");
      int opcion = entrada.nextInt();
            switch (opcion) {
                case 1://si escoge el 1 es que quiere enviar un paquete o carta y se le entrega un numero de espera
                    generarNumeroEsperaEnvio();
                    break;
                case 2://si escoge el dos le daremos un numero de recogida 
                    generarNumeroEsperaRecogida();
                    break;
                case 3://el 3 es unicamente para salir del programa
                    System.out.println("Saliendo del programa");
                    break;
                default: 
                    System.out.println("Opción no valida");
                    }
                return opcion;
                }
             //este metodo calculara una letra aleatoria entre la a y la f 
    public static char generaraLetraAleatoria(){
    //generar letra
         final char INICIOMESA= 'A';
    final char FINALMESA = 'F';
    char letraAleatoria = (char) (Math.random() * (FINALMESA - INICIOMESA + 1) + INICIOMESA);
    return letraAleatoria;
    }

    // este metodo sumara 1 para que no haya conflictos por tener el mismo numero
    public static int  incrementarNumeroEnvio(){
    int NUMEROENVIO = 0;
    NUMEROENVIO++;  
    return NUMEROENVIO;
    }
    //este metodo es lo mismo que el anterior solo que en recogida sumara 1 para que no haya conflictos de que 2 personas tengan el mismo numero
    public static int incrementarNumeroRecogida(){
    int NUMERORECOGIDA= 0;
    NUMERORECOGIDA++;
    return NUMERORECOGIDA;
       }
    //en caso de que el usuairo escogiera el 1 lo trae aqui donde este metodo le dara un numero de espera y una mesa donde ir 
    public static int generarNumeroEsperaEnvio(){
    int NUMEROENVIO;
         NUMEROENVIO = incrementarNumeroEnvio();
    System.out.println("Su numero de envío es: E-" + NUMEROENVIO);
        System.out.println("Vaya a la mesa: " + generaraLetraAleatoria());
       return  NUMEROENVIO; //dev   uelve para que sume 1 en el metodo de numero envio para que no haya conflictos 
            }
                //este metodo es para las recogidas de cartas o paquetes
        public static int generarNumeroEsperaRecogida(){
            int NUMERORECOGIDA;
         NUMERORECOGIDA = incrementarNumeroRecogida();
            
         System.out.println("Su número de recogida es: R-" + NUMERORECOGIDA);
        System.out.println("Diríjase a la mesa: " + generaraLetraAleatoria());
       return NUMERORECOGIDA;
}}