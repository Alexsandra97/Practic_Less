fun main() {
    val addLambda = { phrase: List<String> -> phrase.map { it -> it.reversed() } }
    val robot = Robot()

    robot.say()
    robot.phrase = robot.setModifier(robot.phrase, inventing = addLambda)
    robot.say()

}

class Robot() {
    var phrase = listOf<String>("Добрый день", "Привет", "Здравствуйте", "Hello", "Hi")

    fun say() {
        println(phrase.random().toString())
    }

    fun setModifier(phrase: List<String>, inventing: (List<String>) -> List<String>): List<String> {
        val phrase: List<String> = phrase
        println("Модификатор включен")
        return inventing(phrase)
    }
}