
class NewWeatherDataFour(_dayTemperature: Int, _nightTemperature: Int, _presencePrecipitation: Boolean) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var presencePrecipitation = _presencePrecipitation

    init {
        println(
            "dayTemperature = ${dayTemperature}\n" +
                    "nightTemperature = ${nightTemperature}\n" +
                    "presencePrecipitation = ${presencePrecipitation}"
        )
    }
}

fun main() {

    NewWeatherDataFour(23, 16,  false)
    NewWeatherDataFour(21, 12, true)

}