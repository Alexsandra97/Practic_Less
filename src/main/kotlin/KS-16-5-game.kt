class Player(
    val name: String,
    var health: Int,
    var impactForce: Int
) {
    private fun death() {
        println("Игрок $name умер.")
        health = 0
        impactForce = 0
    }

    fun getDamage(anotherDamage: Int) {
        health -= anotherDamage
        println("Игрок $name получил урон $anotherDamage. Теперь его здоровье $health")
        if (health <= 0) death()
    }

    fun heal() {
        if (health > 0) {
            ++health
            println("Игрок $name получил лечение. Теперь его здоровье составляет $health ")
        } else println("Игрок $name умер. Лечение невозможно")
    }
}

fun main() {
    val player1 = Player("Первый", 5, 2)
    val player2 = Player("Второй", 4, 3)

    player1.getDamage(player2.impactForce)
    player1.heal()
    player2.getDamage(player1.impactForce)
    player2.heal()
    player1.getDamage(player2.impactForce)
    player1.heal()
}