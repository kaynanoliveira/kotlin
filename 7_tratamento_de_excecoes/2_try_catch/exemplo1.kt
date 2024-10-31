fun main(){
    val a = 10
    val b = 0

    try {    // Tentar
        val division = a / b 
        println(division)
    } catch (e: ArithmeticException){
        println("Ocorreu uma exceção aritmetica!")
    } catch (e: Throwable){
        println(e.message)
    } finally {     // Vai ser executado independente de sucesso ou falha
        println("Finally executado!")
    }

}