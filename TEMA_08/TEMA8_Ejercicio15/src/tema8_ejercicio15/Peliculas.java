/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8_ejercicio15;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Peliculas {

        //ATRIBUTOS
    private String titulo;
    private int costeLicencia;
    private Socios[] socios;

    //CONSTRUCTOR POR DEFECTO Y PARAMETRIZADO
    public Peliculas(String titulo, int costeLicencia, Socios[] socios) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios= socios;
    }

    public Peliculas() {
         this.titulo = "";
        this.costeLicencia=0;
    }
    
 //GETTER Y SETTERS
    public Socios[] getSocios() {
        return socios;
    }

    public void setSocios(Socios[] socios) {
        this.socios = socios;
    }
    
       
    public String getTitulo(String nextLine) {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCosteLicencia(int nextLine) {
        return costeLicencia;
    }

    public void setCosteLicencia(int costeLicencia) {
        this.costeLicencia = costeLicencia;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", costeLicencia=" + costeLicencia + ", socios=" + Arrays.toString(socios) + '}';
    }
    

}
