class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

fun main() {
    val player = Player("Игрок", 4, 10)
    val healingPotion: (Player) -> Int =
        fun(player: Player) = player.maxHealth
    player.currentHealth = healingPotion.invoke(player)
    println(player.currentHealth)
}

