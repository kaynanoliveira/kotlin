// Uma Extension Function permite que você defina uma função para uma classe já existente. Essa função age como se fosse uma função membro da própria classe.

// As Extension Properties permitem adicionar propriedades a uma classe, sem modificá-la. Elas são úteis quando se quer adicionar uma "propriedade" que, na verdade, é um cálculo ou um valor derivado.

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull {it.price}?.price ?: 0F

fun Order.maxPricedItemName() = this.items.maxByOrNull {it.price}?.name ?: "NO_PRODUCT"

val Order.commaDelimitedItemNames: String
    get() = items.map {it.name}.joinToString()

fun main(){
    
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Nome do item com preço máximo: ${order.maxPricedItemName()}") 
    println("Valor máximo do item com preço: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                      

}
