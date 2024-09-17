import kotlin.collections.contentToString

fun main() {

    println("Сколько будет элементов?")
    var sumIngredients: Int = readln().toInt()
    var ingredients: Array<String> = arrayOf()

    for (i in 1..sumIngredients) {
        ingredients += readln().toString()
    }

    println(ingredients.contentToString())

}