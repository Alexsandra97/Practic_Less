enum class Gender {
    MALE,
    FEMALE,
    ERROR
}

data class Cabinet(val name: String, val gender: Gender)

fun main() {
    val gender: (String) -> Gender
    gender = { it: String -> if (it =="MALE" || it == "FEMALE") Gender.valueOf(it) else  Gender.ERROR }

    val listCards = mutableListOf<Cabinet>()
    var isFlag = true

    while (isFlag == true) {
        println("Для создания введите имя и пол(MALE/FEMALE)")
        listCards.add(Cabinet(readln(), gender(readln())))

        if (listCards.count() == 5) listCards.forEach { it -> println(it) }
        println("Хотите добавить еще одну карточку?(да/нет)")
        val answer = readln()

        if (answer != "да") isFlag = false
    }

}

