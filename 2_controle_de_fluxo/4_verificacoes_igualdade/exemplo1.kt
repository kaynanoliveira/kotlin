// A função setOf em Kotlin é usada para criar um conjunto (Set) imutável de elementos. Um Set é uma coleção que não permite elementos duplicados e a ordem dos elementos não é garantida

fun main(){

val autors = setOf("Shakespeare", "Hemingway", "Twain")
val writers = setOf("Twain", "Shakespeare", "Hemingway")

println(autors == writers)  // Compara se o conteúdo dos objetos são igual.
println(writers === autors) // Compara se as referências são exatamente as mesmas (ou seja, se apontam para o mesmo objeto na memória).
}