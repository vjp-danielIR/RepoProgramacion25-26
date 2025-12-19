/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio4;

/**
 *
 * @author alumno
 */
public class Lobos extends Canidos{
        //no pide atributos propios asique no tiene atributos
//constructor por defecto
    public Lobos(){
    super();
    }
    //constructor parametrizado
    public Lobos (String Nombre, int Edad, double Peso){
    super(Nombre, Edad, Peso);
    }
    //metodos para mostrar el sonido que hace el animal
    @Override
    public void sonidoAnimal() {
        System.out.println("el sonido del lobo es el aullido: 'Auuuuu'");
    }
    //metodo para mostrar que alimentacion tiene el animal
    @Override
    public void alimentacionAnimal() {
        System.out.println("La alimentacion del lobo es 'Carnivora'");
     }
    //metodo para mostrar el habitad del animal
    @Override
    public void habitadAnimal() {
        System.out.println("El habitad del lobo es el 'Bosque'");
       }
    //metodo para mostrar el nombre cientifico del animal
    @Override
    public void nombreCientificoAnimal() {
        System.out.println("El nombre cientrifico del lobo es 'Canis Lupus'");
         }
}