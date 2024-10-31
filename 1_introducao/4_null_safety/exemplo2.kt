fun describeString(maybeString: String?): String{
    if(maybeString != null && maybeString.length > 0){
        return "Sequência de comprimento ${maybeString.length}"
    } else {
        return "String vazia ou nula"
    }
}


fun main(){
    println(describeString(""))
    println(describeString(null))
    println(describeString("Kaynan"))
}