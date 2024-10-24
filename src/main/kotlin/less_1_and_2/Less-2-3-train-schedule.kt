package less_1_and_2

fun main() {


    val hoursStart: Int = 9
    val minuteStart: Int = 39
    val minuteWay: Int = 457
    val minuteConst = 60

    val allTime = hoursStart * minuteConst + minuteStart + minuteWay
    val hourseEnd = allTime / minuteConst
    val minuteEnd = allTime % minuteConst

    println(String.format("%02d:%02d",hourseEnd, minuteEnd))

}