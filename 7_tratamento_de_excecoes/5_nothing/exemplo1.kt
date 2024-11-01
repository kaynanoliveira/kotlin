// nothing é um tipo especial que representa a ausência de um valor. Ele é usado em situações onde uma função nunca retorna um valor. Esse tipo é útil para indicar que uma função ou expressão nunca terá um resultado válido.

data class Person(val name: String?)

fun fail(message: String?): Nothing {
    throw IllegalArgumentException(message)
}

fun main(){
    val person = Person(null)
    val s = person.name ?: fail("Name Required")
    println(s)
}