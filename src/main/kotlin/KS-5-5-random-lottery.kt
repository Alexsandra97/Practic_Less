fun main() {

    val winningNumber: List<Int> = listOf((0..42).random(), (0..42).random(), (0..42).random())

    println("Введите три числа от 0 до 42")
    var numberPlayer: List<Int> = listOf(readln().toInt(), readln().toInt(), readln().toInt())

    val coincidence = winningNumber.intersect(numberPlayer)

    when (coincidence.count()) {
        0 -> println("Вы ничего не угадали.")
        1 -> println("Угадали одно число! Получите утешительный приз")
        2 -> println("Вы угадали два числа и выигрываете ОЧЕНЬ крупный приз!!")
        3 -> println("УРА! Вы угадали все цифры и выиграли ДЖЕКПОД!!!")
    }

    println("Выигрышные цифры: $winningNumber")

}