fun checkLength() {

        var onCheck = readln()
        if (onCheck.length < 4) println("Логин или пароль недостаточно длинные")
}

fun main() {

    println("Придумайте логин:")
    val login = checkLength()

    println("Введите пароль")
    val password = checkLength()

    println("Добро пожаловать!")

}