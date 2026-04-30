/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema8_ejercicio17;

/**
 *
 * @author danie
 */
public class TEMA8_Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el tablero
        Tablero tablero = new Tablero();

        boolean juegoTerminado = false;

        while (!juegoTerminado) {

            // Dibujar el estado actual del tablero
            tablero.dibujar();

            // Pedir posicion al jugador
            int[] posicion = Tablero.pedirPosicion();
            boolean colocada = tablero.colocarFicha(posicion[0], posicion[1], "X");

            if (!colocada) {
                continue;
            }

            // Comprobar si el jugador ha ganado
            if (tablero.comprobarGanador("X")) {
                tablero.dibujar();
                System.out.println("Has ganado!");
                juegoTerminado = true;
                break;
            }

            // Comprobar si hay empate tras el turno del jugador
            if (tablero.comprobarEmpate()) {
                tablero.dibujar();
                System.out.println("Empate!");
                juegoTerminado = true;
                break;
            }

            // El ordenador realiza su movimiento
            tablero.moverOrdenador("O");

            // Comprobar si el ordenador ha ganado
            if (tablero.comprobarGanador("O")) {
                tablero.dibujar();
                System.out.println("El ordenador ha ganado!");
                juegoTerminado = true;
                break;
            }

            // Comprobar si hay empate tras el turno del ordenador
            if (tablero.comprobarEmpate()) {
                tablero.dibujar();
                System.out.println("Empate!");
                juegoTerminado = true;
            }
        }
    }
}
