/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema_5_;

/**
 *
 * @author alumno
 */
public class TEMA_5_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS 2 COCHES
       // parecido a Scanner entrada = new Scanner(System.in);
        Coche miCoche= new Coche();
        System.out.println(miCoche.toString());
    miCoche.setEspejos(5);
     System.out.println(miCoche.toString());
     miCoche.acelerar();
        System.out.println(miCoche.getEspejos());
  
    Coche tuCoche = new Coche("Michelin", "bajo", 3);
        System.out.println(tuCoche);
}  }