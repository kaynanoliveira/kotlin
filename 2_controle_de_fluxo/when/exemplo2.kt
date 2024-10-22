fun whenAssing(obj: Any): Any{
    val result = when(obj){
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class Myclass()

fun main(){
    println(whenAssing(1))
    println(whenAssing("Hello"))
    println(whenAssing(3.4))
    println(whenAssing(Myclass()))
}
