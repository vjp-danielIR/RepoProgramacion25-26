/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ejercicio4;

/**
 *
 * @author alumno
 */
public abstract class Leones extends Felinos {
       //no pide atributos propios asique no tiene atributos
//constructor por defecto
    public Leones(){
    super();
    }
    //constructor parametrizado
    public Leones(String Nombre, int Edad, double Peso){
    super(Nombre, Edad, Peso);
    }
   
    //metodos para mostrar el sonido que hace el animal
    @Override
    public void sonidoAnimal() {
        System.out.println("el sonido del leon es el : ''");
    }
    //metodo para mostrar que alimentacion tiene el animal
    @Override
    public void alimentacionAnimal() {
        System.out.println("La alimentacion del leon es 'Carnivora'");
     }
    //metodo para mostrar el habitad del animal
    @Override
    public void habitadAnimal() {
        System.out.println("El habitad del leon es 'Sabana'");
       }
    //metodo para mostrar el nombre cientifico del animal
    @Override
    public void nombreCientificoAnimal() {
        System.out.println("El nombre cientrifico del leon es ''");
         }
}