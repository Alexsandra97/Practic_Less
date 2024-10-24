class DirectoryPhoneThree(val name: String, val phoneNumber: Long, val company: String?) {
    fun printDirectory() {
        println("Имя: ${name}\nНомер: ${phoneNumber}\nКомпания: ${company}")
        println()
    }
}

fun main() {

    val listPhoneDirectory: MutableList<DirectoryPhoneThree> = mutableListOf(
        DirectoryPhoneThree("Мария", 8999999999, null),
        DirectoryPhoneThree("Игорь", 8999444444, null),
        DirectoryPhoneThree("Семен", 8999222222, "null"),
        DirectoryPhoneThree("Жанна", 8999111111, "Компания4"),
        DirectoryPhoneThree("Ибрагим", 8999000000, "Компания5")
    )
    val newListPhoneDirectory = listPhoneDirectory.mapNotNull { if (it.company == null) null else it }
    newListPhoneDirectory.forEach { contact -> contact.printDirectory() }

}