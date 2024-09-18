fun main() {

    val ingredientsDish: Array<String> = arrayOf("яйца", "мука", "соль", "сахар", "кефир", "масло")
    println("Список ингредиентов: ${ingredientsDish.contentToString()} ")

    println("Какой ингредиент хотите заменить?")
    var replacementIngredient = readln()

    if (ingredientsDish.indexOf(replacementIngredient) >= 0) {
        println("Какой ингридиент хотите добавить?")
        val newIngredient = readln().toString()
        ingredientsDish[ingredientsDish.indexOf(replacementIngredient)] = newIngredient
    } else {
        println("Такого ингредиента в рецепте нет")
        return
    }

    println("Готово! Вы сохранили следующий список: ${ingredientsDish.contentToString()} ")

}