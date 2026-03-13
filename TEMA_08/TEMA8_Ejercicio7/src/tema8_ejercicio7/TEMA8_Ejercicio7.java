/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tema8_ejercicio7;


import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class TEMA8_Ejercicio7 {

    public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        Dia[] mes = new Dia[30];
        Scanner entrada = new Scanner(System.in);
        int opcion;

        for (int i = 0; i < 30; i++) {
            mes[i] = new Dia();
        }

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Temperatura media");
            System.out.println("4. Dia mas caluroso");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 ->
                        rellenarTemperaturas(mes, dias);
                    case 2 ->
                        mostrarTemperaturas(mes);
                    case 3 ->
                        mostrarMedia(mes);
                    case 4 ->
                        mostrarMasCaluroso(mes);
                    case 5 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("Opcion no disponible");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor no valido");
                entrada.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);
    }

    // Rellena el array con temperaturas aleatorias y asigna dias de la semana
    public static void rellenarTemperaturas(Dia[] mes, String[] dias) {
        int diaInicio = (int) (Math.random() * 6);
        for (int i = 0; i < 30; i++) {
            mes[i].setNumeroDia(i + 1);
            mes[i].setDiaSemana(dias[(diaInicio + i) % 7]);
            mes[i].setTemperatura(15 + Math.random() * 30);
        }
        System.out.println("Temperaturas generadas");
    }

    // Muestra todas las temperaturas del mes
    public static void mostrarTemperaturas(Dia[] mes) {
        for (int i = 0; i < 30; i++) {
         System.out.printf("%.2f", mes[i]);
        }
    }

    // Calcula y muestra la temperatura media del mes
    public static void mostrarMedia(Dia[] mes) {
        double suma = 0;
        for (int i = 0; i < 30; i++) {
            suma += mes[i].getTemperatura();
        }
        System.out.println("Temperatura media: " + (suma / 30) + " grados");
    }

    // Encuentra y muestra el dia o dias mas calurosos del mes
    public static void mostrarMasCaluroso(Dia[] mes) {
        double max = mes[0].getTemperatura();
        for (int i = 1; i < 30; i++) {
            if (mes[i].getTemperatura() > max) {
                max = mes[i].getTemperatura();
            }
        }
        System.out.println("Dias con temperatura maxima (" + max + " grados):");
        for (int i = 0; i < 30; i++) {
            if (mes[i].getTemperatura() == max) {
                System.out.println("Dia " + mes[i].getNumeroDia() + " - " + mes[i].getDiaSemana());
            }
        }
    }
}
