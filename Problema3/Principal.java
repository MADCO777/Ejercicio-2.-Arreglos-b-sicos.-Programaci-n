package Problema3;

import java.util.Scanner;

/**
 * La clase Principal contiene el método main, que sirve como punto de entrada del programa.
 * En este programa, se crean miembros del equipo, proyectos y tareas,
 * se asignan tareas a los miembros y se genera un reporte del proyecto.
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear algunos miembros del equipo y proyectos de ejemplo
        MiembroEquipo junior1 = new MiembroEquipo("Juan", "Junior");
        MiembroEquipo senior1 = new MiembroEquipo("Ana", "Senior");
        Proyecto proyecto1 = new Proyecto("001", "Desarrollo de App", junior1, senior1, "2024-12-31");

        MiembroEquipo junior2 = new MiembroEquipo("Carlos", "Junior");
        MiembroEquipo senior2 = new MiembroEquipo("Marta", "Senior");
        Proyecto proyecto2 = new Proyecto("002", "Mantenimiento de Sistema", junior2, senior2, "2024-11-30");

        // Crear y asignar tareas a los miembros del equipo
        Tarea tarea1 = new Tarea("Crear Base de Datos", "Desarrollo", 10);
        Tarea tarea2 = new Tarea("Escribir Documentación", "Documentación", 5);

        try {
            // Asignar tareas a los miembros del equipo y manejar posibles excepciones
            junior1.asignarTarea(tarea1, 10);
            senior1.asignarTarea(tarea2, 5);
        } catch (Exception e) {
            // Imprimir un mensaje de error si se lanza una excepción durante la asignación
            System.out.println(e.getMessage());
        }

        // Agregar las tareas al proyecto
        proyecto1.agregarTarea(tarea1);
        proyecto1.agregarTarea(tarea2);

        // Generar un reporte del proyecto que contiene las tareas y miembros asignados
        proyecto1.generarReporte();

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
