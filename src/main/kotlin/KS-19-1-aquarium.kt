enum class Fish(val fish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHT_FISH("Петушок")
}

fun main() {

    for (cardType in Fish.values()) {
        println("${cardType.fish} можно добавить в аквариум")
    }

}





