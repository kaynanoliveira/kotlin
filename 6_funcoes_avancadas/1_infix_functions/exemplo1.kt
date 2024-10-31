// Funções de membro e extensões com um único parâmetro.

fun main(){
    infix fun Int.times(str: String) = str.repeat(this)
        println(2 times "Bye ")

    val pair = "Ferrari" to "McLaren"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Kaynan" onto "Julia"
    println(myPair)

    val julia = Person("Julia")
    val kaynan = Person("Kaynan")
    kaynan likes julia

}

class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other)}
}