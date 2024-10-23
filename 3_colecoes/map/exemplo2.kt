const val POINTS_X_PASS = 15

val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int){
    if(EZPassAccounts.containsKey(accountId)){ // containsKey é usada para verificar se um Map contém uma chave específica.
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("ERRO: Voce ta tentando atualizar um AccountId que não existe (Id: $accountId)")
    }
}
fun accountsReport(){
    println("EZ-Pass Report: ")
    EZPassReport.forEach(){
        k, v -> println("ID: $k, CREDIT: $v")
    }
}

fun main(){
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}