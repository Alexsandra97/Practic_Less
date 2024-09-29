fun main() {

    val user1: User = User(
        id = 1,
        login = "login1",
        password = "password1",
        email = "mail1@mail.ru"
    )

    val user2: User = User(
        id = 2,
        login = "login2",
        password = "password2",
        email = "mail2@mail.ru"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String
)