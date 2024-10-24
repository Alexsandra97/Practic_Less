open class Animals {
    open val name: String = ""
    open fun Eat() = ""
}

class Fox(override val name: String) : Animals() {
    override fun Eat(): String {
        return "$name скушал ягоды"
    }
}

class Dog(override val name: String) : Animals() {
    override fun Eat(): String {
        return "$name скушал кости"
    }
}

class Cat(override val name: String) : Animals() {
    override fun Eat(): String {
        return "$name скушал рыбу"
    }
}

fun main() {
    val animal1 = Fox("Лисенок")
    val animal2 = Dog("Пёсик")
    val animal3 = Cat("Котик")

    val listAnimals = listOf<Animals>(animal1, animal2, animal3)
    listAnimals.forEach { println(it.Eat()) }
}