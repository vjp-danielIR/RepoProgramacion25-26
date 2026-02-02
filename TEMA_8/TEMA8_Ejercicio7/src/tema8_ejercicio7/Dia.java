/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio7;

/**
 *
 * @author alumno
 */
public class Dia {

    private int numeroDia;
    private String diaSemana;
    private double temperatura;

    public Dia() {
        this.numeroDia = 0;
        this.diaSemana = "";
        this.temperatura = 0.0;
    }

    public Dia(int numeroDia, String diaSemana, double temperatura) {
        this.numeroDia = numeroDia;
        this.diaSemana = diaSemana;
        this.temperatura = temperatura;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return diaSemana + " dia " + numeroDia + ": " + temperatura + " grados";
    }
}
