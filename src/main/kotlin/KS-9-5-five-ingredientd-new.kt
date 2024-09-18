const val LENGTH_LIST = 5

fun main() {
    var finalListIngredients = ""
    var ingredients: MutableSet<String> = mutableSetOf()

    do {
        ingredients.add(readln())
    } while (ingredients.size != LENGTH_LIST)

    val sortIngredientList = ingredients.sorted()
    for (i in sortIngredientList) {
        if (sortIngredientList.indexOf(i) == 0) {
            val firstLetter = i.first().toString()
            val firstElement = i.replace(firstLetter, firstLetter.uppercase())
            finalListIngredients += firstElement
        } else

            finalListIngredients += ", " + i
    }
    println(finalListIngredients)
}