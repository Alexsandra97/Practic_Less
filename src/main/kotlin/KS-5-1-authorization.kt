const val FIRST_VARIABLE = 34
const val SECOND_VARIABLE = 58
const val TRUE_RESULT = FIRST_VARIABLE + SECOND_VARIABLE

fun main() {

    println("Для авторизации необходимо решить математический пример:\n $FIRST_VARIABLE + $SECOND_VARIABLE =")
    var result: Int = readln().toInt()

    if (TRUE_RESULT == result)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")

}