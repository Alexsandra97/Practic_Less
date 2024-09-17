fun main() {

    println("Введите сколько секунд нужно засечь")
    val secondTimer: Int = readln().toInt()

    for (i in secondTimer downTo 1){
        println("Осталось $i сек.")
        Thread.sleep(1000)
    }

    println("Время вышло")

}