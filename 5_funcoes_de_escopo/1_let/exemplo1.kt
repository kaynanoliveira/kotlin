// let pode ser usada para escopo e verificações de nulos

fun customPrint(s: String){
    print(s.uppercase())
}

fun main(){
    val empty = "test".let(){
        customPrint(it)
        it.isEmpty()
    }
    println("é vazia: $empty")


    fun printNonNull(str: String?){
        println("Printing \"$str\":")

        str?.let{
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?){
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
        

            }

        }
    }

    printNonNull(null)
    printNonNull("string")
    printIfBothNonNull("First","Second") 
}