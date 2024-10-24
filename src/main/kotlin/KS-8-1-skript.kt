const val WEEK = 7

fun main() {

    val numberViews: Array<Int> = Array(WEEK) { (0..100).random() }
    println("За неделю было ${numberViews.sum()} просмотра")

}