/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Tablero {

    private Casilla[][] casillas;

    // Constructor por defecto
    public Tablero() {
        casillas = new Casilla[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casillas[i][j] = new Casilla();
            }
        }
    }

    // Constructor parametrizado
    public Tablero(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    // Getters y Setters
    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    // Dibuja el tablero con las fichas colocadas
    public void dibujar() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(casillas[i][j].getFicha() + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Coloca una ficha en la posicion indicada
    public boolean colocarFicha(int fila, int col, String ficha) {
        if (casillas[fila][col].isOcupada()) {
            System.out.println("Casilla ocupada, elige otra.");
            return false;
        }
        casillas[fila][col].setFicha(ficha);
        return true;
    }

    // Pide al jugador la posicion donde colocar la ficha
    public static int[] pedirPosicion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce fila (0-2): ");
        int fila = entrada.nextInt();
        System.out.print("Introduce columna (0-2): ");
        int col = entrada.nextInt();
        return new int[]{fila, col};
    }

    // El ordenador coloca una ficha en una casilla libre al azar
    public void moverOrdenador(String ficha) {
        Random random = new Random();
        int fila, col;
        do {
            fila = random.nextInt(3);
            col = random.nextInt(3);
        } while (casillas[fila][col].isOcupada());
        casillas[fila][col].setFicha(ficha);
        System.out.println("El ordenador ha colocado en fila " + fila + " columna " + col);
    }

    // Comprueba si el jugador con la ficha indicada ha ganado
    public boolean comprobarGanador(String ficha) {
        for (int i = 0; i < 3; i++) {
            if (casillas[i][0].getFicha().equals(ficha)
                    && casillas[i][1].getFicha().equals(ficha)
                    && casillas[i][2].getFicha().equals(ficha)) {
                return true;
            }

            if (casillas[0][i].getFicha().equals(ficha)
                    && casillas[1][i].getFicha().equals(ficha)
                    && casillas[2][i].getFicha().equals(ficha)) {
                return true;
            }
        }
        if (casillas[0][0].getFicha().equals(ficha)
                && casillas[1][1].getFicha().equals(ficha)
                && casillas[2][2].getFicha().equals(ficha)) {
            return true;
        }

        if (casillas[0][2].getFicha().equals(ficha)
                && casillas[1][1].getFicha().equals(ficha)
                && casillas[2][0].getFicha().equals(ficha)) {
            return true;
        }

        return false;
    }

    // Comprueba si todas las casillas estan ocupadas sin ganador
    public boolean comprobarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!casillas[i][j].isOcupada()) {
                    return false;
                }
            }
        }
        return true;
    }

    // ToString
    @Override
    public String toString() {
        return "Tablero [casillas=" + casillas + "]";
    }
}
