fun rollDice(player: String): Int {

    val resultRoll = (1..6).random()
    println("На кубике $player выпало: $resultRoll ")
    return resultRoll

}

fun main() {

    var player = "человека"
    val resultHuman = rollDice(player = player)

    player = "компьютера"
    val resultComputer = rollDice(player = player)

    if (resultComputer > resultHuman) println("Победила машина")
    else if (resultComputer < resultHuman) println("Победило человечество")
    else println("Ничья")

}