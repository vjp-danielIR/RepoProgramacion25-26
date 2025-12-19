/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panelcontrol.menu;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class PanelControlMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       menu();
        
    }
    
    //metodo para mostrar el menu al usurio
    public static void menu(){
        
        System.out.println("");
        System.out.println("=======Menu=======");
        System.out.println("___________________________________");
        System.out.println("1. Analizar señal recibida del espacio");
        System.out.println("___________________________________");
        System.out.println("2. Ajustar las potencias de sus motores antes del lanzamiento");
        System.out.println("___________________________________");
        System.out.println("3. Calcular el volumen de un planeta");
        System.out.println("___________________________________");
        pedirMenu();
        
        }
      //Metodo para pedir opcion al usuario y redirigirlo al metodo especifico
    public static void pedirMenu(){
        int opcion= 0;
        Scanner entrada= new Scanner (System.in);
        //control de expeciones si mete una letra
     try{
        System.out.println("dime una opcion");
        opcion =entrada.nextInt(); 
     } catch(InputMismatchException e){
        System.out.println("dato no valido");    
        } 
      //un bucle para si el numero que metio no esta volver a empezar 
        do{   
        switch (opcion) {
            case 1 -> //usuario mete  numero entero frecuencia
                analizarSeñal();
                //usuario debera meter 3 numeros de potencia ordenar de mmenor a mayor y mostar por pantalla
            case 2 -> ajustarPotencias();
                //calcular el volumen de un planeta a partir del radio que nos diga el usuairo
            case 3 -> volumenPlaneta();
        }
      }while(opcion != 3);
    }
     
    
    
    //analizar señal recibida del espacio
    //si el usuario elige el 1 le traera aqui que es para ver el primer numero divisible y que no sea 1 
    
    public static void analizarSeñal(){
        int numeroFrecuencia = pedirAnalizar();
        for(int i=2; i <=20; i++){
            if(numeroFrecuencia % i == 0){
                System.out.println("Primer patron detectable: " + i);
            }          
        }
    }
    //como ponia que los datos deben pedirse desde un metodo especifico puse metodos para pedir los datos de cada apartado
    //este solo pedira al usuario el numeero y lo devolvera
    public static int pedirAnalizar(){
        int numeroFrecuencia;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Dime el numero que representa la frecuencia");
        numeroFrecuencia= entrada.nextInt();
        return numeroFrecuencia;
    }
    
    //ajustar las potencias
    //compara los numeros para ponerlos de mayor a menor se que se ve muy largo es que no recuerdo la sintasis de la otra forma
    //ademas no consegui pasar los 3 numeros asique lo hice en el propio metodo pedir por pantalla
    public static void ajustarPotencias(){
    //pedirPotencias();
      int num1,num2,num3;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Numero de potencia 1");
        num1= entrada.nextInt();
        System.out.println("Numero de potencia 2");
        num2= entrada.nextInt();
          System.out.println("Numero de potencia 3");
           num3= entrada.nextInt();
        //compara entre los 3 numeros cual es el mayor y segun cual sea imprimira uno o otro
       if(num1 > num2 && num1> num3){
          System.out.println("el orden es: "+ num1 + num2 + num3);  
       } else if(num1< num2 && num1<num3){
           System.out.println("el orden es: " + num3 + num2 + num1);
        }else if(num1 > num2 && num2 < num3){
          System.out.println("el orden es: "+ num1 + num3 + num2 );
        }else if(num3 > num2 && num3> num1 ) {
            System.out.println("el orden es: " + num3+ num2 + num1);
        }else{
          System.out.println("el orden es: " + num2 + num3 + num1);
       } 
    }
    //lo intente con otro metodo pero no recuerdo como pasarle los 3 numeros 
    //intente pasarselos por parametros tambien pero tampoco funciono
   /* public static int pedirPotencias(){
      int num;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Numero de potencia");
        System.out.println("Numero de potencia 2");
          System.out.println("Numero de potencia 3");
           num= entrada.nextInt();
           return num;
                }*/
    
    //metodo que imprime el resultado del radio
    public static void volumenPlaneta(){
      
        System.out.println(4/3*Math.PI*(pedirVolumen()*3));
    }
    
    
    //metodo para pedir el radio de un planeta
    public static double pedirVolumen(){
        double num;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el radio del planeta");
        num=entrada.nextInt();
       return  num;
    }   
}