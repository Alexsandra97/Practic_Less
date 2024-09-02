package less_1_and_2

fun main() {

    val temporaryGain = 20
    val crystals = 7
    val ironOre = 11

    val bonusCruystals: Int = ((crystals * temporaryGain) / 100).toInt()
    val bonusIronOre: Int = ((temporaryGain * ironOre) / 100).toInt()

    println("Получено $bonusCruystals бонусный кристалл")
    println("Получено $bonusIronOre бонусной железной руды")

}