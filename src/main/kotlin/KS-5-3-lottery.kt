fun main() {

    val firstWinningNumber = 4
    val secondWinningNumber = 33

    println("Введите первое число от 0 до 42")
    var firstNunber: Int = readln().toInt()

    println("Введите второе число от 0 до 42")
    var secondNunber: Int = readln().toInt()

    if ((firstNunber == firstWinningNumber && secondNunber == secondWinningNumber) ||
        (firstNunber == secondWinningNumber && secondNunber == firstWinningNumber)
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((firstNunber == firstWinningNumber && secondNunber !== secondWinningNumber) ||
        (firstNunber !== firstWinningNumber && secondNunber == secondWinningNumber) ||
        (firstNunber == secondWinningNumber && secondNunber !== firstWinningNumber) ||
        (firstNunber !== secondWinningNumber && secondNunber == firstWinningNumber)
    )
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")

    println("Для победы нужны числа $firstWinningNumber и $secondWinningNumber")

}