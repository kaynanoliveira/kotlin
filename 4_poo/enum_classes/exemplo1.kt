// enum class são usados ​​para modelar tipos que representam um conjunto finito de valores distintos, como direções, estados, modos e assim por diante.

enum class DiaDaSemana {
    SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA
}

fun main(){
    val dia = DiaDaSemana.SEGUNDA
    val mensagem = when(dia){
        DiaDaSemana.SEGUNDA -> "Hoje é Segunda"
        DiaDaSemana.TERÇA -> "Hoje é Terça"
        DiaDaSemana.QUARTA -> "Hoje é Quarta"
        DiaDaSemana.QUINTA -> "Hoje é Quinta"
        DiaDaSemana.SEXTA -> "Hoje é Sexta"
    }
    print(mensagem)
}