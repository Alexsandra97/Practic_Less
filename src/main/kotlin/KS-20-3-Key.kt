class Player(val hasKey: Boolean)

fun main() {
    val player = Player(false)
    val hasKey: (Player) -> String =
        fun(player: Player) = if (player.hasKey) "Дверь открыта"
        else "Дверь заперта"

    println(hasKey.invoke(player))
}