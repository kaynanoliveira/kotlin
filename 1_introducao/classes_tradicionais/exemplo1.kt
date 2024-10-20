class Customer

class Contact(val id: Int, var email: String)

fun main(){
    val customer = Customer()
    val contact1 = Contact(1, "test@gmail.com")
    println(contact1.id)
    println(contact1.email)
}