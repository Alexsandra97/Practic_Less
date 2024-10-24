class Quiz(question: String, answer: String) {
    val question = question
        get() = field
    var answer: String = answer
        get() = field
        set(value: String) {
            field = value
        }

}

fun main() {
    val quiz = Quiz("2+2","4")
}