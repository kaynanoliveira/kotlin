
fun main(){

    fun getNullableLength(ns: String?){
        println("for \"$ns\":")
        ns?.run {
            println("\tis empty?:" + isEmpty())
            println("\tlength = $length")
            length
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("Meu nome é Kaynan")
}

