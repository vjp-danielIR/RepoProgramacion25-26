/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7_ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class TEMA7_Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int opcion;
         int[] ventas= new int[12];
        String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        // Menu
        do{
            opcion= mostrarMenu();
            switch(opcion){
                case 1 -> rellenarArray();
                case 2 -> mostrarVentas(ventas,meses);
                case 3 -> ventasReves(ventas);
                case 4 -> sumaTotal(ventas);
                case 5 -> ventasPares(ventas,meses);
                case 6 -> mesConMasVentas(ventas,meses);
                case 7 -> System.out.println("Saliento del probrama...");
    }
      
         
        }while(opcion !=7);
        }
    //metodo para rellenar un arrayu con numeros aleatorios desde el 10 al 100
    public static void rellenarArray(){
      int[] ventas= new int[12];
    for(int i=0;i<ventas.length;i++){
    ventas[i]= (int) (Math.random()* (101 - 10) +10);
    }
    }
    public static void mostrarVentas(int ventas[], String meses[]){
        for(int i=0;i<ventas.length;i++){
            System.out.println("el mes:" + meses[i] + "se hicieron: " + ventas[i] + "ventas");
        }
        
    }
    
    public static void ventasReves(int ventas[]){
      for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(ventas[i]);
        }
    }
    
    public static void sumaTotal(int ventas[]){
        int suma=0;
        for(int i=0; i<ventas.length; i++){
          suma += ventas[i];
         }
            System.out.println("las ventas por año han sido:" + suma);
    }
    public static void ventasPares(int ventas[],String meses[]){
        for(int i=0; i<meses.length; i++){
        if(ventas[i] % 2 ==1){
            System.out.println("las ventas del mes: " + meses[i] +" fueron: " + ventas[i]);
        }
        }
    }
    public static void mesConMasVentas(int ventas[], String meses[]){
        
       int indiceMax= 0;
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventas[indiceMax]) {
                indiceMax = i;
            }
        }
        
        // Mostrar el nombre del mes con más ventas
        System.out.println("El mes con mas ventas es: " + meses[indiceMax]);
    }
    
    public static int  mostrarMenu(){
         Scanner entrada= new Scanner(System.in);
        int opcion;
      System.out.println("-----MENU-----");
        System.out.println("-----------------");
        System.out.println("1. Rellenar un array unidimensional de 12 posiciones con las ventas de coches" + 
           "mensuales. Estas ventas serán números aleatorios entre 10 y 100.");
        System.out.println("-----------------");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
         System.out.println("-----------------");
         System.out.println("3. Mostrar las ventas introducidas al revés.");
         System.out.println("-----------------");
         System.out.println("4. Que muestre la suma total de ventas del año.");
         System.out.println("-----------------");
         System.out.println("5. Que muestre las ventas totales de los meses pares.");
         System.out.println("-----------------");
         System.out.println("""
                            6. Que muestre el nombre del mes con m\u00e1s ventas. (Necesitar\u00e1s otro array con el
                            nombre de los meses)""");
         System.out.println("-----------------");
         System.out.println("7. Salir del programa");
         opcion=entrada.nextInt();
         return opcion;
    }
}
