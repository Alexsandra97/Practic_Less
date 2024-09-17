fun main() {

    var sumView = 0
    var numberViews: Array<Int> = arrayOf(0, 0, 0, 0, 0, 0, 0)

    for (i in numberViews) {
        numberViews[i] = (0..100).random()
        sumView = sumView + numberViews[i]

    }

    println("За неделю было $sumView просмотра")

}