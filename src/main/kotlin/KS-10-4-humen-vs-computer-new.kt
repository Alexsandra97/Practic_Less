fun rollDice_(player: String): Int {

    val resultRoll = (1..6).random()
    println("На кубике $player выпало: $resultRoll ")
    return resultRoll

}

fun resultGame(sumWinGame: Int): Int {

    var sumWinGame = sumWinGame + 1
    return sumWinGame

}

fun main() {

    var sumWinGame = 0

    do {

        var decisionPlayer = ""
        var player = "человека"
        val resultHuman = rollDice_(player = player)

        player = "компьютера"
        val resultComputer = rollDice_(player = player)

        if (resultComputer > resultHuman) println("Победила машина")
        else if (resultComputer < resultHuman) {
            println("Победило человечество")
            sumWinGame = resultGame(sumWinGame)

        } else println("Ничья")

        println("Хотите сыграть еще раз? Введите да/нет")
        decisionPlayer = readln()

    } while (decisionPlayer == "да")

    println("Выигрышных матчей: $sumWinGame")

}