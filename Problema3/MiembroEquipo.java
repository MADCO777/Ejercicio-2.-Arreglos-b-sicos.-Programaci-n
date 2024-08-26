package Problema3;

/**
 * La clase MiembroEquipo representa a un miembro de un equipo en un proyecto.
 * Cada miembro tiene un nombre, un rol dentro del equipo y un número de horas asignadas a sus tareas.

 * Se asume que un miembro del equipo no puede tener más de 40 horas asignadas a sus tareas.
 * Esta clase maneja la asignación de tareas y verifica que el límite de horas no sea excedido.
 */
public class MiembroEquipo {

    /** Nombre del miembro del equipo */
    private String nombre;

    /** Rol del miembro dentro del equipo (por ejemplo, desarrollador, diseñador, etc.) */
    private String rol;

    /** Cantidad de horas asignadas al miembro del equipo */
    private int horasAsignadas;

    /**
     * Constructor que inicializa un nuevo miembro del equipo con un nombre y un rol específico.
     *
     * @param nombre El nombre del miembro del equipo.
     * @param rol El rol que desempeña el miembro dentro del equipo.
     */
    public MiembroEquipo(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
        this.horasAsignadas = 0; // Se inicia con 0 horas asignadas
    }

    /**
     * Asigna una tarea a este miembro del equipo junto con un estimado de horas.
     * Verifica que las horas a asignar no excedan el límite de 40 horas.
     *
     * @param tarea La tarea que se va a asignar.
     * @param horasEstimadas El número de horas estimadas para completar la tarea.
     * @throws Exception Si las horas asignadas exceden las 40 horas, se lanza una excepción.
     */
    public void asignarTarea(Tarea tarea, int horasEstimadas) throws Exception {
        if (verificarHoras(horasEstimadas)) { // Verifica si se pueden asignar las horas sin exceder el límite
            this.horasAsignadas += horasEstimadas;
            tarea.setMiembroAsignado(this); // Asigna este miembro a la tarea
        } else {
            throw new Exception("No se pueden asignar más de 40 horas a este desarrollador.");
        }
    }

    /**
     * Verifica si el miembro puede aceptar un número adicional de horas sin exceder las 40 horas.
     *
     * @param nuevasHoras El número de horas adicionales que se desean asignar.
     * @return true si el número total de horas no excede las 40 horas; false en caso contrario.
     */
    public boolean verificarHoras(int nuevasHoras) {
        return (this.horasAsignadas + nuevasHoras) <= 40;
    }

    /**
     * Devuelve el nombre del miembro del equipo.
     *
     * @return El nombre del miembro del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el rol del miembro del equipo.
     *
     * @return El rol del miembro del equipo.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Devuelve la cantidad de horas que han sido asignadas a este miembro del equipo.
     *
     * @return El número de horas asignadas.
     */
    public int getHorasAsignadas() {
        return horasAsignadas;
    }
}
