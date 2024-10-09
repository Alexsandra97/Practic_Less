class User(val login: String, private val password: String) {
    fun validation(passwordCheck: String): Boolean {
        return (this.password == passwordCheck)
    }
}

fun main() {
    val user1 = User("user1", "pass")
    println("Введите пароль")
    val passwordCheck = readln()
    println(user1.validation(passwordCheck))
}