fun main(){
    val numeros = listOf(1, -2, 3, -4, -5, 6)

    val positivos = numeros.filter { x -> x > 0}
    val negativos = numeros.filter { it < 0}

    println("Numeros: $numeros")
    println("Numeros Positivos: $positivos")
    println("Numeros Negativos: $negativos")
}