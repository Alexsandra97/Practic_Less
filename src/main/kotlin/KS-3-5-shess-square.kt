
fun main() {

    val chessMove = "D2-D4;0"
    val fromWhere = chessMove.substringBefore("-")
    val where = (chessMove.substringAfter("-")).substringBefore(";")
    val strokeNumber = chessMove.substringAfter(";")

    println(fromWhere)
    println(where)
    println(strokeNumber)

}