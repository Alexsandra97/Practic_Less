fun lengthValidation() {

    do {
        var onCheck = readln()
        if (onCheck.length < 4) println("Логин или пароль недостаточно длинные")
    } while (onCheck.length < 4)
}

fun main() {

    println("Придумайте логин:")
    val login = lengthValidation()

    println("Введите пароль")
    val password = lengthValidation()

    println("Добро пожаловать!")

}