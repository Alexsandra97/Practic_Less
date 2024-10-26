fun say(phrase: List<String>) {
    println(phrase.random().toString())
}

fun setModifier(phrase: List<String>, inventing: (List<String>) -> List<String>): List<String> {
    println("Модификатор включен")
    return inventing(phrase)
}


fun main() {

    var phrase = listOf<String>("Добрый день", "Привет", "Здравствуйте", "Hello", "Hi")
    val addLambda = { phrase: List<String> -> phrase.map { it -> it.reversed() } }

    say(phrase)
    phrase = setModifier(phrase, inventing = addLambda)
    say(phrase)

}