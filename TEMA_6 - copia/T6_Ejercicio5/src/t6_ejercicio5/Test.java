/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ejercicio5;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("De forma comun ");
       Ornitorrinco ornitorrinco1 = new Ornitorrinco(10, 12, "marron", "macho");
       Murcielago murcielago1= new Murcielago(20, 3, "negro", "hembra");
       
        System.out.println("ORNITORRINCO ");
       ornitorrinco1.getHuevos();
       ornitorrinco1.incubarHuevos();
       ornitorrinco1.mostrarNumHuevos();
       ornitorrinco1.obtenerMensajeOviparo();
       ornitorrinco1.ponerHuevos();
        System.out.println("");
        System.out.println("MURCIELAGO");
        murcielago1.bajarAlturaVuelo();
        murcielago1.aumentarAlturaVuelo();
        murcielago1.getMertrosAltura();
        murcielago1.obtenerMensajeVolador();
      
        System.out.println("");
        System.out.println("== POLIMORFISMO ==");
        System.out.println("");
        
       Oviparo orni= new Ornitorrinco(20, 24, "violeta", "hembra");
       Volador murcia= new Murcielago(15, 7, "azul","hombre");
       
        System.out.println("");
        System.out.println("Ornitorrinco");
       orni.incubarHuevos();
       orni.mostrarNumHuevos();
       orni.obtenerMensajeOviparo();
       orni.ponerHuevos();
        System.out.println(orni);
        
        System.out.println("");
        System.out.println("Murcielago");
        murcia.aumentarAlturaVuelo();
        murcia.bajarAlturaVuelo();
        murcia.mostrarAlturaVuelo();
        murcia.obtenerMensajeVolador();
        System.out.println(murcia);
    
    
    
    }
    
}
