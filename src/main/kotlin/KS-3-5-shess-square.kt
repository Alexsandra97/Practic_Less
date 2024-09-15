
fun main() {

    val chessMove = "D2-D4;0"
    val fromWhere = chessMove.split("-", ";", limit = 3)

    for (where in fromWhere)  println(where)

}