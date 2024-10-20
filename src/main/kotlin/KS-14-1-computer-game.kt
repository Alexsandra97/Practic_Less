open class Liner(
    val speed: Int = 25,
    val loadCapacity: Int = 215800,
    val capacity: Int = 4000
)

class CargoShip(
    speed: Int = 17,
    loadCapacity: Int = 420800,
    capacity: Int = 2000
) : Liner(speed, loadCapacity, capacity)

class Icebreaker(
    speed: Int = 15,
    loadCapacity: Int = 215800,
    capacity: Int = 1000,
    val breakIce: Boolean = true
) : Liner(speed, loadCapacity, capacity)

fun main() {
    val ship1 = Liner()
    val ship2 = CargoShip()
    val ship3 = Icebreaker()
}
