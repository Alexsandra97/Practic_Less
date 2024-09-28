class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun outputInformation() {
        println("id: $id\nлогин: $login\nпароль: $password\nпочта: $email\nbio: $bio")
    }

    fun addBio(): String {
        println("Добавьте bio")
        bio = readln()
        return bio
    }

    fun correctPassword() {
        println("Для смены пароля введите старый пароль:")
        val passwordVerification = readln()
        if (passwordVerification == password) {
            println("Пароль верный. Введите новый пароль")
            password = readln()
            println("Пароль изменен.")
        }

    }
}