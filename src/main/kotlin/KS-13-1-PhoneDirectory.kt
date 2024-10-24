class PhoneDirectory(val name: String, val phoneNumber: Long, val company: String?)

fun main() {

    val phoneDirectory = PhoneDirectory("Мария", 8999999999, null)
    println("${phoneDirectory.name}\n${phoneDirectory.phoneNumber}\n${phoneDirectory.company}")

}