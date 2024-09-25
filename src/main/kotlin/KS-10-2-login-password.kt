const val MAX_LENGTH = 4

fun checkLength(onCheck: String): String {

    var result = ""
        if (onCheck.length < MAX_LENGTH)
            result = "Логин или пароль недостаточно длинные"
            return result
}

fun main() {

    println("Придумайте логин:")
    val login = checkLength(readln())
    println(login)

    println("Введите пароль")
    val password = checkLength(readln())
    println(password)

    if (login == "" && password == "")
    println("Добро пожаловать!")

}