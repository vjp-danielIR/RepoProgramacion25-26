/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garaje;

/**
 *
 * @author alumno
 */
public class Coches {

    //atributos de la clase
    private String matricula;
    private String nomTitular;

    //constructor por defecto
    public Coches() {
        this.matricula = "";
        this.nomTitular = "";
    }

    //constructor parametrizado
    public Coches(String matricula, String nomTitular) {
        this.matricula = matricula;
        this.nomTitular = nomTitular;
    }

    //getter y setters para obtener y establecer
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    //metodo to string para mostrar el objeto
    @Override
    public String toString() {
        return "Coches{" + "matricula=" + matricula + ", nomTitular=" + nomTitular + '}';
    }

}
