class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("название", "автор")
    val regularBook2 = RegularBook("название", "автор")
    val dataBook1 = DataBook("название", "автор")
    val dataBook2 = DataBook("название", "автор")

    println(regularBook1 == regularBook2) //сравниваются ссылки на объекты в памяти. у каждого объекта они разные => значения не равны
    println(dataBook1 == dataBook2) //сравниваются проинициализированные данные. Они одинаковые в данном случае.
}