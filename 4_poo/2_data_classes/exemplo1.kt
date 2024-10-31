// Data Class é uma classe especializada que tem como objetivo principal armazenar dados. Essas classes oferecem automaticamente várias funcionalidades úteis, como métodos de toString(), equals(), hashCode(), e copy().

data class User(val name: String, val idade: Int)

fun main(){ 
    val user1 = User("Kaynan", 18)
    val user2 = User("Kaynan", 18)

    // função toString
    println(user1)

    // função equals
    println(user1 == user2)

    // função Copy
    val user3 = user1.copy("Julia")
    println(user3)

    // função hashCode
    println(user1.hashCode())
    println(user2.hashCode())
    println(user3.hashCode())
}