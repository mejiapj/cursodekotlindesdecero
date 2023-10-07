

fun main(args: Array<String>) {
    val moviles = mutableListOf("Google pixel 2XL", "google Pixel 4A", "Huawei Redmi 9", "Xaomi mi a3").apply {
        removeIf { movil -> movil.contains("Google") }
    }
    println(moviles)
    val colores: MutableList<String>? = mutableListOf("Amarillo", "Azul", "Rojo")
    colores?.apply {
        println("nuestros colores son $this")
        println("la cantidad de colores $size")
    }
}
