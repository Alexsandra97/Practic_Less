open class CelestialBodies(val nameCelestialBodies: String) {
    fun printName() {
        println(nameCelestialBodies)
    }
}

class Planet(nameCelestialBodies: String, val listSatellite: List<Satellite>) : CelestialBodies(nameCelestialBodies)

class Satellite(nameCelestialBodies: String) : CelestialBodies(nameCelestialBodies)

fun main() {

    val planet = Planet("Астерион", listOf(Satellite("Астор"), Satellite("Гастор")))
    println("Название планеты:")
    planet.printName()
    println("Название ее спутников:")
    planet.listSatellite.forEach { it.printName() }

}
