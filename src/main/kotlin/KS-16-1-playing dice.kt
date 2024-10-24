class PlayingDice(private val result: Int = (1..6).random()) {
    fun getResult() = result
}

fun main() {
    println(PlayingDice().getResult())
}