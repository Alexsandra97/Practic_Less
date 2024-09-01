package less_1_and_2

fun main() {

    val temporaryGain = 0.2f
    val crystals = 7
    val ironOre = 11

    val bonusCruystals: Int = (temporaryGain * crystals).toInt()
    val bonusIronOre: Int = (temporaryGain * ironOre).toInt()

    println("Получено $bonusCruystals бонусный кристалл")
    println("Получено $bonusIronOre бонусной железной руды")

}