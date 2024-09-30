import kotlin.random.Random

class NewWeatherDataFive(_dayTemperature: Int, _nightTemperature: Int, _presencePrecipitation: Boolean) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var presencePrecipitation = _presencePrecipitation

    fun printParameters() {
        println("dayTemperature = $dayTemperature\nnightTemperature = $nightTemperature\npresencePrecipitation = $presencePrecipitation")
    }
}

fun main() {

    val listIndications: MutableList<NewWeatherDataFive> = mutableListOf()
    val listDayTemperature: MutableList<Int> = mutableListOf()
    val listNightTemperature: MutableList<Int> = mutableListOf()
    val listPresencePrecipitation: MutableList<Int> = mutableListOf()
    for (i in 1..5) {

        val newIndications =
            NewWeatherDataFive(((10..30).random().toInt()), ((5..20).random().toInt()), Random.nextBoolean())
        listIndications.add(newIndications)
        listDayTemperature.add(newIndications.dayTemperature)
        listNightTemperature.add(newIndications.nightTemperature)
        if (newIndications.presencePrecipitation == true) listPresencePrecipitation.add(i)

    }

    listIndications.forEach { indications -> indications.printParameters() }
    println()

    println("Средняя дневная: ${listDayTemperature.average()}")
    println("Средняя ночная: ${listNightTemperature.average()}")
    println("Количество дней с осадками: ${listPresencePrecipitation.count()}")

}