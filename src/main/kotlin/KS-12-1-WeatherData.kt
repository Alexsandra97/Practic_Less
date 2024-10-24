class WeatherData () {
    var dayTemperature = 0
    var nightTemperature = 0
    var presencePrecipitation = true

    fun printParameters () {
        println("dayTemperature = $dayTemperature\nnightTemperature = $nightTemperature\npresencePrecipitation = $presencePrecipitation")
    }
}

fun main() {

    val firstObject = WeatherData()
    firstObject.dayTemperature = 23
    firstObject.nightTemperature = 20
    firstObject.presencePrecipitation = false
    firstObject.printParameters()

    val secondObject = WeatherData()
    secondObject.dayTemperature = 25
    secondObject.nightTemperature = 19
    secondObject.presencePrecipitation = true
    secondObject.printParameters()

}