fun main() {

    val firstWinningNumber = 4
    val secondWinningNumber = 33

    println("Введите первое число от 0 до 42")
    var firstNumber: Int = readln().toInt()

    println("Введите второе число от 0 до 42")
    var secondNumber: Int = readln().toInt()

    if (firstNumber == firstWinningNumber){
        if (secondNumber == secondWinningNumber)
            println("Поздравляем! Вы выиграли главный приз!")
        else
            println("Вы выиграли утешительный приз!")
    }else if (firstNumber == secondWinningNumber) {
        if (secondNumber == firstWinningNumber)
            println("Поздравляем! Вы выиграли главный приз!")
        else
            println("Вы выиграли утешительный приз!")
    }else
        println("Неудача!")

    println("Для победы нужны числа $firstWinningNumber и $secondWinningNumber")

}