class User(val login: String, protected val password: String) {
    fun validation(passwordCheck: String): Boolean {
        val isResultCheck = (this.password == passwordCheck)
        return isResultCheck
    }
}

fun main() {
    val user1 = User("user1", "pass")
    println("Введите пароль")
    val passwordCheck = readln()
    println(user1.validation(passwordCheck))
}