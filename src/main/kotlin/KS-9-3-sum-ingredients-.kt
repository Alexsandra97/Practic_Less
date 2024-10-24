fun main() {

    var mapIngredients = mutableMapOf("яйца" to 2, "молоко" to 50, "сливочное масло" to 15)
    println(mapIngredients)

    println("Какое количество порций нужно приготовить?")
    val sumPortion: Int = readln().toInt()

    mapIngredients.map {
        mapIngredients[it.key] = it.value * sumPortion
    }

    println("На $sumPortion порций вам понадобится: $mapIngredients")

}