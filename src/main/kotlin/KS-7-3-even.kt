fun main() {

    println("Введите число:")
    var evenMax: Int = readln().toInt()
    var evenPrint = 0

    for (i in 0..evenMax step 2) {
        println(evenPrint)
        evenPrint += 2
    }

}