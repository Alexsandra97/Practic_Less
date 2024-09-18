fun main() {

    val mutablelistIngredients: MutableList<String> = mutableListOf("помидор", "огурец", "масло")
    println("В рецепте есть базовые ингредиенты: $mutablelistIngredients")

    println("Желаете добавить еще?")
    val answer: String = readln().toString()
    if (answer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient: String = readln().toString()
        mutablelistIngredients.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $mutablelistIngredients")
    }

}