fun main() {
    val user1: User2 = User2(
        id = 3,
        login = "login3",
        password = "password3",
        email = "mail3@mail.ru",
    )

    user1.addBio()
    user1.changePassword()
    user1.outputInformation()
}

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

    fun changePassword() {
        println("Для смены пароля введите старый пароль:")
        if (readln() == password) {
            println("Пароль верный. Введите новый пароль")
            password = readln()
            println("Пароль изменен.")
        }

    }
}