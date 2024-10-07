interface Search {

    fun findAccessories() {
        println("Выполняется поиск")
    }

}

open class Categories(
    val name: String,
    val quantityStock: Int
)

class Accessories(name: String, quantityStock: Int) : Search,
    Categories(name, quantityStock)

class Instruments(name: String, quantityStock: Int) : Search, Categories(name, quantityStock)  {
    override fun findAccessories() {
        super.findAccessories()
    }
}