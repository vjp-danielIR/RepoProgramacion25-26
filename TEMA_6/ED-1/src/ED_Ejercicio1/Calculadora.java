/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED_Ejercicio1;

/**
 *
 * @author alumno
 */
public  class Calculadora {
    //atributo

    int numero1;
    int numero2;

    public Calculadora() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public Calculadora(int numero) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int division(int numero1, int numero2) {
        return numero1 / numero2;
    }

    @Override
    public String toString() {

        return " el numero es " + this.numero1 + " " + this.numero2;
    }
}
