const val KELVIN_TEMPERATURE = 273.15f

class NewWeatherData() {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var presencePrecipitation = true

    fun printParameters () {
        println("dayTemperature = $dayTemperature\nnightTemperature = $nightTemperature\npresencePrecipitation = $presencePrecipitation")
    }
}

fun main() {

    val firstObject = NewWeatherData()
    firstObject.dayTemperature = (299 - KELVIN_TEMPERATURE).toInt()
    firstObject.nightTemperature = (286 - KELVIN_TEMPERATURE).toInt()
    firstObject.presencePrecipitation = false
    firstObject.printParameters()

    val secondObject = NewWeatherData()
    secondObject.dayTemperature = (300 - KELVIN_TEMPERATURE).toInt()
    secondObject.nightTemperature = (289 - KELVIN_TEMPERATURE).toInt()
    secondObject.presencePrecipitation = true
    secondObject.printParameters()

}