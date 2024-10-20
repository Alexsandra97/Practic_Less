fun main() {

    val passwordLength = 6
    var password = ""

    for (i in 1..passwordLength) {
        if ((i % 2) != 0) {
            var a = ('1'..'9').random().toString()
            password = a + password
        } else {
            var a = ('a'..'z').random().toString()
            password = a + password
        }
    }
    println(password)

}