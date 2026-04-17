/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema10_ejercicio15;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Empresa {

    private String nombreEmpresa;
    private List<Empleados> listaEmpleados;

    // Constructor por defecto
    public Empresa() {
        this.nombreEmpresa = "";
        this.listaEmpleados = new ArrayList<>();
    }

    // Constructor parametrizado
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaEmpleados = new ArrayList<>();
    }

    // Getters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public List<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    // Setters
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setListaEmpleados(List<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", listaEmpleados=" + listaEmpleados + '}';
    }
}
