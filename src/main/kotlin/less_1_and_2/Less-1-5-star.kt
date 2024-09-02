package less_1_and_2

const  val TIME = 60

fun main() {

    val seconds: Int = 6480

    val minute: Int = (seconds % (TIME * TIME)) / TIME
    val hour: Int = seconds / (TIME * TIME)
    val secSecond: Int = (seconds % (TIME * TIME)) % TIME


    println(String.format("%02d:%02d:%02d", hour, minute, secSecond))
}