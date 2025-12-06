/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio6;

/**
 *
 * @author danie
 */
public class Libro implements Transformable {
    //atributos propios
    private String titulo;
    private String autor;
    private String genero;
    
    //onstructores
    //por defecto
    public Libro(){
    titulo="";
    autor="";
    genero="";
    }
    //parametrizado
    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    //metodos implementados 
    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero;
    }
    
    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0);
    }
    
    @Override
    public void contarVocales() {
       int contador = 0;
        String todas = (titulo + autor + genero).toLowerCase();//toLowerCase las convierte todas en minusculas
        
        for (int i = 0; i < todas.length(); i++) { //mientras i sea menor al string de los atributos se sumara una
            char c = todas.charAt(i);//
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {//si alguna se cumple se sumara 1 al contador
                contador++;
            }
        }
        System.out.println("Total de vocales en la persona: " + contador);
    }
    
    @Override
    public String obtenerCadenaMasLarga() {
        String masLarga = titulo;
        if (autor.length() > masLarga.length()) { //si autor es mas larga que titulo en la variable masLarga se guarda el autor
            masLarga = autor;
        }
        if (genero.length() > masLarga.length()) { //lo mismo si genero es mas larga que titulo o que autor se cambia mas larga a genero
            masLarga = genero;
        }
        return masLarga; //devuelve la palabra mas larga
    }
    
    @Override
    public boolean buscarCadena(String cadena) {
        return titulo.equals(cadena) || autor.equals(cadena) || genero.equals(cadena); //equals sirve para comparar 
    }
    
    //to String
    @Override
    public String toString() {
        return "Libro titulo= " + titulo + " autor=" + autor + " genero=" + genero;
    }
}