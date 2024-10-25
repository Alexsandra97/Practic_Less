fun main() {
    val listElements = listOf<String>("1", "2", "3", "4", "5", "6", "7", "8")
    val listElements2: (List<String>) -> Unit
    listElements2 = {
        listElements.mapIndexed { index, it ->
            { it: String -> if ((index + 1) % 4 == 0) println("Нажат элемент $it") }(it)
        }
    }
    listElements2(listElements)
}