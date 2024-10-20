 class Screen {

fun drawCircle(x: Int, y: Int): String {
        return "Нарисовали круг в координатах ($x, $y)"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Нарисовали круг в координатах ($x, $y)"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Нарисовали квадрат в координатах ($x, $y)"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Нарисовали квадрат в координатах ($x, $y)"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Нарисовали точку в координатах ($x, $y)"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Нарисовали точку в координатах ($x, $y)"
    }

}

class Circle() {
   fun <T> drawCircle(x: T, y: T ) where T: Screen{
    drawCircle(x, y)
   }


}

fun main() {
    val circle = Circle()
    print(circle.drawCircle(2, 3))
}