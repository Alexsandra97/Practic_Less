fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier { it -> it.reversed() }
    robot.say()

}

class Robot() {
    var phrase = listOf<String>("Добрый день", "Привет", "Здравствуйте", "Hello", "Hi")
    private var modifier: (String) -> String = { it }

    fun say() {
        println(modifier(phrase.random().toString()))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
        println("Модификатор включен")
    }
}