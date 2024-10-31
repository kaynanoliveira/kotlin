val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // Criando a lista 
val sudoers: List<Int> = systemUsers // Criando uma váriavel de leitura / consulta

fun addSystemUser(newUser: Int){    // Função para adicionar um novo usuario
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int>{    // Função somente de retorno da leitura da lista
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("Lista atualizada: ${getSysSudoers().size}") // size retorna o tamanho
    getSysSudoers().forEach {  // o forEach intera sobre cada elemento da lista
       i -> println("algumas informacoes uteis sobre o usuário $i")}
    // getSysSudoers().add(5)  // Error
}

