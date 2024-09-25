const val LENGTH_LIST = 5

fun main() {
    var ingredients: MutableSet<String> = mutableSetOf()

    do {
        ingredients.add(readln())
    } while (ingredients.size != LENGTH_LIST)

    val sortIngredientList: MutableList<String> = ingredients.sorted() as MutableList<String>
    println(
        (sortIngredientList.joinToString(separator = ", ", postfix = "."))
            .replaceFirstChar { it.uppercase() }
    )
}