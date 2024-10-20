fun main() {

    println("Введите новый логин:")
    var newLogin: String = readln().toString()

    println("Введите новый пароль:")
    var newPassword: String = readln().toString()

    do {
        println("Повторите логин")
        var replayLogin: String = readln().toString()

        println("Повторите пароль:")
        var replayPassword: String = readln().toString()
    } while ((newLogin != replayLogin) || (newPassword != replayPassword))

}