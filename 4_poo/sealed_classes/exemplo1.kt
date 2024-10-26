// as sealed class permite que você restrinja o uso de herança. Uma vez que você declara uma classe sealed, ela só pode ser subclassificada de dentro do mesmo pacote onde a classe sealed é declarada.

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String{
    when(mammal){
        is Cat -> return "Olá ${mammal.name}"
        is Human -> return "Olá ${mammal.name}, Voce está trabalhando de ${mammal.job}"
    }


}

fun main(){
    val human: Mammal = Human("Kaynan", "Desenvolvedor Full-Stack")
    val cat: Mammal = Cat("Snopy")
    println(greetMammal(cat))
    println(greetMammal(human))

}