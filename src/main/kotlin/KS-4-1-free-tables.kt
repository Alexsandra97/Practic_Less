const val NUMBER_OF_TABLES = 13

fun main() {

    val todayBookedTables: Byte = 13
    val tommorowBookedTables: Byte = 9

    println("Доступность столиков на сегодня: ${NUMBER_OF_TABLES > todayBookedTables}\nДоступность столиков на сегодня: ${NUMBER_OF_TABLES > tommorowBookedTables}")

}