package less_3

fun main() {

    val number1 = 8
    var number2 = 0

    println(
        """$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}
               |$number1 * ${++number2} = ${number2 * number1}""".trimMargin()
    )


}