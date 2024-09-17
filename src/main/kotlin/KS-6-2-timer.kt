fun main() {

    println("Сколько секунд нужно засечь?")
    var markSecond: Int = readln().toInt()

    var timerSecond = 0

    while (markSecond > timerSecond) {

        println(timerSecond++)
        Thread.sleep(1000)
    }

println("Прошло $markSecond секунд")

}