fun main() {
    val ingredientsList: MutableList<String> = mutableListOf()
    do {
        ingredientsList.clear()
        println("Ведите 5 ингридиентов через запятую с пробелом")
        val ingredients: String = readln()

        val shareIngredient = ingredients.split(", ", limit = 5)
        for (oneIngredient in shareIngredient) {
            ingredientsList.add(oneIngredient)
        }

        println(ingredientsList.size)
    } while (ingredientsList.size != 5)
    println("Отсортированные рецепты: ${ingredientsList.sorted()}")

}
