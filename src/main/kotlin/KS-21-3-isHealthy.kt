class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun Player.isHealthy() {
    if (this.currentHealth == this.maxHealth) println(true)
    else println(false)
}

fun  main() {
    val player = Player("игрок", 5, 5)
    player.isHealthy()
}