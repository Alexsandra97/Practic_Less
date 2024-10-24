const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {

    val weighrCargo1 = 20
    val volumeCargo1 = 80
    val weighrCargo2 = 50
    val volumeCargo2 = 100

    println("Груз с весом $weighrCargo1 кг и объемом $volumeCargo1 л Соответствует категории 'Averege': " +
            "${(MIN_WEIGHT_AVERAGE < weighrCargo1 && MAX_WEIGHT_AVERAGE >= weighrCargo1) && MAX_VOLUME_AVERAGE > volumeCargo1}")
    println("Груз с весом $weighrCargo2 кг и объемом $volumeCargo2 л Соответствует категории 'Averege': " +
            "${(MIN_WEIGHT_AVERAGE < weighrCargo2 && MAX_WEIGHT_AVERAGE >= weighrCargo2) && MAX_VOLUME_AVERAGE > volumeCargo2}")

}