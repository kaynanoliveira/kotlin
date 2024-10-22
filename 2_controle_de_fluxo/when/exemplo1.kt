fun cases(Obj: Any){
    when (Obj){
        1 -> println("Um")
        "Hello" -> println("Olá") 
        is Long -> println("Long")
        !is String -> println("Não é uma String")
        else -> println("Desconhecida")
    }
}

class Myclass()

fun main(){
    cases(1)
    cases("Hello")
    cases(0L)
    cases("hello")
    cases(Myclass())
}