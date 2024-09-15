const val TRUE_RESULT = 92

fun main() {

    println("Для авторизации необходимо решить математический пример:\n 34 + 58 =")
    var result: Int = readln().toInt()

    if (TRUE_RESULT == result)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")

}