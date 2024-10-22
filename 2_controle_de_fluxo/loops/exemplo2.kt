fun eatACake() = println("Comeu o bolo")
fun bakeACake() = println("Assou um bolo")

fun main(){
    var cakesEaten = 0  // Bolos comidos
    var cakesBaked = 0  // Bolos assados

    while(cakesEaten < 5){
        eatACake()          
        cakesEaten ++
    }

    do {
        bakeACake()
        cakesBaked++
    } while(cakesBaked < cakesEaten)

}