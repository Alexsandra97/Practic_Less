enum class Cartridges(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank() {
    fun armCartridge(cartridge: Cartridges) {
        when (cartridge) {
            Cartridges.BLUE -> println("Оружие заряжено синим патроном.\nПроизошел выстрел. Урон от выстрела ${Cartridges.BLUE.impactForce}")
            Cartridges.GREEN -> println("Оружие заряжено зеленым патроном.\nПроизошел выстрел. Урон от выстрела ${Cartridges.GREEN.impactForce}")
            Cartridges.RED -> println("Оружие заряжено красным патроном.\nПроизошел выстрел. Урон от выстрела ${Cartridges.RED.impactForce}")
        }
    }
}

fun main() {
    val tank1 = Tank()
    tank1.armCartridge(Cartridges.RED)
    println()

    val tank2 = Tank()
    tank2.armCartridge(Cartridges.GREEN)
}
