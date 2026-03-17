/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema11_ejercicio3;

import java.util.*;

/**
 *
 * @author alumno
 */

public class Autobus {
    //atributos privados
    private String matricula;
    private HashMap<String, String> conductores;

    //constructor parametrizado
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }

    //getter y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }

    //mostrar el objeto 
    @Override
    public String toString() {
        String resultado = "Matrícula: " + matricula + "Conductores:";
        if (conductores.isEmpty()) {
            resultado += " ninguno";
        } else {
            for (String dni : conductores.keySet()) {
                resultado += "  DNI: " + dni + " - Nombre: " + conductores.get(dni);
            }
        }
        return resultado;
    }
}