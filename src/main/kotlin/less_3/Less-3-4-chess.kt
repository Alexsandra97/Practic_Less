package less_3

fun main() {

    var fromWhereHorizon = 2
    var fromWhereVertical = "E"
    var whereHorizon = 4
    var whereVertical = "E"
    var strokeNumber = 1

    println("$fromWhereVertical$fromWhereHorizon в $whereVertical$whereHorizon, номер хода: $strokeNumber")

    fromWhereVertical = "D"
    whereVertical = "D"
    fromWhereHorizon = 2
    whereHorizon = fromWhereHorizon

    println("$fromWhereVertical$fromWhereHorizon в $whereVertical${++whereHorizon}, номер хода: ${++strokeNumber}")

}