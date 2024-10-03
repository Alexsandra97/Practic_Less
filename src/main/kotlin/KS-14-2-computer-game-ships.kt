open class LinerTwo(
    val speed: Int = 25,
    val loadCapacity: Int = 215800,
    val capacity: Int = 4000
) {
    open fun load() {
        println("Выдвигается горизонтальный трап со шкафута")
    }

    open fun outputParameters() {
        println("Скорость: $speed\nГрузоподъемность: $loadCapacity\nВместимость: $capacity")
    }
}

class CargoShipTwo(
    speed: Int = 17,
    loadCapacity: Int = 420800,
    capacity: Int = 2000
) : LinerTwo(speed, loadCapacity, capacity) {

    override fun load() {
        println("Активируется погрузочный кран")
    }

}

class IcebreakerTwo(
    speed: Int = 15,
    loadCapacity: Int = 215800,
    capacity: Int = 1000,
    val isBreakIce: Boolean = true
) : LinerTwo(speed, loadCapacity, capacity) {

    override fun load() {
        println("Открываются ворота со стороны кормы")
    }

    override fun outputParameters() {
        super.outputParameters()
        println("Может колоть лёд: $isBreakIce")
    }

}

fun main() {

    val ship1 = LinerTwo()
    ship1.load()
    val ship2 = CargoShipTwo()
    ship2.load()
    val ship3 = IcebreakerTwo()
    ship3.load()

    ship1.outputParameters()
    ship2.outputParameters()
    ship3.outputParameters()
}