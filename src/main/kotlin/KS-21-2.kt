fun List<Int>.evenNumbersSum() {
    var sumNumbers = 0
    this.forEach{it -> if (it%2 == 0 )sumNumbers += it}
    println(sumNumbers)
}

fun main() {
    val listNumbers = listOf<Int>(1, 2, 4, 3, 8, 10)
    listNumbers.evenNumbersSum()
}