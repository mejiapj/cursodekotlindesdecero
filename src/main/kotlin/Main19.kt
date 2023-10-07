fun main(args: Array<String>) {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4A", "Huawei Redmi 9", "Xaomi mi a3")
        .run {
            removeIf { movil -> movil.contains("Google") }
            this
        }
    println(moviles)
}