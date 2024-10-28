fun List<Int>.evenNumbersSum() {
    println(this.filter { it % 2 == 0 }.sum())
}

fun main() {
    val listNumbers = listOf<Int>(1, 2, 4, 3, 8, 10)
    listNumbers.evenNumbersSum()
}