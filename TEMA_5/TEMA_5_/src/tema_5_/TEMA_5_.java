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
   
        // Creamos una bicicleta
        Bicicleta bici = new Bicicleta();

        // Llamamos al método para empezar a pedalear
      //  empezarAPedalear(bici);

        // Creamos un ciclista y su bicicleta
        Ciclista ciclista = new Ciclista("Pogachar", 1, "Lider");
        Bicicleta biciPogachar = new Bicicleta(2, "recto", "MTB", "de disco", true, ciclista);

        // static hace que un atributo pertenezca a la clase y no a un objeto

        //CREAMOS 2 COCHES
        // parecido a Scanner entrada = new Scanner(System.in);
        // Coche miCoche= new Coche();
        // System.out.println(miCoche.toString());
        // miCoche.setEspejos(5);
        // System.out.println(miCoche.toString());
        // miCoche.acelerar();
        // System.out.println(miCoche.getEspejos());
  
        // Coche tuCoche = new Coche("Michelin", "bajo", 3);
        // System.out.println(tuCoche);

        // Modificadores de acceso
        // Bicicleta bicicleta = new Bicicleta();
        // System.out.println(bicicleta.ruedas);
        // System.out.println(bicicleta.getEstaPedaleando());
        // bicicleta.acelerar();

        // Bicicleta bicicleta2 = new Bicicleta();
        // System.out.println("cuantas bicis hemos creado?");
        // System.out.println(bicicleta.getNumBicicleta());

        // int num1 = 4;
        // System.out.println(suma(num1));
   // }

    // Método para empezar a pedalear
   // public static void empezarAPedalear(Bicicleta bici) {
     //   bici.setEstaPedaleando(true);
   // }

    // Método de ejemplo de suma (comentado en main)
    // public static int suma(int num1) {
    //     int num2 = 3;
    //     return num1 + num2;
    // }
}}