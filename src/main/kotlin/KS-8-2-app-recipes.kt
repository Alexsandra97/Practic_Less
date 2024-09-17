fun main() {

    val ingredientsDish: Array<String> = arrayOf("яйца", "мука", "соль", "сахар", "кефир", "масло")
    println("Какой ингредиент вы хотите найти?")
    val findIngredient = readln().toString()

    for (i in ingredientsDish) {
        if (findIngredient == i) {
            println("Ингредиент $findIngredient в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}