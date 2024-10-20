fun main() {

    val hiddenNumber: Int = (1..9).random()
    var attempt = 5

    while (attempt > 0) {
        println("Угадайте число от 1 до 9")
        var writeNumber: Int = readln().toInt()

        if (hiddenNumber == writeNumber) {
            println("Это была великолепная игра!")
            break
        }

        println("Неверно! осталось ${--attempt} попыток")
    }

    if (attempt == 0)
        println("Было загадано число $hiddenNumber")

}