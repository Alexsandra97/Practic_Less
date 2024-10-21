fun main() {
    val greet: (String) -> String =
        fun(username: String) = "С наступающим Новым Годом, $username!"
    println(greet.invoke("Александра"))
}