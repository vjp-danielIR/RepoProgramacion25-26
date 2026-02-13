/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9_ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class TEMA9_Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        
        // Pedimos el usuario
        System.out.print("Introduce el nombre de usuario: ");
        String usuario = entrada.next();
        
        // Pedimos la contraseña
        System.out.print("Introduce la contraseña: ");
        String contrasena = entrada.next();
        
        // Validamos la contraseña
        if (validarContrasena(usuario, contrasena)) {
            System.out.println("Contraseña correacta");
        } else {
            System.out.println("Contraseña incorrecta");
        }
        
       
    }
    
    //metodo para validar una contraseña y usuario
    public static boolean validarContrasena(String usuario, String contrasena) {
        //  Mínimo 8 caracteres
        if (contrasena.length() < 8) {
            System.out.println("Error: La contraseña debe tener al menos 6 caracteres");
            return false;
        }
        
        
        // El usuario no puede estar en la contraseña
        if (contrasena.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("Error: La contraseña no puede contener el nombre de usuario");
            return false;
        }
        
        // Si pasa todas las validaciones
        return true;
    }}