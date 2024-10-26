class RegularBook1(val title: String, val author: String) {
    override fun toString(): String {
        return "RegularBook1(title=$title, author=$author)"
    }
}

data class DataBook1(val title: String, val author: String)


fun main() {
    val regularBook1 = RegularBook1("название1", "автор1")
    val dataBook1 = DataBook1("название2", "автор2")

    println(regularBook1.toString()) //С обычным классом пришлось дополнять функцию toString и ее вызывать
    println(dataBook1) //В случае data class выводя объект, выводится информация о нем. очень удобно,
}