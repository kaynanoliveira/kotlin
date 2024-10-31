fun printMessage(message: String): Unit{
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun soma(x: Int, y: Int):Int{
    return x + y
}

fun multiplicacao(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix("Hello","Log")
    println(soma(10, 20))
    println(multiplicacao(5,5))

}