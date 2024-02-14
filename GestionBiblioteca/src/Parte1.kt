/**
 * Representa un libro con información sobre su título, autor y año de publicación.
 *
 * @property titulo El título del libro.
 * @property autor El nombre del autor del libro.
 * @property anioPublicacion El año de publicación del libro.
 */
data class Libro(val titulo: String, val autor: String, val anioPublicacion: Int)

/**
 * Representa una revista con información sobre su título, número de edición y año de publicación.
 *
 * @property titulo El título de la revista.
 * @property issue El número de edición de la revista.
 * @property anio El año de publicación de la revista.
 */
data class Revista(val titulo: String, val issue : Int, val anio: Int)

/**
 * Representa un DVD con información sobre su título, director y año de lanzamiento.
 *
 * @property titulo El título del DVD.
 * @property director El nombre del director del DVD.
 * @property anio El año de lanzamiento del DVD.
 */
data class DVD(val titulo: String, val director: String, val anio: Int)