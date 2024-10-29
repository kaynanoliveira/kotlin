// Certas funções podem ser "atualizadas" para operadores, permitindo suas chamadas com o símbolo da operadora correspondente.

fun main(){
    operator fun Int.times(str: String) = str.repeat(this)
    println(5 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Sempre perdoe seus inimigos; nada os incomoda tanto"
    println(str[0..13])
}