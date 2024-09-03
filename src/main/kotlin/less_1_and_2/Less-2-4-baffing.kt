package less_1_and_2

const val percent = 100

fun main() {

    val temporaryGain = 20
    val crystals = 7
    val ironOre = 11

    val bonusCrystals: Int = ((crystals * temporaryGain) / percent).toInt()
    val bonusIronOre: Int = ((temporaryGain * ironOre) / percent).toInt()

    println("Получено $bonusCrystals бонусный кристалл")
    println("Получено $bonusIronOre бонусной железной руды")

}