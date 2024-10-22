fun main(){
    var neverNull: String = "Isso não pode ser nulo"
    // neverNull = null

    var nullable: String? = "Você pode manter um nulo aqui"
    nullable = null

    var inferredNonNull = "O compilador assume não nulo"
    // inferredNonNull = null

    fun strLength(str: String?): Int{
        return str?.length ?: 0
    }

    println(strLength(neverNull))
    println(strLength(nullable))

}