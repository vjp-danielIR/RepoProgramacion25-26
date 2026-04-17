/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema10_ejercicio15;

import java.util.*;

/**
 *
 * @author danie
 */
public class TEMA10_Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Empresa> empresas = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ DE GESTIÓN ---");
            System.out.println("1. Introducir empresas y empleados");
            System.out.println("2. Mostrar todo");
            System.out.println("3. Empleados con letra 'A'");
            System.out.println("4. Ordenar por sueldo");
            System.out.println("5. Salir");

            try {
                // Usamos pedirInt que ya gestiona su propio Scanner
                opcion = pedirInt("Seleccione una opción: ");

                switch (opcion) {
                    case 1 ->
                        agregarEmpresas(empresas);
                    case 2 ->
                        mostrarEmpresas(empresas);
                    case 3 ->
                        mostrarEmpleadosConA(empresas);
                    case 4 ->
                        mostrarOrdenadosPorSueldo(empresas);
                    case 5 ->
                        System.out.println("Saliendo del sistema...");
                    default ->
                        System.out.println("Error: La opción " + opcion + " no existe.");
                }
            } catch (Exception e) {
                System.out.println("Error: Debes introducir un número entero.");
            }

        } while (opcion != 5);
    }

    public static String pedirString(String mensaje) {
        System.out.print(mensaje);
        Scanner entrada = new Scanner(System.in);
        String pedir = entrada.next();
        return pedir;
    }

    public static int pedirInt(String mensaje) {

        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        int opcion = entrada.nextInt();
        return opcion;
    }

    // Crea y añade empresas a la lista principal
    public static void agregarEmpresas(List<Empresa> empresas) {
        do {
            Empresa empresa = new Empresa(pedirString("Nombre de la empresa: "));
            agregarEmpleadosAEmpresa(empresa);
            empresas.add(empresa);
        } while (pedirString("Añadir mas empresas? (s/n): ").equalsIgnoreCase("s"));
    }

    // Pide datos de empleados para asignarlos a una empresa específica
    public static void agregarEmpleadosAEmpresa(Empresa empresa) {
        int contador = 1;
        do {
            String nombre = pedirString("Nombre del empleado " + contador + ": ");
            int sueldo = pedirInt("Sueldo del empleado " + contador + ": ");
            empresa.getListaEmpleados().add(new Empleados(nombre, sueldo));
            contador++;
        } while (pedirString("¿Añadir más empleados? (Si/No): ").equalsIgnoreCase("Si"));
    }

    // Muestra todas las empresas registradas y sus listas de empleados
    public static void mostrarEmpresas(List<Empresa> empresas) {
        if (empresas.isEmpty()) {
            System.out.println("Lista vacía.");
        } else {
            empresas.forEach(e -> System.out.print(e.toString()));
        }
    }

    // Filtra y muestra los nombres de empleados que contienen la letra 'A'
    public static void mostrarEmpleadosConA(List<Empresa> empresas) {
        List<String> nombres = new ArrayList<>();
        for (Empresa e : empresas) {
            for (Empleados em : e.getListaEmpleados()) {
                if (em.getNombreEmpleado().toLowerCase().contains("a")) {
                    nombres.add(em.getNombreEmpleado());
                }
            }
        }
        System.out.println(nombres.isEmpty() ? "" : String.join(" - ", nombres));
    }

    // Reúne a todos los empleados y los muestra ordenados de mayor a menor sueldo
    public static void mostrarOrdenadosPorSueldo(List<Empresa> empresas) {
        List<Empleados> todos = new ArrayList<>();
        for (Empresa e : empresas) {
            todos.addAll(e.getListaEmpleados());
        }

        if (!todos.isEmpty()) {
            todos.sort((e1, e2) -> Integer.compare(e2.getSueldo(), e1.getSueldo()));
            todos.forEach(e -> System.out.print(e.toString() + " "));
            System.out.println();
        }
    }
}
