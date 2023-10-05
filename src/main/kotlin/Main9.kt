fun main(args: Array<String>) {

    var listaDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listaDeNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primervalor = listaDeNombres.firstOrNull()
    println(primervalor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)

    listaVacia.removeIf { caracteres -> caracteres.length > 3 }
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array $myArray")
    println("Array como lista ${myArray.toList()}")
}