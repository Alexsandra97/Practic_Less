const val KELVIN_TEMPERATURE = 273.15f

class NewWeatherData(_dayTemperature: Int, _nightTemperature: Int, _presencePrecipitation: Boolean) {
    var dayTemperature = (_dayTemperature + KELVIN_TEMPERATURE).toInt()
    var nightTemperature = (_nightTemperature+ KELVIN_TEMPERATURE).toInt()
    var presencePrecipitation = _presencePrecipitation

    fun printParameters() {
        println("dayTemperature = $dayTemperature\nnightTemperature = $nightTemperature\npresencePrecipitation = $presencePrecipitation")
    }
}

fun main() {

    val firstObject = NewWeatherData(23, 16, false)
    firstObject.printParameters()

    val secondObject = NewWeatherData(21, 12, true)
    secondObject.printParameters()

}