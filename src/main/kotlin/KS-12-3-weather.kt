const val KELVIN_TEMPERATURE = 273.15f

class NewWeatherData(_dayTemperature: Int, _nightTemperature: Int, _presencePrecipitation: Boolean) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var presencePrecipitation = _presencePrecipitation

    fun printParameters() {
        println("dayTemperature = $dayTemperature\nnightTemperature = $nightTemperature\npresencePrecipitation = $presencePrecipitation")
    }
}

fun main() {

    val firstObject = NewWeatherData((23 + KELVIN_TEMPERATURE).toInt(), (16 + KELVIN_TEMPERATURE).toInt(), false)
    firstObject.printParameters()

    val secondObject = NewWeatherData((21 + KELVIN_TEMPERATURE).toInt(), (12 + KELVIN_TEMPERATURE).toInt(), true)
    secondObject.printParameters()

}