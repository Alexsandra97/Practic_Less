fun main() {
    val user1: User2 = User2(
        id = 3,
        login = "login3",
        password = "password3",
        email = "mail3@mail.ru",
    )

    user1.addBio()
    user1.correctPassword()
    user1.outputInformation()
}