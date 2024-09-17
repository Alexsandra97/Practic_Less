fun main() {

    println("Введите число:")
    var evenMax: Int = readln().toInt()
    var evenPrint = 0

    for (i in 0..evenMax) {
        if ((i % 2) == 0)
            println(evenPrint)
        evenPrint++
    }

}