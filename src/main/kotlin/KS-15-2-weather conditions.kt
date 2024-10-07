class WeatherServer() {
    fun sendMessage(Object: WeatherStationStats) {
        if (Object is Temperature) {
            println("Температура: ${Object.value}")
        } else if (Object is PrecipitationAmount) {
            println("Количество осадков: ${Object.value}")
        }
    }
}

abstract class WeatherStationStats {
    abstract val value: Int
}

class Temperature(override val value: Int) : WeatherStationStats() {
    init {
        WeatherServer().sendMessage(this)
    }
}

class PrecipitationAmount(override val value: Int) : WeatherStationStats() {
    init {
        WeatherServer().sendMessage(this)
    }
}

fun main() {
    val object1 = Temperature(13)
    val object2 = PrecipitationAmount(7)
}