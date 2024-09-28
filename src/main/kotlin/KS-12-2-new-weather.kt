class WeatherDataNew (_dayTemperature: Int, _nightTemperature: Int, _presencePrecipitation: Boolean ) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var presencePrecipitation = _presencePrecipitation

    fun printParameters () {
        println("dayTemperature = $dayTemperature\nnightTemperature = $nightTemperature\npresencePrecipitation = $presencePrecipitation")
    }
}

fun main() {

    val firstObject = WeatherDataNew(23, 20, true)
    firstObject.printParameters()
    println()

    val secondObject = WeatherDataNew(25, 19, false)
    secondObject.printParameters()

}