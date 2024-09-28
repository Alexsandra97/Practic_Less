fun main() {

    val roomCard: RoomCard = RoomCard(
        cover = "cover_image.png",
        name = "Комната 1",
        listParticipants = listOf()

    )

    roomCard.addParticipant()
    println("${roomCard.cover}\n${roomCard.name}\n${roomCard.listParticipants.status}\n${roomCard.listParticipants.nickname}")

}

class RoomCard(
    val cover: String,
    val name: String,
    val listParticipants: List<User>
) {
    fun addParticipant() {
        val user: User = User(
            nickname = "",
            status = ""
        )

    }
}

class User(
    var nickname: String,
    var status: String,
)