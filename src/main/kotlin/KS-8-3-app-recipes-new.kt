fun main() {

    val ingredientsDish: Array<String> = arrayOf("яйца", "мука", "соль", "сахар", "кефир", "масло")
    println("Какой ингредиент вы хотите найти?")
    val findIngredient = readln().toString()

    if ((ingredientsDish.contains(findIngredient)) == true)
        println("Ингредиент $findIngredient в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")

}