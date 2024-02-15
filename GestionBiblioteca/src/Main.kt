
fun main() {

    val estudiante = Usuario.Estudiante("233", "Alberto", "Ingeniería")
    val profesor = Usuario.Profesor("053", "María del Carmen", "Física")
    val visitante = Usuario.Visitante("865", "Juan")

    val libro = Libro("La Ilíada", "Homero", 745 )

    println(tomarPrestado(estudiante, libro))
    println(tomarPrestado(profesor, libro))
    println(tomarPrestado(visitante, libro))

}

fun tomarPrestado(usuario: Usuario, libro: Libro): String {
    return when(usuario){
        is Usuario.Estudiante -> "El estudiante ${usuario.nombre} id: ${usuario.id} puede tomar prestado el libro '${libro.titulo}'."
        is Usuario.Profesor -> "El profesor ${usuario.nombre} departamento: ${usuario.departamento} , puede tomar prestado el libro '${libro.titulo}'"
       is Usuario.Visitante -> "Los visitantes no pueden tomar prestados libros"
    }
}