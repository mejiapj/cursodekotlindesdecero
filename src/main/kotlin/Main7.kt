fun main(args: Array<String>) {

    var nombre: String? = null
    println(nombre?.length)
    try {
        throw NullPointerException("Referencia nula")
    } catch (excepcion: NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error... Cerrando aplicación")
    }
    val primerValor = 0
    val segundoValor = 0
    val resultado: Int = try {
        primerValor / segundoValor
    } catch (exception: Exception) {
        0
    }
    println(resultado)

}