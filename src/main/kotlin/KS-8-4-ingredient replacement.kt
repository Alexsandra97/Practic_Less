fun main() {

    val ingredientsDish: Array<String> = arrayOf("яйца", "мука", "соль", "сахар", "кефир", "масло")
    println("Список ингредиентов: ${ingredientsDish.contentToString()} ")

    println("Какой ингредиент хотите заменить?")
    var replacementIngredient = readln()
    val resultIndexOf = ingredientsDish.indexOf(replacementIngredient)

    if (resultIndexOf >= 0) {
        println("Какой ингридиент хотите добавить?")
        val newIngredient = readln().toString()
        ingredientsDish[resultIndexOf] = newIngredient
    } else {
        println("Такого ингредиента в рецепте нет")
        return
    }

    println("Готово! Вы сохранили следующий список: ${ingredientsDish.contentToString()} ")

}