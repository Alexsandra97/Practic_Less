abstract class WeatherServer{
    abstract val WeatherStationStat: Int
    abstract fun sendMessage(WeatherStationStat: Int)
}

class Temperature(override val WeatherStationStat: Int): WeatherServer() {
    override fun sendMessage(WeatherStationStat: Int) {
        println("Температура: $WeatherStationStat")
    }
}

class PrecipitationAmount(override val WeatherStationStat: Int): WeatherServer() {
    override fun sendMessage(WeatherStationStat: Int) {
        println("Количество осадков: $WeatherStationStat")
    }
}

fun main() {
    val object1 = Temperature(13)
    object1.sendMessage(13)
    val object2 = PrecipitationAmount(7)
    object2.sendMessage(7)
}