package T4_MetodosEstaticos;


import utilidades.Utilidades;   // Importamos clase de otro paquete
import calculadora.Calculadora; // Importamos clase Calculadora (suponiendo que está en otro paquete)

/**
 * Ejemplo de uso de métodos estáticos entre clases y paquetes.
 * 
 * @author alumno
 */
public class METODOS_ESTATICOS_T4 {

    // Método que imprime un saludo (void)
    public static void saludo() {
        System.out.println("Hola universo");
    }

    // Método que imprime un mensaje con un dato que recibe por parámetro (void)
    public static void saludoConParametro(int num) {
        System.out.println("Hola neox " + num);
    }

    // Método que muestra la suma de dos números (void)
    public static void suma(int num1, int num2) {
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + (num1 + num2));
    }

    // Método que devuelve la suma de dos números (int)
    public static int sumaDevuelve(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Método principal.
     * Aquí se prueban distintos métodos estáticos y clases externas.
     */
    public static void main(String[] args) {
        int num1, num2;
        double resultado;

        // Ejemplo: llamada a métodos propios
        saludo();
        saludoConParametro(7);
        suma(5, 10);
        System.out.println("Resultado de la sumaDevuelve: " + sumaDevuelve(5, 10));

        // Ejemplo: llamada a métodos estáticos de otra clase
        // (asumiendo que Calculadora tiene métodos estáticos suma, resta, etc.)
        num1 = Utilidades.pedirNumero();
        num2 = Utilidades.pedirNumero();

        try {
            resultado = Calculadora.suma(num1, num2);
            System.out.println(num1 + " + " + num2 + " = " + resultado);

            resultado = Calculadora.resta(num1, num2);
            System.out.println(num1 + " - " + num2 + " = " + resultado);

            resultado = Calculadora.multiplicacion(num1, num2);
            System.out.println(num1 + " * " + num2 + " = " + resultado);

            resultado = Calculadora.division(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + resultado);

            resultado = Calculadora.raizCuadrada(num1);
            System.out.println("La raíz cuadrada de " + num1 + " es " + resultado);

            resultado = Calculadora.redondeoBajo(2.4930);
            System.out.println("2.4930 redondeado a la baja es " + resultado);

            System.out.println("El cubo de " + num1 + " es: " + Calculadora.cubo(num1));
            System.out.println("El logaritmo de " + num1 + " es: " + Calculadora.logaritmo(num1));
            System.out.println("El número mayor de " + num1 + " y " + num2 + " es: " + Calculadora.valorMaximo(num1, num2));

        } catch (ArithmeticException e) {
            System.out.println("Ha sucedido una excepción aritmética");
        }