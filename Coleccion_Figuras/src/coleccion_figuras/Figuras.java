/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccion_figuras;

/**
 *
 * @author alumno
 */
public class Figuras {
    //atributos
    private String nombrePerso;
    private double valor;
    private String coleccion;

    //constructores
    public Figuras() {
        this.nombrePerso ="" ;
        this.valor = 0;
        this.coleccion = "";
    }
    public Figuras(String nombrePerso, double valor, String coleccion) {
        this.nombrePerso = nombrePerso;
        this.valor = valor;
        this.coleccion = coleccion;
    }
    //GET Y SET
    public String getNombrePerso() {
        return nombrePerso;
    }

    public void setNombrePerso(String nombrePerso) {
        this.nombrePerso = nombrePerso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }
    //to string
    @Override
    public String toString() {
        return "Figuras{" + "nombrePerso=" + nombrePerso + ", valor=" + valor + ", coleccion=" + coleccion + '}';
    }
    
    
    
}
