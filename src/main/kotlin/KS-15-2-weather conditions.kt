abstract class WeatherStationStats{
    abstract val data: Int
    abstract fun sendMessage()
}

class Temperature(override val data: Int): WeatherStationStats() {
    override fun sendMessage() {
        println("Температура: $data")
    }
}

class PrecipitationAmount(override val data: Int): WeatherStationStats() {
    override fun sendMessage() {
        println("Количество осадков: $data")
    }
}

fun main() {
    val object1 = Temperature(13)
    object1.sendMessage()
    val object2 = PrecipitationAmount(7)
    object2.sendMessage()
}