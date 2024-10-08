import kotlin.math.pow

private const val PI = 3.14
const val TWO = 2

class Circle(protected val radius: Int) {
    fun circumferenceCircle(): String {
        val circumference = String.format("%.2f", TWO * PI * radius)
        return circumference
    }

    fun areaCircle(): String {
        val area = String.format("%.2f", (Math.pow(radius.toDouble(), TWO.toDouble()) * PI))
        return area
    }

}

fun main() {
    val circle = Circle(3)
    println("Площадь круга: ${circle.areaCircle()}")
    println("Длина окружности: ${circle.circumferenceCircle()}")
}