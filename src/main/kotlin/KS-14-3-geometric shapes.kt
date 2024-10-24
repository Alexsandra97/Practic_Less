import kotlin.math.pow

const val PI = 3.14
const val TWO = 2

abstract class Figure {

    abstract val color: String
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double

}

class Circle(
    override val color: String,
    val radius: Int
) : Figure() {

    override fun calculatePerimeter(): Double {
        val perimeter = (radius * TWO * PI).toDouble()
        return perimeter
    }

    override fun calculateArea(): Double {
        val area = radius * PI.pow(TWO).toDouble()
        return area
    }

}

class Rectangle(
    override val color: String,
    val width: Int,
    val height: Int,
) : Figure() {


    override fun calculatePerimeter(): Double {
        val perimeter = (TWO * (width + height)).toDouble()
        return perimeter
    }

    override fun calculateArea(): Double {
        val area = (width * height).toDouble()
        return area
    }

}

fun main() {
    val listFigure: List<Figure> = listOf(
        Circle("черный", 4), Circle("белый", 2),
        Rectangle("черный", 4, 3), Rectangle("белый", 5, 8)
    )
    var sumPerimetrBlack: Double = 0.0
    var sumAreaWhite: Double = 0.0

    listFigure.forEach { it ->
        if (it.color == "черный") {
            sumPerimetrBlack += it.calculatePerimeter()
        }

        if (it.color == "белый") {
            sumAreaWhite += it.calculateArea()
        }
    }
    println("Сумма периметра всех черных фигур: ${String.format("%.2f", sumPerimetrBlack)}")
    println("Сумма площади всех белых фигур: ${String.format("%.2f", sumAreaWhite)}")

}