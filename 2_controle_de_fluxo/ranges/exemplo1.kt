// Intervalos em Kotlin de números

fun main(){
for(i in 0..3){          // vai do numero inicial ate o ultimo
    print(i)
}
println(" ")

for(i in 1 until 5){     // vai do numero inicial ate o final e exclui o ultimo.
    print(i)             
}
println(" ")

for(i in 1..10 step 2){  // vai do numero inicial ate o final pulando de 2 em 2.
    print(i)
}
println(" ")

for(i in 5 downTo 0 ){  // vai de trás pra frente 
    print(i)
}
println(" ")
}