fun main(args: Array<String>) {
    imprimirNombre( nombre="Giuseppe",  apellido="Vetri")
}

fun imprimirNombre(nombre: String, segundoNombre: String ="", apellido: String) {
    println("Mi nombre completo es$nombre $segundoNombre $apellido")
}
