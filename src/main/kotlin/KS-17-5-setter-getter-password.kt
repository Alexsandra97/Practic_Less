class User( _login: String, _password: String) {

    val passwordStar = "*".repeat(_password.length)
    var password: String? = _password
        get() =  passwordStar ?: field
        set(value: String?) {
            println("Вы не можете изменить пароль")
        }

    var login = _login
        get() = field
        set(value: String) {
            field = value
            println("Смена логина прошла успешно")
        }


}


fun main() {
    val user = User("login", "pas")
    println(user.password)
    user.password = "новый пароль"
    println(user.login)
    user.login = "новый логин"
    println(user.login)
}