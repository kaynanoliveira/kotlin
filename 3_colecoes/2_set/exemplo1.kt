// Não são ordenados iguais as listas e não permitem elementos duplicados.

val openIssues: MutableSet<String> = mutableSetOf("UniqueDescr1", "UniqueDescr2", "UniqueDescr3")

fun addIssue(UniqueDescr: String): Boolean {
    return openIssues.add(UniqueDescr)
}

fun getStatusLog(added: Boolean): String {
    return if(added) "Registrado com sucesso" else "Erro, marcado como duplicado e rejeitado!"
}

fun main(){
    val Issue4: String = "UniqueDescr4"
    val Issue5: String = "UniqueDescr2"  // forçando um erro

    println("Issue $Issue4 ${getStatusLog(addIssue(Issue4))}")
    println("Issue $Issue5 ${getStatusLog(addIssue(Issue5))}")
}
