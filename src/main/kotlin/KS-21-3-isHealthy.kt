class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}

fun  main() {
    val player = Player("игрок", 4, 5)
    println(player.isHealthy())
}