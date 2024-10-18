enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHT_FISH
}

fun main() {

    val listFish = listOf(101, 102, 103, 104)

    fun setStatus(fish: Fish) {
        when (fish) {
            Fish.GUPPY -> println("В аквариум можно добавить гуппи")
            Fish.ANGELFISH -> println("В аквариум можно добавить скалярию")
            Fish.GOLDFISH -> println("В аквариум можно добавить золотую рыбку")
            Fish.SIAMESE_FIGHT_FISH -> println("В аквариум можно добавить петушка")
        }
    }
    for (i in listFish) {
        when (i) {
            101 -> setStatus(Fish.GUPPY)
            102 -> setStatus(Fish.ANGELFISH)
            103 -> setStatus(Fish.GOLDFISH)
            104 -> setStatus(Fish.SIAMESE_FIGHT_FISH)
        }
        Thread.sleep(1000)
    }
}
