const val KELVIN_TEMPERATUR = 273.15f

class NewWeatherDataFour(_dayTemperature: Int, _nightTemperature: Int, _presencePrecipitation: Boolean) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var presencePrecipitation = _presencePrecipitation
}

fun main() {

    val firstObject = NewWeatherDataFour((23 + KELVIN_TEMPERATUR).toInt(), (16 + KELVIN_TEMPERATUR).toInt(), false)
    println(
        "dayTemperature = ${firstObject.dayTemperature}\n" +
                "nightTemperature = ${firstObject.nightTemperature}\n" +
                "presencePrecipitation = ${firstObject.presencePrecipitation}"
    )

    val secondObject = NewWeatherDataFour((21 + KELVIN_TEMPERATUR).toInt(), (12 + KELVIN_TEMPERATUR).toInt(), true)
    println(
        "dayTemperature = ${secondObject.dayTemperature}\n" +
                "nightTemperature = ${secondObject.nightTemperature}\n" +
                "presencePrecipitation = ${secondObject.presencePrecipitation}"
    )

}