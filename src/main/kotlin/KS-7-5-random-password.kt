fun main() {
    val minPasswordLength = 6
    var passwordLength: Int
    do {
        println("Задайте длину пароля от $minPasswordLength символов")
        passwordLength = readln().toInt()
        if (passwordLength < minPasswordLength)
            println("Длина пароля меньше $minPasswordLength.")
    } while (passwordLength < minPasswordLength)

    var passwordUser: MutableList<String> = mutableListOf()
    val sumRange = ('A'..'Z') + ('a'..'z') + ('0'..'9')

    passwordUser.add(('A'..'Z').random().toString())
    passwordUser.add(('a'..'z').random().toString())
    passwordUser.add(('0'..'9').random().toString())

    for (i in 4..passwordLength) {
        passwordUser.add(sumRange.random().toString())
    }

    println(passwordUser.shuffled())

}