/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubdeportivo_danieliglesias;

/**
 *
 * @author Daniel_Iglesias
 */
public class Equipos implements Comparable {
    //atributos 

    private String nombre;
    private int codigoEquipo;
    private int numeroTrofeos;

    //constructor por defecto
    public Equipos() {
        this.nombre = "";
        this.codigoEquipo = 0;
        this.numeroTrofeos = 0;
    }
//contructor parametrizado

    public Equipos(String nombre, int codigoEquipo, int numeroTrofeos) {
        this.nombre = nombre;
        this.codigoEquipo = codigoEquipo;
        this.numeroTrofeos = numeroTrofeos;
    }
//getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public int getNumeroTrofeos() {
        return numeroTrofeos;
    }

    public void setNumeroTrofeos(int numeroTrofeos) {
        this.numeroTrofeos = numeroTrofeos;
    }

 

    //mostrar objeto
    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", codigoEquipo=" + codigoEquipo + ", numeroTrofeos=" + numeroTrofeos + '}';
    }

    //metodo abstracto de comparable sirve para comparar 2 objetos de 1 tipo en este caso los numeros de trofeos
    @Override
    public int compareTo(Object o) {
        // no recuerdo como se escribia  Comparable trofeo= Integer.compare(t1.numeroTrofeos(),t2.numeroTrofeos())->
        return 0;

    }

}
