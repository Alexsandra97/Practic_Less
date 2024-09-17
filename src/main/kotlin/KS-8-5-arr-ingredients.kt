fun main() {

    println("Сколько будет элементов?")
    val sumIngredients: Int = readln().toInt()

    val ingredients = Array(sumIngredients, {readln()})
    println(ingredients.contentToString())

}