fun main() {

    println("Для входа в программу решите этот пример:")
    var attempt = 3

    while (attempt > 0) {
        val firstVariable = (1..9).random()
        val secondVariable = (1..9).random()
        println("$firstVariable + $secondVariable =")
        var answer: Int = readln().toInt()
        --attempt

        if (answer == (firstVariable + secondVariable)) {
            println("Добро пожаловать!")
            break
        }

        println("Неверно!")
    }

    if (attempt == 0)
        println("Доступ запрещен")
}