fun main() {

    println("Сколько секунд нужно засечь?")
    var markSecond: Int = readln().toInt()

    var timerSecond = 0

    while (markSecond > timerSecond) {

        println("Осталось секунд: ${markSecond - (timerSecond++)}")
        Thread.sleep(1000)
    }

    println("Время вышло")

}