class DirectoryPhone (val name: String,val phoneNumber: Long,val company: String?) {
    fun printDirectory() {
        println("Имя: ${name}\nНомер: ${phoneNumber}\nКомпания: ${company?: "<Не указано>"}")
    }
}

fun main() {

    val phoneDirectory = DirectoryPhone("Мария", 8999999999, null)
    phoneDirectory.printDirectory()

}