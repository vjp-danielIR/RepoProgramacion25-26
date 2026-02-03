/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema8_ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA8_Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ESTO ES PARTE DEL EJERCICIO 11");
        //crear 2 objetos 
        //por defecto
        Muebles mueble1 = new Muebles();

        //parametrizado
        Muebles mueble2 = new Muebles(23, "las 3B bueno, bonito, barato");

        System.out.println("Mueble 1:");
        System.out.println(mueble1);
        System.out.println("");
        System.out.println("Mueble 2:");
        System.out.println(mueble2);
        System.out.println("le ponemos precio y descripcion al mueble 1 y cambiamos el del mueble 2");

        mueble1.setDescripcion("Todos vienen por el por la gran calidad y lo barato que los tengo me los quitan de las manos");
        mueble1.setPrecio(400);

        mueble2.setDescripcion("Muebles Don Miguel tu comodidad es mi deber");
        mueble2.setPrecio(35);

        System.out.println("");
        System.out.println(" Una vez iniciado el mueble 1 y cambiado el 2 los muestro");
        System.out.println("");
        System.out.println("Mueble 1");
        System.out.println(mueble1);
        System.out.println("");
        System.out.println("Mueble 2");
        System.out.println(mueble2);

        System.out.println("APARTIR DE AQUI ES DEL EJERCICIO 12");
        Scanner entrada = new Scanner(System.in);
        int opcion;

        //creamos el vecotr
        Muebles[] muebles = new Muebles[4];

        do {
            System.out.println("=_=_=_=_=_M_E_N_U_=_=_=_=");
            System.out.println("--------------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("--------------------------------");
            System.out.println("1. Rellenar muebles");
            System.out.println("--------------------------------");
            System.out.println("2. Mostrar muebles");
            System.out.println("--------------------------------");
            System.out.println("3. Mostrar muebles por precio");
           

            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 -> rellenarMuebles(muebles);
                    case 2 -> mostrarMuebles(muebles);
                    case 3 -> mostrarMueblesPorPrecio(muebles);
                    
                    default -> System.out.println("Opcion no valida"); 

                        }
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 3);
    }

    public static void rellenarMuebles(Muebles[] muebles) {
        for (int i = 0; i < muebles.length; i++) {
            System.out.println("---- Mueble " + (i + 1) + " ----");
            muebles[i].setDescripcion("""
                                      Soy un perro callejero que no sabe a d\u00f3nde ir
                                      Solo el olor de tu pelo me da ganas de vivir
                                      Me enganch\u00e9 a tu calor, conden\u00e1ndome al dolor
                                      Soy un perro callejero sin tiempo pa' decidir """);
            muebles[i].setPrecio(42);

            System.out.println("---- Mueble " + (i + 1) + " ----");
            muebles[i].setDescripcion("""
                                      Mi vida es un disparo al coraz\u00f3n, un pu\u00f1al al t\u00f3rax
                                      Una soga al cuello que aprieta, pero no ahoga
                                      Vivo to' el d\u00eda acelera'o como en Daytona
                                      Mientras las multas y los dramas se me amontonan
                                      Sale del ba\u00f1o mi loba y parece Madonna
                                      Su mirada y la m\u00eda hablan el mismo idioma
                                      Estoy quemando etapas y neuronas
                                      Mi mundo me devora
                                      Y yo vivo sin nada que perder""");
            muebles[i].setPrecio(42);

            System.out.println("---- Mueble " + (i + 1) + " ----");
            muebles[i].setDescripcion("""
                                      Miro las luci\u00e9rnagas que hab\u00edan
                                      Bien en lo profundo en tu coraz\u00f3n
                                      Veo como bailan en un rosario
                                      Acostumbradas a o\u00edr tu voz
                                      Si miro tu rostro, vuelvo a nacer
                                      Pasar\u00e1 la vida y no volver\u00e1s
                                      Yo no veo tu cara en el ata\u00fad
                                      Veo un ser de luz desaparecer""");
            muebles[i].setPrecio(30);

            System.out.println("---- Mueble " + (i + 1) + " ----");
            muebles[i].setDescripcion("Ey camaron todos los dias sale el sol camaron");
            muebles[i].setPrecio(20);
        }

    }

    public static void mostrarMuebles(Muebles[] muebles) {
        for (int i = 0; i < muebles.length; i++) {
            System.out.println("El array esta compuesto por: " + (i + 1) + muebles[i]);
        }
    }

    public static void mostrarMueblesPorPrecio(Muebles[] muebles) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un precio para mostrar los muebles mas baratos");
        double precio = entrada.nextDouble();

        for (int i = 0; i < muebles.length; i++) {
            if (muebles[i].getPrecio() < precio) {
                System.out.println("Mueble " + (i + 1) + " es mas barato que " + precio + ": " + muebles[i]);
            }
        }
    }

}
