package less_1_and_2

const val PERCENT = 100

fun main() {

    val temporaryGain = 20
    val crystals = 7
    val ironOre = 11

    val bonusCrystals: Int = ((crystals * temporaryGain) / PERCENT).toInt()
    val bonusIronOre: Int = ((temporaryGain * ironOre) / PERCENT).toInt()

    println("Получено $bonusCrystals бонусный кристалл")
    println("Получено $bonusIronOre бонусной железной руды")

}