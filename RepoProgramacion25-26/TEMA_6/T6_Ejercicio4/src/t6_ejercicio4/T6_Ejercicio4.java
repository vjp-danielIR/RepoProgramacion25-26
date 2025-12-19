/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ejercicio4;

/**
 *
 * @author alumno
 */
public class T6_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animales perro = new Perros("Bobby", 3, 12.5);
      Animales lobo = new Lobos("Lobo Gris", 5, 40);
      Animales leon = new Leones("Simba", 7, 190) {};
      Animales gato = new Gatos("Michi", 2, 4.3) {};
      
        System.out.println("========= PERRO =========");
        System.out.println(" El perro se llama:" + perro.getNombre());
        System.out.println("Tiene una edad de:" + perro.getEdad()+ "anios");
        System.out.println("Y el señorito pesa: " +  perro.getPeso()+ "kg como si lloviera dinero");
        
        System.out.println("========= GATO =========");
       System.out.println(" El perro se llama:" + lobo.getNombre());
        System.out.println("Tiene una edad de:" + lobo.getEdad()+ "anios");
        System.out.println("Y el señorito pesa: " + lobo.getPeso()+ "kg como si lloviera dinero");
        
        System.out.println("========= LOBO =========");
        System.out.println(" El perro se llama:" + gato.getNombre());
        System.out.println("Tiene una edad de:" + gato.getEdad()+ "anios");
        System.out.println("Y el señorito pesa: " + gato.getPeso()+ "kg como si lloviera dinero");
        
        System.out.println("========= LEON =========");
        System.out.println(" El perro se llama:" + leon.getNombre());
        System.out.println("Tiene una edad de:" + leon.getEdad()+ "anios");
        System.out.println("Y el señorito pesa: " + leon.getPeso()+ "kg como si lloviera dinero");
     
        
        System.out.println("====== POLIMORFISMO =======");
        Animales animal;
        
           System.out.println("========= PERRO =========");
         animal = new Perros("Asta", 12, 22){};
        System.out.println(" El perro se llama:" + perro.getNombre());
        System.out.println("Tiene una edad de:" + perro.getEdad()+ "anios");
        System.out.println("Y el señorito pesa: " +  perro.getPeso()+ "kg como si lloviera dinero");
        
        System.out.println("========= GATO =========");
        animal = new Gatos("Raul", 400, 27){};
        System.out.println(" El perro se llama:" + lobo.getNombre());
        System.out.println("Tiene una edad de:" + lobo.getEdad()+ "anios");
        System.out.println("Y el señorito pesa: " + lobo.getPeso()+ "kg como si lloviera dinero");
        
        System.out.println("========= LOBO =========");
          animal = new Lobos("Gabriel", 7, 60){};
        System.out.println(" El perro se llama:" + gato.getNombre());
        System.out.println("Tiene una edad de:" + gato.getEdad()+ "anios");
        System.out.println("Y el señorito pesa: " + gato.getPeso()+ "kg como si lloviera dinero");
        
        System.out.println("========= LEON =========");
        animal = new Leones("Hamudi", 9, 195){};
        System.out.println(" El perro se llama:" + leon.getNombre());
        System.out.println("Tiene una edad de:" + leon.getEdad()+ "anios");
        System.out.println("Y el señorito pesa: " + leon.getPeso()+ "kg como si lloviera dinero");
        
    }
    }