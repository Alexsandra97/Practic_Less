package less_1_and_2

import kotlin.math.pow

fun main() {

    val depositPeriod = 20.0
    val sumForTheDeposit = 70000
    val interestRate = 16.7

    val depositAmount = sumForTheDeposit * (1 + interestRate / 100).pow(depositPeriod)

    println(String.format("%.3f", depositAmount))

}