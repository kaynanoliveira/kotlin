// uma open class é uma classe que pode ser herdada por outras classes. Em Kotlin, todas as classes são final (ou seja, não podem ser herdadas) por padrão.

open class Dog() {
    open fun latir(){           // a open fun permite que essa função seja
        println("Au, au!")      // sobrescrita.
    }
}

class pinxer: Dog()


class pitBull: Dog() {
    override fun latir(){       // override fun está sobrescrevendo a função latir
        println("wow wow!")
    }
}

fun main(){
    val dog: Dog = pitBull()
    dog.latir()

    val dog2 = pinxer()
    dog2.latir()
}