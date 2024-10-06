interface Search {
    val name: String
    val quantityStock: Int

    fun findAccessories() {
        println("Выполняется поиск")
    }

}

class Accessories(override val name: String, override val quantityStock: Int): Search

class Instruments(override val name: String, override val quantityStock: Int): Search {
    override fun findAccessories() {
        super.findAccessories()
    }
}