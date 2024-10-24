package less_1_and_2

import kotlin.math.pow

const val ONE = 1
const val HUNDRED = 100

fun main() {

    val depositPeriod = 20.0
    val sumForTheDeposit = 70_000
    val interestRate = 16.7

    val depositAmount = sumForTheDeposit * (ONE + interestRate / HUNDRED).pow(depositPeriod)

    println(String.format("%.3f", depositAmount))

}