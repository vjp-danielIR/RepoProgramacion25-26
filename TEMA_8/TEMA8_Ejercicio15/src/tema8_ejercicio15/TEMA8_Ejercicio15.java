/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema8_ejercicio15;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class TEMA8_Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socios[] socios = new Socios[4];
        Peliculas[] peliculas = new Peliculas[3];

        
    }

    //rellenar las peliculas junto los socios que han venido a verla
    public static void rellenarPeliSocio(Socios[] socios, Peliculas[] peliculas) {
        Scanner entrada = new Scanner(System.in);
        // Rellenar socios
        for (int i = 0; i < socios.length; i++) {
            socios[i] = new Socios();
            System.out.print("Dime el nombre del socio: ");
            socios[i].setNombre(entrada.nextLine());

            System.out.print("Dime cuanto abonó: ");
            socios[i].setPrecioAbonado(entrada.nextInt());
            entrada.nextLine();
        }

        // Rellenar películas
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i] = new Peliculas();
            System.out.print("Dime el nombre de la película: ");
            peliculas[i].setTitulo(entrada.nextLine());

            System.out.print("Dime cuanto cuesta la licencia de la peli: ");
            peliculas[i].setCosteLicencia(entrada.nextInt()); 
           
        }
    }
    public static String  mostrarPelisYSociosVista(Socios[] socios, Peliculas[] peliculas){
        
        
        return "h" ;
    
    }
    
    public static String peliRentable(Peliculas[] peliculas, Socios[] socios){
         int suma=0;
        for(int i=0; i<socios.length; i ++){
           suma+=socios[i].getPrecioAbonado(i);
           suma2+=peliculas[i].getCosteLicencia(i);
           
           return "";
        }
        return null;
    }

}
