// with é uma função não-extensiva que pode acessar membros de seu argumento de forma concisa: você pode omitir o nome da instância ao se referir a seus membros.

class Configuration(val host: String, val port: Int)

fun main(){

    val configuration = Configuration(host = "101.02.021", port = 9000)

    with(configuration){
        println("$host : $port")
    }
}