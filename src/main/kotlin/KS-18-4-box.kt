const val SIX = 6
const val TWO = 2

open class Box {
    open fun calculateArea() = 0
}

class Rectangular(
    private val height: Int,
    private val width: Int,
    private val length: Int
) : Box() {
    override fun calculateArea(): Int {
        return TWO * (height * width + width * length + length * height)
    }
}

class Cube(
    private val edgeLength: Int
) : Box() {
    override fun calculateArea(): Int {
        return SIX * edgeLength * edgeLength
    }
}

