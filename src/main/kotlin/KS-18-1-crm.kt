class Order {
    fun displayInformationOrder(
       idOrder: Int,
       product: String
    ) {
        println("Заказан товар: $product")
    }
    fun displayInformationOrder(
        idOrder: Int,
        product: List<String>
    ) {
        val productConclusion = product.joinToString(", ")
        print("Заказаны следующие товары: ")
        productConclusion.forEach{it -> print(it)}
    }
}

fun main() {
    val order1 = Order()
    order1.displayInformationOrder(1,listOf("шампунь", "маска", "бальзам"))
println()
    val order2 = Order()
    order2.displayInformationOrder(2, "штанишки")
}