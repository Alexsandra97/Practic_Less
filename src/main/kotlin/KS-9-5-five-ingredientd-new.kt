const val LENGTH_LIST = 5

fun main() {
    var ingredients: MutableSet<String> = mutableSetOf()
    var firstElement = ""

    do {
        ingredients.add(readln())
    } while (ingredients.size != LENGTH_LIST)

    val sortIngredientList: MutableList<String> = ingredients.sorted() as MutableList<String>
    for (i in sortIngredientList) {
        if (sortIngredientList.indexOf(i) == 0) {
            firstElement = i.replaceFirstChar { it.uppercase() }
        }
    }
    sortIngredientList[0] = firstElement
    println(sortIngredientList.joinToString())
}