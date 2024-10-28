fun main() {
    val listElements = listOf<String>("1", "2", "3", "4", "5", "6", "7", "8")
    val listFilter = listElements.filterIndexed({ index, x -> (index + 1) % 4 == 0 })
    val listLambdas: (List<String>) -> Unit
    listLambdas = {
        listFilter.map { it: String -> println("Нажат элемент $it") }

    }
    listLambdas(listFilter)
}