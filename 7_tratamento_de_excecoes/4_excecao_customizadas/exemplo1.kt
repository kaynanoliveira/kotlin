// Criando minha própria execeção herdando de Throwable
class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(name: String, age: Int){
    if(age < 16){
        throw IllegalVoterException("$name não pode votar!")
    } else {
        println("Voto de $name realizado com sucesso!")
    }
}


fun main(){
    var quantidadeVotos = 0;
    quantidadeVotos += try{vote("Kaynan", 18); 1;} catch (e:IllegalVoterException){0}
    quantidadeVotos += try{vote("Kevin", 30); 1;} catch (e:IllegalVoterException){0}
    quantidadeVotos += try{vote("Julia", 10); 1;} catch (e:IllegalVoterException){0}
    println(quantidadeVotos)
}