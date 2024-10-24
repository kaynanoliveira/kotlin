// class com parametro

open class Tiger(val origim: String) {
    fun sayHello(){
        println("O tigre $origim diz: grhhhh!!")
    }
}

class tigerSiberian: Tiger("Siberiano")

fun main(){
    val tiger: Tiger = tigerSiberian()
    tiger.sayHello()
}