const val MAX_SUM_LIST = 5
enum class Gender {
    MALE,
    FEMALE,
    ERROR
}

data class Cabinet(val name: String, val gender: Gender)

fun main() {
    val gender: (String) -> Gender
    gender = { it: String -> if (it == "MALE" || it == "FEMALE") Gender.valueOf(it) else Gender.ERROR }

    val listCards = mutableListOf<Cabinet>()
    var isFlag = 0

    while (isFlag++ < MAX_SUM_LIST) {
        println("Для создания введите имя и пол(MALE/FEMALE)")
        listCards.add(Cabinet(readln(), gender(readln())))

        if (listCards.count() == MAX_SUM_LIST) listCards.forEach { it -> println(it) }
    }
}