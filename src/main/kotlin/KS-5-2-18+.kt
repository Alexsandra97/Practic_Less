const val CURRENT_YEAR = 2024
const val AGE_MAJORITY = 18

fun main() {

    println("Введите год рождения")
    var userAge: Int = readln().toInt()

    if (AGE_MAJORITY <= (CURRENT_YEAR - userAge))
        println("Показать экран со скрытым контентом")

}