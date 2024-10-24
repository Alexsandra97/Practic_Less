package less_3

fun main() {

    var fromWhereHorizon = 2
    var fromWhereVertical = "E"
    var whereHorizon = 4
    var whereVertical = "E"
    var strokeNumber = 1

    println("[$fromWhereVertical$fromWhereHorizon-$whereVertical$whereHorizon;$strokeNumber]")

    fromWhereVertical = "D"
    whereVertical = "D"
    fromWhereHorizon = 2
    whereHorizon = fromWhereHorizon

    println("[$fromWhereVertical$fromWhereHorizon-$whereVertical${++whereHorizon};${++strokeNumber}]")

}