fun main() {

    val firstVariable = 34
    val secondVariable = 58
    val trueResult = firstVariable + secondVariable

    println("Для авторизации необходимо решить математический пример:\n $firstVariable + $secondVariable =")
    var result: Int = readln().toInt()

    if (trueResult == result)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")

}