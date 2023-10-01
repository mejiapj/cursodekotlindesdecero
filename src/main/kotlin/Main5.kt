fun main(args: Array<String>) {

var contador = 10
while (contador>0) {
    println("El valor de contador es $contador");
    contador--
}

    do {
        println("Generando numero aleatorio...")
        val numeroAletorio = (0..100).random()
        println("El numero generado es $numeroAletorio")
    } while (numeroAletorio>50)

}