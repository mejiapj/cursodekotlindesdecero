fun main(args: Array<String>) {
    val nombre1 = "Maria"
    if (nombre1.isNotEmpty()) {
        println("El largo de nuestra variable es ${nombre1.length}")
    } else {
        println("Error, la variable esta vacia")
    }

    var mensaje: String = if (nombre1.length > 4) {
        "Tu mensaje es largo"

    } else if (nombre1.isEmpty()) {
        "Nombre esta vacio"
    } else {
        "Tienes un nombre corto"
    }
    println(mensaje)
}