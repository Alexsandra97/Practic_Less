class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun Player.isHealthy(): Boolean {
    if (this.currentHealth == this.maxHealth) return true
    else return false
}

fun  main() {
    val player = Player("игрок", 4, 5)
    println(player.isHealthy())
}