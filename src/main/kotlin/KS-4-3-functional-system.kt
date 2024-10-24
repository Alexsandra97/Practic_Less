const val WEATHER_SUNNY = true
const val CONDITION_AWNING = true
const val REQUIRED_AIR_HUMIDITY = 20
const val UNDESIRABLE_SEASON = "зима"

fun main() {

    val weatherTodaySunny: Boolean = true
    val outdoorAwning: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"
    val conditions: Boolean = weatherTodaySunny == WEATHER_SUNNY && outdoorAwning == CONDITION_AWNING
            && airHumidity == REQUIRED_AIR_HUMIDITY && season !== UNDESIRABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")

}