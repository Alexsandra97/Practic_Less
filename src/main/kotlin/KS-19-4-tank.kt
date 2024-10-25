enum class Cartridges(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
    NO_CARTRIDGE(0)
}

class Tank() {
    var cartridge = Cartridges.NO_CARTRIDGE
        fun armCartridge(impactForce: Cartridges) {
        cartridge = impactForce
        when (cartridge) {
            Cartridges.BLUE -> println("Оружие заряжено синим патроном.")
            Cartridges.GREEN -> println("Оружие заряжено зеленым патроном.")
            Cartridges.RED -> println("Оружие заряжено красным патроном.")
            Cartridges.NO_CARTRIDGE -> println("Оружие не заряжено.")
        }

    }
    fun shoot() {
        when (cartridge) {
            Cartridges.BLUE -> println("Произошел выстрел. Урон от выстрела ${Cartridges.BLUE.impactForce}")
            Cartridges.GREEN -> println("Произошел выстрел. Урон от выстрела ${Cartridges.GREEN.impactForce}")
            Cartridges.RED -> println("Произошел выстрел. Урон от выстрела ${Cartridges.RED.impactForce}")
            Cartridges.NO_CARTRIDGE -> println("Выстрел не произведен. Урон ${Cartridges.RED.impactForce}")
        }
    }
}

fun main() {
    val tank1 = Tank()
    tank1.armCartridge(Cartridges.RED)
    tank1.shoot()
    println()

    val tank2 = Tank()
    tank2.armCartridge(Cartridges.GREEN)
    tank2.shoot()
}
