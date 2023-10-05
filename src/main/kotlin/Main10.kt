fun main(args: Array<String>) {
    val numerosDeLoteria = listOf(11, 22, 43, 56, 78, 66)
    val numerosSorted = numerosDeLoteria.sorted()
    println(numerosSorted)

    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)
    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAletorios = numerosDeLoteria.shuffled()
    println(numerosAletorios)

    val numerosEnReversa = numerosDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)
    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)

}