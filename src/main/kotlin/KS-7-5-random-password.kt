fun main() {

    var passwordLength: Int
    do {
        println("Задайте длину пароля от 6 символов")
        passwordLength = readln().toInt()
        if (passwordLength < 6)
            println("Длина пароля меньше 6.")
    } while (passwordLength < 6)

    var passwordUser = ""
    var symbolPassword: MutableList<Int> = mutableListOf()

    do {
        passwordUser = ""
        symbolPassword.clear()

        for (i in 1..passwordLength) {
            var variantSymbol = (1..3).random()
            symbolPassword.add(variantSymbol)
            when (variantSymbol) {
                1 -> passwordUser = ('0'..'9').random().toString() + passwordUser
                2 -> passwordUser = ('a'..'z').random().toString() + passwordUser
                3 -> passwordUser = ('A'..'Z').random().toString() + passwordUser
            }
        }
    } while ((symbolPassword.contains(1) != true) || (symbolPassword.contains(2) != true) || (symbolPassword.contains(3) != true))

    println(passwordUser)

}