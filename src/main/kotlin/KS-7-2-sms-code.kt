fun main() {

    do {
        var smsCode: Int = (1000..9999).random().toInt()
        println("Ваш код авторизации: $smsCode. Введите его в консоль")
        var userCode: Int = readln().toInt()
    }while (smsCode != userCode)

    println("Добро пожаловать!")

}