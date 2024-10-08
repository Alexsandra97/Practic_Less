class Quiz(question: String, answer: String) {
    val question: String = "Вопросик?"
        get() = field
    var answer: String = "Ответ"
        set(value: String) {
            field = value
        }

}

fun main() {
    val quiz = Quiz()
}