/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema12_ejercicio13;

/**
 *
 * @author Daniel_Iglesias
 */
public class Becario {

    //atributos
    private String nombre;
    private String sexo;
    private int edad;
    private int suspensos;
    private String residencia;
    private double ingresos;

    // constructor por defecto
    public Becario() {
        nombre = "";
        sexo = "";
        edad = 0;
        suspensos = 0;
        residencia = "";
        ingresos = 0.0;
    }

    // constructor con parametros
    public Becario(String nombre, String sexo, int edad, int suspensos, String residencia, double ingresos) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.suspensos = suspensos;
        this.residencia = residencia;
        this.ingresos = ingresos;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSuspensos() {
        return suspensos;
    }

    public void setSuspensos(int suspensos) {
        this.suspensos = suspensos;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    // metodo privado (logica interna si quieres ampliarlo luego)
    private boolean tieneDerechoBeca() {
        return suspensos < 2;
    }

    // toString
    @Override
    public String toString() {
        return nombre + " - " + sexo + " - " + edad + " - "
                + suspensos + " - " + residencia + " - " + ingresos;
    }
}
