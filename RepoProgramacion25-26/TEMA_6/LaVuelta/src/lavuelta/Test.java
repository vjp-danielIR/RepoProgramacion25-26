/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lavuelta;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //creamos objetos de las clases hijas
     CiclistaEscalador  escalador = new CiclistaEscalador("Javi", 30, false, 52, 10, 12, 80, 43, 37);
    CiclistaSprinter sprinter =new CiclistaSprinter("David", 40, true, 60, 5, 12, 10, 13);
        System.out.println(escalador);
        System.out.println(sprinter);
        
    //las guardamos en la variable tipo Ciclista
        System.out.println("");
        System.out.println("====POLIMORFISMO====");
        System.out.println("");
        System.out.println("____ESCALADOR____");
    Ciclista escalador2= escalador;
    escalador2.comer();
    escalador2.beber();
        System.out.println(escalador2);
        System.out.println("");
        System.out.println("_____SPRINTER____");
    Ciclista sprinter2= sprinter;
    sprinter2.comer();
    sprinter2.beber();

    //y ahora las guardamos en la variable de la interfaz para mostrar los metodos 
        System.out.println("____METODOS DE LA INTERFAZ___");
        System.out.println("Escalador:    ");
    Pedaleable escalador3=(Pedaleable) escalador2;
    escalador3.atacar();
    //escalador3.sprintar(); no consigo que funcionen
    //escalador3.recuperar();
        System.out.println("Sprinter:    ");
    Pedaleable sprinter3=(Pedaleable) sprinter2;
    sprinter3.atacar();
    //sprinter3.recuperar() no consigo que funcionan
    //sprinter3.sprintar();
        
        
  
    }  
}
