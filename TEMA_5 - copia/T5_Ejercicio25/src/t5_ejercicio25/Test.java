/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ejercicio25;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //creamos 2 servidores
        Servidor servidor1 = crearServidorConParametros(1);
        Servidor servidor2 = crearServidorConParametros(2);
        
        Portatil portatil1 = crearPortatilConParametros(1);
        Portatil portatil2 = crearPortatilConParametros(2);
        
        Servidor servidor3 = new Servidor();
        establecerServidor(servidor3);
        
        Portatil portatil = new Portatil();
        establecerValoresPortatil(portatil);
        
        System.out.println("DATOS DE LOS ORDENADORES");
        
        System.out.println("Servidor 1");
        System.out.println(servidor1);
        
        System.out.println("Servidor  2");
        System.out.println(servidor2);
        
        System.out.println("Servidor 3");
        System.out.println(servidor3);
        
        System.out.println("Portaitl 1");
        System.out.println(portatil1);
        
        System.out.println("Portatil 2");
        System.out.println(portatil2);
        
        System.out.println("Portatil 3");
        System.out.println(portatil);
    }
     
    static Scanner entrada = new Scanner(System.in);
    
    //Solicita y valida que la capacidad del disco sea múltiplo de 5
    public static int solicitarCapacidadDisco() {
        int capacidad;
        do {
            System.out.print("Capacidad del disco duro: ");
            capacidad = entrada.nextInt();
            if (capacidad % 5 != 0) {
                System.out.println("Tiene que ser un valor mayor ");
            }
        } while (capacidad % 5 != 0);
        return capacidad;
    }
    
    //Solicita y valida que el precio sea mayor que 0
    public static int solicitarPrecio() {
        int precio;
        do {
            System.out.print("Precio: ");
            precio = entrada.nextInt();
            if (precio <= 0) {
                System.out.println("El precio debe ser mayor que 0.");
            }
        } while (precio <= 0);
        return precio;
    }
    
    //Muestra una lista de procesadores y permite seleccionar uno
    public static String seleccionarProcesador() {
        System.out.println("Procesadores Disponibles: ");
        System.out.println("1) Intel Core i3");
        System.out.println("2) Intel Core i5");
        System.out.println("3) Intel Core i7");
        System.out.println("4) Intel Core i9");
        System.out.println("5) AMD Ryzen 3");
        System.out.println("6) AMD Ryzen 5");
        System.out.println("7) AMD Ryzen 7");
        System.out.println("8) AMD Ryzen 9");
        
        int opcion;
        String procesador = "";
        do {
            System.out.print("Elige una opcion (1-8): ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    procesador = "Intel Core i3";
                    break;
                case 2:
                    procesador = "Intel Core i5";
                    break;
                case 3:
                    procesador = "Intel Core i7";
                    break;
                case 4:
                    procesador = "Intel Core i9";
                    break;
                case 5:
                    procesador = "AMD Ryzen 3";
                    break;
                case 6:
                    procesador = "AMD Ryzen 5";
                    break;
                case 7:
                    procesador = "AMD Ryzen 7";
                    break;
                case 8:
                    procesador = "AMD Ryzen 9";
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
            
        } while (opcion < 1 || opcion > 8);
        
        return procesador;
    }
    
    //Solicita monitor que sea mayor que 14 (por que el estandar es de 14 a 15,6 pulgadas)
    public static int solicitarTamañoMonitor() {
        int tamaño;
        do {
            System.out.print("Tamaño del monitor en pulgadas: ");
            tamaño = entrada.nextInt();
            if (tamaño <= 14) {
                System.out.println("tiene que ser mayor ");
            }
        } while (tamaño <= 14);
        return tamaño;
    }
    
    // objeto Servidor solicitando todos los datos con validaciones y es de tipo servidor por que devuelve un nuevo objeto servidor
    public static Servidor crearServidorConParametros(int numero) {
        System.out.println("SERVIDOR " + numero);
        
        System.out.print("Memoria RAM en GB: ");
        int memoriaRam = entrada.nextInt();
        
        int capacidadDisco = solicitarCapacidadDisco();
        String modeloProcesador = seleccionarProcesador();
        
        entrada.nextLine();
        System.out.print("Modelo tarjeta grafica: ");
        //Line es para que lea toda la linea que escriba (eso es mas un recordatorio para mi por que se me olvideo que lo de limpiar el buffer eran los parentesis)
        String modeloGrafica = entrada.nextLine();
        //llamamos a los metodos para pedirle la informacion
        int precio = solicitarPrecio();
        int monitor = solicitarTamañoMonitor();
        
        entrada.nextLine();
        System.out.print("Modelo teclado: ");
        String teclado = entrada.nextLine();
        
        System.out.print("Modelo raton: ");
        String raton = entrada.nextLine();
        //aqui creo un servidor con los parametros que me dio el usuario
        return new Servidor(memoriaRam, capacidadDisco, modeloProcesador, modeloGrafica, precio, monitor, teclado, raton);
    }
    
    //Crea objeto Portatil solicitando todos los datos al usuario
    //el int numero es para indicar que ordenador es si el 1 o el 2
    public static Portatil crearPortatilConParametros(int numero) {
        System.out.println("Portatil" + numero);
        
        System.out.print("Memoria RAM GB: ");
        int memoriaRam = entrada.nextInt();
        
        int capacidadDisco = solicitarCapacidadDisco();
        String modeloProcesador = seleccionarProcesador();
        
        entrada.nextLine();
        System.out.print("Modelo tarjeta grafica: ");
        String modeloGrafica = entrada.nextLine();
        
        int precio = solicitarPrecio();
        
        System.out.print("Marca: ");
        String marca = entrada.nextLine();
        
        System.out.print("Tamaño pantalla en pulgadas: ");
        double pantalla = entrada.nextDouble();
        
        System.out.print("Peso en Kg: ");
        double peso = entrada.nextDouble();
        
        return new Portatil(memoriaRam, capacidadDisco, modeloProcesador, modeloGrafica, precio, marca, pantalla, peso);
    }
    
    //Establece los valores de un servidor mediante setters
    public static void establecerServidor(Servidor servidor3) {
        System.out.println("Servidor constructor por defecto");
        
        System.out.print("Memoria RAM GB: ");
        servidor3.setMemoriaRam(entrada.nextInt());
        //
        servidor3.setCapacidadDisco(solicitarCapacidadDisco());
        servidor3.setModeloProcesador(seleccionarProcesador());
        
        entrada.nextLine();
        System.out.print("Modelo tarjeta grafica: ");
        servidor3.setModeloGrafica(entrada.nextLine());
        
        servidor3.setPrecio(solicitarPrecio());
        servidor3.setTamMonitor(solicitarTamañoMonitor());
        
        entrada.nextLine();
        System.out.print("Modelo teclado: ");
        servidor3.setModeloTeclado(entrada.nextLine());
        
        System.out.print("Modelo raton: ");
        servidor3.setModeloRaton(entrada.nextLine());
    }
    
    //Establece los valores de un Portatil mediante setters
    // es decir llamo al objeto el set de establecer la parte que quiero establecer y uso el metodo especifico para el dato
    public static void establecerValoresPortatil(Portatil portatil) {
        System.out.println("POrtatil constructor por defecto");
        
        System.out.print("Memoria RAM GB: ");
        portatil.setMemoriaRam(entrada.nextInt());
        
        portatil.setCapacidadDisco(solicitarCapacidadDisco());
        portatil.setModeloProcesador(seleccionarProcesador());
        
        entrada.nextLine();
        System.out.print("Modelo tarjeta grafica: ");
        portatil.setModeloGrafica(entrada.nextLine());
        
        portatil.setPrecio(solicitarPrecio());
        
        System.out.print("Marca: ");
        portatil.setMarca(entrada.nextLine());
        
        System.out.print("Tamaño pantalla en pulgadas: ");
        portatil.setTamPantalla(entrada.nextDouble());
        
        System.out.print("Peso Kg: ");
        portatil.setPeso(entrada.nextDouble());
    }
}