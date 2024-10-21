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

fun main() {
    val screen = Screen()
    screen.drawCircle(1, 2)
    screen.drawCircle(1.5f, 6.9f)
    screen.drawSquare(2, 4)
    screen.drawSquare(2.1f, 4.4f)
    screen.drawPoint(4, 6)
    screen.drawPoint(5.7f, 1.3f)
}