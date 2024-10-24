class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun main() {
    val player = Player("Игрок1", 4, 10)
    val healingPotion: (Player) -> Unit = { it: Player -> player.currentHealth = player.maxHealth }
    healingPotion.invoke(player)
    println(player.currentHealth)
}

