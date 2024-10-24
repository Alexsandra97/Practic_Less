fun rollDice(player: String): Int {

    val resultRoll = (1..6).random()
    println("На кубике $player выпало: $resultRoll ")
    return resultRoll

}

fun conductRound(): String {

    println("Хотите сыграть еще раз? Введите да/нет")
    var decisionPlayer = readln()
    return decisionPlayer

}

fun main() {

    var sumWinGame = 0

    do {


        var player = "человека"
        val resultHuman = rollDice(player = player)

        player = "компьютера"
        val resultComputer = rollDice(player = player)

        if (resultComputer > resultHuman) println("Победила машина")
        else if (resultComputer < resultHuman) {
            println("Победило человечество")
            sumWinGame++
        } else println("Ничья")

        var decisionPlayer = conductRound()
    } while (decisionPlayer == "да")

    println("Выигрышных матчей: $sumWinGame")

}