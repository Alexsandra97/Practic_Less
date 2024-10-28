fun main() {
    val addLambda = { phrase: List<String> -> phrase.map { it -> it.reversed() } }
    val robot = Robot()

    robot.say()
    robot.phrase = robot.setModifier(robot.phrase, modifier = addLambda)
    robot.say()

}

class Robot() {
    var phrase = listOf<String>("Добрый день", "Привет", "Здравствуйте", "Hello", "Hi")
    private var modifier: (String) -> String = { it }

    fun say() {
        println(modifier(phrase.random().toString()))
    }

    fun setModifier(phrase: List<String>, modifier: (List<String>) -> List<String>): List<String> {
        val phrase: List<String> = phrase
        println("Модификатор включен")
        return modifier(phrase)
    }
}