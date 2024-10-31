fun main(){
    val x = 2
    if(x in 1..5){
        println("X está no intervalo de 1 a 5.")
    }

    if(x !in 6..10){
        println("X não está no intervalo de 6 e 10")
    }
}