fun main() {

    val ingredientsDish: Array<String> = arrayOf("яйца", "мука", "соль", "сахар", "кефир", "масло")
    println("Какой ингредиент вы хотите найти?")
    var findIngredient = readln().toString()

    val containsIngredient = ingredientsDish.contains(findIngredient)
    if (containsIngredient == true)
        println("Ингредиент $findIngredient в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")

}