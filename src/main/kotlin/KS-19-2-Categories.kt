enum class Categories(categories: Int) {
    CLOTHES(0) { override fun getName(): String{
        return "Одежда"
    }},
    OFFICE_SUPPLIES(1){ override fun getName(): String{
        return "Канцелярские товары"
    }},
    DIFFERENT(2){ override fun getName(): String{
        return "Разное"
    }};
    abstract fun getName() : String
}

class Product(val id: Int, val name: String, val categories: Categories) {
    fun outputInformation() {
        println("Id: $id\nНазвание товара: $name\nКатегория товара: ${categories.getName()}")
    }
}

fun main() {
    val product1 = Product(1, "Свитер", Categories.CLOTHES )
    product1.outputInformation()
    println()

    val product2 = Product(2, "Тетрадь", Categories.OFFICE_SUPPLIES )
    product2.outputInformation()
    println()

    val product3 = Product(3, "Ваза", Categories.DIFFERENT )
    product3.outputInformation()
    println()
}