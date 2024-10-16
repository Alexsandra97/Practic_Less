open class Dice {
    open fun rollDice() = ""
}

class FourSidedDice(
    private val numberFaces: Int = 4
) : Dice() {
    override fun rollDice(): String {
        return ("На кубике с $numberFaces гранями выпало: ${(1..numberFaces).random()}")
    }
}

class SixSidedDice(
    private val numberFaces: Int = 6
) : Dice() {
    override fun rollDice(): String {
        return ("На кубике с $numberFaces гранями выпало: ${(1..numberFaces).random()}")
    }
}

class EightSidedDice(
    private val numberFaces: Int = 8
) : Dice() {
    override fun rollDice(): String {
        return ("На кубике с $numberFaces гранями выпало: ${(1..numberFaces).random()}")
    }
}

fun main() {
    val object4 = FourSidedDice()
    val object6 = SixSidedDice()
    val object8 = EightSidedDice()

    val listObjects = listOf<Dice>(object4, object6, object8)
    listObjects.forEach { println(it.rollDice()) }
}