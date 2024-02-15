
/**
 * Sealed class que representa un usuario de la biblioteca.
 */
sealed class Usuario{

    /**
     * Clase que representa un estudiante.
     *
     * @property id Identificador del estudiante.
     * @property nombre Nombre del estudiante.
     * @property carrera Carrera del estudiante.
     */
    data class Estudiante(val id: String, val nombre: String, val carrera: String): Usuario()

    /**
     * Clase que representa un profesor.
     *
     * @property id Identificador del profesor.
     * @property nombre Nombre del profesor.
     * @property departamento Departamento al que pertenece el profesor.
     */
    data class Profesor( val id: String, val nombre: String, val departamento: String) : Usuario()

    /**
     * Clase que representa un visitante.
     *
     * @property id Identificador del visitante.
     * @property nombre Nombre del visitante.
     */
    data class Visitante (val id: String, val nombre: String): Usuario()

}