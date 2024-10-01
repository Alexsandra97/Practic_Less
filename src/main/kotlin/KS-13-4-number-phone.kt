class DirectoryPhoneThree(val name: String, val phoneNumber: Long?, val company: String?) {

    fun printDirectory() {
        println("Имя: ${name}\nНомер: ${phoneNumber}\nКомпания: ${company ?: "<Не указано>"}")
        println()
    }

}

fun main() {

    val listPhoneDirectory: MutableList<DirectoryPhoneThree> = mutableListOf()

    for (i in 1..2) {
        println("Введите номер телефона")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber != null) {
            println("Введите имя и номер телефона")
            listPhoneDirectory.add(DirectoryPhoneThree(readln(), phoneNumber, readln()))
        }
    }
    listPhoneDirectory.forEach { contact -> contact.printDirectory() }

}