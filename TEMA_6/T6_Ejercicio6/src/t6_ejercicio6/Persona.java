/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio6;

/**
 *
 * @author danie
 */
public class Persona implements Transformable {
    //atributos propios
    private String nombre;
    private String apellidos;
    private String alias;
    
    
    //constructores
    //por defecto
    public Persona(){
    nombre="";
    apellidos="";
    alias="";
    }
    
    //parametrizado
    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    //metodos implementados
    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias; 
    }
    
    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
    }
    
    @Override
    public void contarVocales() {
        int contador = 0;
        String todas = (nombre + apellidos + alias).toLowerCase();//toLowerCase las convierte todas en minusculas
        
        for (int i = 0; i < todas.length(); i++) {//mientras i sea menor al string de los atributos se sumara una
            char c = todas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {//si alguna se cumple se sumara 1 al contador
                contador++;
            }
        }
        System.out.println("Total de vocales en la persona: " + contador);
    }
    
    @Override
    public String obtenerCadenaMasLarga() {
        String masLarga = nombre;
        if (apellidos.length() > masLarga.length()) { //si autor es mas larga que titulo en la variable masLarga se guarda el autor
            masLarga = apellidos;
        }
        if (alias.length() > masLarga.length()) {//lo mismo si genero es mas larga que titulo o que autor se cambia mas larga a genero
            masLarga = alias;
        }
        return masLarga; //devuelve la palabra mas larga
    }
    
    @Override
    public boolean buscarCadena(String cadena) {
        return nombre.equals(cadena) || apellidos.equals(cadena) || alias.equals(cadena);//equals sirve para comparar 
    }
    
    //to String
    @Override
    public String toString() {
        return "Persona  nombre=" + nombre + " apellidos='" + apellidos + " alias= " + alias;
    }
}