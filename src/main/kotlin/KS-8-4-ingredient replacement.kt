fun main() {

    val ingredientsDish: Array<String> = arrayOf("яйца", "мука", "соль", "сахар", "кефир", "масло")
    println("Список ингредиентов: ${ingredientsDish.contentToString()} ")

    println("Какой ингредиент хотите заменить?")
    var replacementIngredient = readln()

    if (ingredientsDish.indexOf(replacementIngredient) < 0) {
        println("Такого ингредиента в рецепте нет")
        return
    } else {
        println("Какой ингридиент хотите добавить?")
        var newIngredient = readln().toString()
        ingredientsDish[ingredientsDish.indexOf(replacementIngredient)] = newIngredient
    }

    println("Готово! Вы сохранили следующий список: ${ingredientsDish.contentToString()} ")

}