// É uma função que recebe outra função como parâmetro e/ou retorna uma função.

fun calculate(x: Int, y: Int, operation: (Int, Int ) -> Int): Int {
     return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main(){
    val sumResult = calculate(5, 5, ::sum)
    val mulResult = calculate(5, 5) {x, y -> x * y }

    println(mulResult)
    println(sumResult)
}