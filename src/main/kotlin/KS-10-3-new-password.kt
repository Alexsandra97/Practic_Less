fun generatePassword(lengthPassword: Int): String {

    var password: String = ""
    val range = "!\"#\$%&'()*+,-./ "

    for (i in 1..lengthPassword) {
        if ((i % 2) != 0) {
            var symbol = ('0'..'9').random().toString()
            password += symbol
        } else {
            var symbol = (range).random().toString()
            password += symbol
        }
    }
    return password
}

fun main() {

    println("Введите длину пароля")
    val lengthPassword = readln().toInt()
    println(generatePassword(lengthPassword))

}

