fun main() {

    println("Сколько секунд нужно засечь?")
    var markSecond: Long = readln().toLong()

    Thread.sleep(1000 * markSecond)
    println("Прошло $markSecond секунд")

}