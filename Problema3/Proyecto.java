package Problema3;

import java.util.ArrayList;


public class Proyecto {

    /** Código de identificación del proyecto */
    private String codigo;

    /** Nombre del proyecto */
    private String nombre;

    /** Desarrollador junior asignado al proyecto */
    private MiembroEquipo desarrolladorJunior;

    /** Desarrollador senior asignado al proyecto */
    private MiembroEquipo desarrolladorSenior;

    /** Fecha límite de entrega del proyecto en formato "YYYY-MM-DD" */
    private String fechaLimite;

    /** Lista de tareas asociadas al proyecto */
    private ArrayList<Tarea> tareas;

    /**
     * Constructor que inicializa un proyecto con su código, nombre, desarrolladores y fecha límite.
     *
     * @param codigo Código de identificación del proyecto.
     * @param nombre Nombre del proyecto.
     * @param junior Desarrollador junior asignado al proyecto.
     * @param senior Desarrollador senior asignado al proyecto.
     * @param fechaLimite Fecha límite de entrega del proyecto.
     */
    public Proyecto(String codigo, String nombre, MiembroEquipo junior, MiembroEquipo senior, String fechaLimite) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.desarrolladorJunior = junior;
        this.desarrolladorSenior = senior;
        this.fechaLimite = fechaLimite;
        this.tareas = new ArrayList<>(); // Inicializa la lista de tareas como una lista vacía
    }

    /**
     * Agrega una nueva tarea al proyecto.
     *
     * @param tarea La tarea que se va a agregar al proyecto.
     */
    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    /**
     * Actualiza el estado de una tarea específica dentro del proyecto.
     *
     * @param idTarea Índice de la tarea en la lista de tareas.
     * @param nuevoEstado Nuevo estado de la tarea (por ejemplo, "En progreso", "Completada").
     */
    public void actualizarTarea(int idTarea, String nuevoEstado) {
        Tarea tarea = tareas.get(idTarea); // Obtiene la tarea por su índice en la lista
        tarea.actualizarEstado(nuevoEstado); // Actualiza el estado de la tarea
    }

    /**
     * Genera un reporte del proyecto mostrando el nombre del proyecto y
     * el estado de todas las tareas asociadas.
     */
    public void generarReporte() {
        System.out.println("Reporte del Proyecto: " + this.nombre);
        for (Tarea tarea : tareas) {
            System.out.println("Tarea: " + tarea.getNombre() + " | Estado: " + tarea.getEstado());
        }
    }

    /**
     * Devuelve el código de identificación del proyecto.
     *
     * @return El código del proyecto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Devuelve el nombre del proyecto.
     *
     * @return El nombre del proyecto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el desarrollador junior asignado al proyecto.
     *
     * @return El desarrollador junior.
     */
    public MiembroEquipo getDesarrolladorJunior() {
        return desarrolladorJunior;
    }

    /**
     * Devuelve el desarrollador senior asignado al proyecto.
     *
     * @return El desarrollador senior.
     */
    public MiembroEquipo getDesarrolladorSenior() {
        return desarrolladorSenior;
    }

    /**
     * Devuelve la fecha límite de entrega del proyecto.
     *
     * @return La fecha límite del proyecto.
     */
    public String getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Devuelve la lista de tareas asociadas al proyecto.
     *
     * @return La lista de tareas.
     */
    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
}
