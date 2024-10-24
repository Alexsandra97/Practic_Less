class DirectoryPhoneFour(val name: String, val phoneNumber: Long, val company: String?) {

    fun printDirectory() {
        println("Имя: ${name}\nНомер: ${phoneNumber}\nКомпания: ${company ?: "<Не указано>"}")
        println()
    }

}

fun main() {

    val listPhoneDirectory: MutableList<DirectoryPhoneFour> = mutableListOf()
    try {
        println("Введите номер телефона")
        val phoneNumber = readln().toLong()
    } catch (e: Exception) {
        println(((e.javaClass).toString()).substringAfterLast("."))

    }

}