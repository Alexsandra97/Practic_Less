enum class Cartridges(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank(val cartridge: Cartridges) {
    fun armCartridge() {
        when (cartridge) {
            Cartridges.BLUE -> println("Оружие заряжено синим патроном.")
            Cartridges.GREEN -> println("Оружие заряжено зеленым патроном.")
            Cartridges.RED -> println("Оружие заряжено красным патроном.")
        }
    }
    fun shoot() {
        when (cartridge) {
            Cartridges.BLUE -> println("Произошел выстрел. Урон от выстрела ${Cartridges.BLUE.impactForce}")
            Cartridges.GREEN -> println("Произошел выстрел. Урон от выстрела ${Cartridges.GREEN.impactForce}")
            Cartridges.RED -> println("Произошел выстрел. Урон от выстрела ${Cartridges.RED.impactForce}")
        }
    }
}

fun main() {
    val tank1 = Tank(Cartridges.RED)
    tank1.armCartridge()
    tank1.shoot()
    println()

    val tank2 = Tank(Cartridges.GREEN)
    tank2.armCartridge()
    tank2.shoot()
}
