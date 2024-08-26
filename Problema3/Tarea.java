package Problema3;

public class Tarea {

    /** Nombre de la tarea */
    private String nombre;

    private String tipo;

    /** Estimación de horas necesarias para completar la tarea */
    private int estimacionHoras;

    /** Tiempo real registrado en horas para la tarea */
    private int tiempoReal;

    private String estado;

    /** Miembro del equipo al que se le ha asignado la tarea */
    private MiembroEquipo miembroAsignado;


    public Tarea(String nombre, String tipo, int estimacionHoras) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estimacionHoras = estimacionHoras;
        this.tiempoReal = 0; // Inicializa el tiempo real en 0 horas
        this.estado = "No iniciada"; // La tarea comienza con el estado "No iniciada"
    }


    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    /**
     * Registra el tiempo trabajado en la tarea, sumando las horas al tiempo real.
     *
     * @param horas Cantidad de horas trabajadas a registrar.
     */
    public void registrarTiempo(int horas) {
        this.tiempoReal += horas;
    }

    /**
     * Asigna un miembro del equipo a la tarea.
     *
     * @param miembro El miembro del equipo que se asigna a esta tarea.
     */
    public void setMiembroAsignado(MiembroEquipo miembro) {
        this.miembroAsignado = miembro;
    }

    /**
     * Devuelve el nombre de la tarea.
     *
     * @return El nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el tipo de la tarea.
     *
     * @return El tipo de la tarea.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Devuelve la estimación de horas necesarias para completar la tarea.
     *
     * @return La estimación de horas de la tarea.
     */
    public int getEstimacionHoras() {
        return estimacionHoras;
    }

    /**
     * Devuelve el tiempo real registrado para la tarea.
     *
     * @return El tiempo real invertido en la tarea.
     */
    public int getTiempoReal() {
        return tiempoReal;
    }

    /**
     * Devuelve el estado actual de la tarea.
     *
     * @return El estado de la tarea.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Devuelve el miembro del equipo asignado a la tarea.
     *
     * @return El miembro del equipo asignado.
     */
    public MiembroEquipo getMiembroAsignado() {
        return miembroAsignado;
    }
}
