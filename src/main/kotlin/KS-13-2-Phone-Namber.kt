class DirectoryPhone (var name: String,var phoneNumber: Long,var company: String?) {
    fun printDirectory() {
        println("Имя: ${name}\nНомер: ${phoneNumber}\nКомпания: ${company?: "<Не указано>"}")
    }
}

fun main() {

    val phoneDirectory = DirectoryPhone("Мария", 8999999999, null)
    phoneDirectory.printDirectory()

}