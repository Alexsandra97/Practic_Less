fun main() {

    val weatherTodaySunny: Boolean = true
    val outdoorAwning: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"
    val conditions: Boolean = weatherTodaySunny && outdoorAwning && airHumidity == 20 && season !== "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")

}