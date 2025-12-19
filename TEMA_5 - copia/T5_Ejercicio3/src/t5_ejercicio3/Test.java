/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ejercicio3;

/**
 *
 * @author alumno
 */
public class Test {
     public static void main(String[] args) {
        Rueda rueda1 = new Rueda("Goma", "30");
        Rueda rueda2 = new Rueda("Madera", "60");
        
         System.out.println(rueda1.toString());
         System.out.println(rueda2.toString());
     
         Coche coche1= new Coche("Nissan", "GTR-R34", rueda1.getMaterial(),rueda1.getPulgada());
         Coche coche2= new Coche("Toyota", "Supra-mk4", rueda1.getMaterial(),rueda1.getPulgada());
         Coche coche3= new Coche("Nissan", "GTR-R35", rueda2.getMaterial(),rueda2.getPulgada());

         System.out.println("mi coche 1 es:" + coche1.toString());
         System.out.println("mi coche 2 es:" + coche2.toString());
         System.out.println("mi coche 3 es:" + coche3.toString());
         
     
     }
    
}
