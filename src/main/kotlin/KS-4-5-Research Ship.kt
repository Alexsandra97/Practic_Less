const val MIN_COMPOSITION_CREW = 55
const val MAX_COMPOSITION_CREW = 70
const val MIN_BOX_PROVISIONS = 50
const val RECOMMENDED_COMPOSITION_CREW = 70

fun main() {

    println("Корпус поврежден? (true/false)")
    var damageShip: Boolean = readln().toBoolean()

    println("Сколько человек в составе экипажа?")
    var compositionCrew: Int = readln().toInt()

    println("Сколько ящиков с провизией на борту?")
    var boxProvisions: Int = readln().toInt()

    println("Метеусловия благоприятные? (true/false)")
    var weatherConditions: Boolean = readln().toBoolean()

    val permissionToSwim: Boolean = (damageShip == false && compositionCrew in MIN_COMPOSITION_CREW..MAX_COMPOSITION_CREW && boxProvisions > MIN_BOX_PROVISIONS) ||
            (compositionCrew == RECOMMENDED_COMPOSITION_CREW && weatherConditions == true && boxProvisions >= MIN_BOX_PROVISIONS)

    println("Корабль может выходить в плаванье? $permissionToSwim")



}