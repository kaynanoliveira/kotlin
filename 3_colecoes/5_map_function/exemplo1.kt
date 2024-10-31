fun main(){
    val numeros = listOf(1, 2, 3, 4, 5, 6)

    val duplicado = numeros.map { x -> x * 2}
    val triplicado = numeros.map { it * 3}

    println("Numeros: $numeros")
    println("Numeros Duplicados: $duplicado")
    println("Numeros Triplicados: $triplicado")
}