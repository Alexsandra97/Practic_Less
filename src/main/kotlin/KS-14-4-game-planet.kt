open class CelestialBodies(val nameCelestialBodies: String, hasAtmosphere: Boolean, isSuitableForDisembarkation: Boolean) {
    fun printName() {
        println(nameCelestialBodies)
    }
}

class Planet(nameCelestialBodies: String, hasAtmosphere: Boolean, isSuitableForDisembarkation: Boolean, val listSatellite: List<Satellite>) : CelestialBodies(nameCelestialBodies, hasAtmosphere, isSuitableForDisembarkation)

class Satellite(nameCelestialBodies: String, hasAtmosphere: Boolean, isSuitableForDisembarkation: Boolean) : CelestialBodies(nameCelestialBodies, hasAtmosphere, isSuitableForDisembarkation)

fun main() {

    val planet = Planet("Астерион", true, true, listOf(Satellite("Астор", false, false), Satellite("Гастор", true, false)))
    println("Название планеты:")
    planet.printName()
    println("Название ее спутников:")
    planet.listSatellite.forEach { it.printName() }

}
